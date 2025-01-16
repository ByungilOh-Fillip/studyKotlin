

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

fun doFunc1(){
    println("doFunc1() 호출")
}

fun doFunc2():Unit{
    println("doFunc2() 호출")
}

fun doFunc3(a: Int, b:Int){
    println("doFunc3() 호출")
}

fun doFunc4(
    a: Int,
    b: Int,
) {
    println("doFunc4() 호출")
}


// default argument / named argument
fun deliveryItem(name:String, count: Int=1, destination: String="집"){
    println("${name}, ${count}, 개를 ${destination}에 배달")
}


// IntArr형
fun sum(vararg numbers: Int){
    println(numbers.size)
    println(numbers::class.simpleName)

    for(number in numbers){
        println(number)
    }
}


fun customsort(vararg items: Int){
    var strArr: String = ""
    var lastIdx: Int = items.lastIndex

    for(item in 0..lastIdx-1){
        for(it in 0..lastIdx-1-item){
            if(items[it]>items[it+1]){
                val temp = items[it]
                items[it]=items[it+1]
                items[it+1]=temp
            }
        }
        strArr += items[item]
        strArr += " "
    }
    strArr += items[items.lastIndex]

    println(strArr)
}


fun play(){
    println("play")
}


fun manipulateTwoThree1(a:Int,b:Int) {
    println("${a} / ${b}")
}

fun manipulateTwoThree2(func:(Int,Int)->Int) {
    println(func(2,3))
}

fun main(){
    func(::sub)             // sub 함수 호출 : func 힘수 호출

    doFunc()                // doFunc() 호출
    doFunc("Hello")         // doFunc(Hello) 호출

    doDefaultFunc(10)       // data: 10
    doDefaultFunc()         // data: 2

    doFunc1()               // doFunc1() 호출
    doFunc2()               // doFunc2() 호출

    deliveryItem("선물1", 2, "우리집")                // 선물1, 2, 개를 우리집에 배달
    deliveryItem("선물2")                           // 선물2, 1, 개를 집에 배달

    sum(1,2,3)                                     // 3, IntArray, 1,2,3

    customsort(1,5,3,2)                            // 1 2 3 5

    val pl:()->Unit= ::play                        // play
    pl()

    manipulateTwoThree1( 10,20 )                   // 10 / 20
    manipulateTwoThree2( { a, b -> a + b } )       // 5 

    var arrayList: List<Int> = arrayListOf(1,2,3,4,5,6,7,8,9) // 값 변동.. 12345->123456789
    var arrayListNull = arrayListOf(null,"data1","data2","data3")

    println(arrayList)                             // [1, 2, 3, 4, 5]
    println(arrayList.filter{it%2==0})             // [2, 4]
    println(arrayList.filterNot{it%2==0})          // [1, 3, 5]
    
    println(arrayList.filterIndexed{index, i->(index)%3==0}) // [1, 4]

    println(arrayListNull.filterNotNull())                   // [data1, data2, data3]

    println( arrayList.map{it*2})
    println( arrayList.mapIndexed{index, i->index*i})
    println( arrayListNull.mapNotNull{it})

    // 조건에 의한 검사 = true / false
    // all/ any/ none/ first/ last/ single/ find/ findLast/ count/ indexOfFirst/ indexOfLast

    println( arrayList.all{it<10}) // true
    println( arrayList.any{it>10}) // false

    println( arrayList.first{it%4==0}) // 4
    println( arrayList.last{it%4==0})  // 8

    arrayList.forEach{
        println(it)
    }

    arrayList.forEachIndexed{ index, it -> println("$index : $it")}

    println( arrayList.onEach{ it + 2 } )

    // take/ takeWhile/ takeLast/ drop/ slice
    println( arrayList.take(3))
    println( arrayList.takeLast(3))
    println( arrayList.takeWhile{it<6})

}