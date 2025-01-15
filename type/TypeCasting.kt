fun main(){
    var a = 10.0

    var c : Int = a.toInt(); // 객체형은 타입 캐스팅 (형변환) 메소드가 필요하다.
    println(c)

    val anyValue: Any = "Hello"

    // is / is?
    if(anyValue is String){
        println("String")

        // as / as?
        val strValue: String = anyValue as String
        println(strValue)

    } else {
        println("Any");
    }
    // 10
    // String
    // Hello
}