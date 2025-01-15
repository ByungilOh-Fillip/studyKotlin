

import doDefaultFunc
fun sub(str : String) {
    println("sub 함수 호출 : $str")
}

fun func( func: (String) -> Unit){
    func("func 힘수 호출")
}

fun doFunc(){
    println("doFunc() 호출")
}

fun doFunc(s:String) {
    println("doFunc($s) 호출")
}

fun doDefaultFunc(data : Int=2){
    println("data: $data")
}

fun main(){
    func(::sub)
    doFunc()
    doFunc("Hello")
    doDefaultFunc(10)
    doDefaultFunc()
}