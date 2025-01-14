
fun main() {
    var data1: Boolean = true

    println(data1)  // true

    var x: Int = 10
    var y: Int = 5

    println(x>y)    //true
    println(x==10)  //true

    val byteValue: Byte = 127
    val shortValue: Short = 32767
    val intValue: Int = 2147483647
    val longValue: Long = 9223372036854775807L
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.141592653589793

    val uByteValue: UByte = 255u
    val uIntValue: UInt = 4294967295u

    println( byteValue )    // 127
    println( uByteValue )   // 255


    val value1 = 2147483647
    // val value2: Int = 9223372036854775807L mismatch

    println(value1)                     //2147483647
    println(value1 :: class.simpleName) // Int

    val numValue1: Int = 0xFF
    val numValue2: Int = 0b11

    println(numValue1) // 255
    println(numValue2) // 3

    val numValue21: Long = 3_000_000_000
    val numValue22: Long = 0xFF_EC_DE_5E
    val numValue23: Long = 0b11010010_01101001_10010100_10010010

    println(numValue21) // 3000000000
    println(numValue22) // 4293713502
    println(numValue23) // 3530134674


    var a: Int = 10000
    var boxedA: Int = a
    var anotherBoxedA: Int? = a

    // 저장된 값이 작은 수 = 기본형 .. 변형
    // ? : null = 객체 형태

    // 자바 : 기본 자료형(객체 X) / wrapper(O)

    println(a)              // 10000
    println(boxedA)         // 10000
    println(anotherBoxedA)  // 10000

    // == : 값을 비교 (equals)
    // === : 주소를 비교 (deprecated)

    println(boxedA == anotherBoxedA)    // true
    println(boxedA === anotherBoxedA)   // false


    var num1=1.0
    var num2=1.0f

    println(num1 :: class.simpleName)   // Double
    println(num2 :: class.simpleName)   // Float

    // char

    var charValue: Char = 'a'
    var charValue2: Char = '가'

    println(charValue)  // a
    println(charValue2) // 가


    // 문자열
    var stringValue1 : String = "Hello"
    var stringValue2 : String = """Hello
    Kotlin"""
    // Hello
    //      Kotlin

    println(stringValue1)
    println(stringValue2)

    // String(immutable) / String Buffer, StringBuilder(mutable)
    var stringBuffer: StringBuffer = StringBuffer("Hello Kotlin")
    var stringBuilder: StringBuilder = StringBuilder("Hello Kotlin")

    println(stringBuffer)
    println(stringBuilder)


    var stringValue: String = "Hello Kotlin String/Hello/Kotlin/String"

    println(stringValue)
    println("문자열의 길이 : ${stringValue.length}")                // 19
    println("문자열의 분리  : ${stringValue.substring(5)}")         //  Kotlin String
    println("문자열의 분리  : ${stringValue.substring(5, 9)}")      //  Kot
    println("문자열의 분리  : ${stringValue.substring(5 until 9)}") //  Kot
    println("문자열의 분리  : ${stringValue.substring(6 .. 9)}")    // Kotl

    // 구분자로 분리
    var splitValue = stringValue.split(" ")
    println(splitValue) // [Hello, Kotlin, String/Hello/Kotlin/String]
    splitValue = stringValue.split(" ", limit=2)
    println(splitValue) // [Hello, Kotlin String/Hello/Kotlin/String]
    splitValue = stringValue.split(" ", "/")
    println(splitValue) // [Hello, Kotlin, String, Hello, Kotlin, String]

    // 글자갯수로 분리
    var chunkedValue1 = stringValue.chunked(3); // [Hel, lo , Kot, lin,  St, rin, g/H, ell, o/K, otl, in/, Str, ing]
    println(chunkedValue1)
    chunkedValue1 = stringValue.chunked(5);     // [Hello,  Kotl, in St, ring/, Hello, /Kotl, in/St, ring]
    println(chunkedValue1)

    // 대소문자
    println( stringValue.lowercase())   // hello kotlin string/hello/kotlin/string
    println( stringValue.uppercase())   // HELLO KOTLIN STRING/HELLO/KOTLIN/STRING
}