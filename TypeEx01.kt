
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

    var stringValues: String = "Hello Kotlin String Hello Kotlin String"

    println( stringValues.indexOf("Ko"))        // 6
    println( stringValues.lastIndexOf("Ko"))    // 26
    println( stringValues.startsWith("He"))     // true
    println( stringValues.endsWith("ng"))       // false
    println( stringValues.contains("ri"))       // true

    var replaceValue: String = stringValues.replace("Kotlin","Java") // Hello Java String Hello Java String

    println(replaceValue)

    var formatValue: String = String.format("%s %s","Hello", "Kotlin")
    println(formatValue)

    var trimValue = "Hello ".trim()
    println(trimValue)

    var stringBuilder1: StringBuilder = StringBuilder()
    var stringBuilder2: StringBuilder = StringBuilder("Hello Kotlin String")
    var stringBuilder3: StringBuilder = StringBuilder(10)
    
    println( stringBuilder1.length )        // 0
    println( stringBuilder2.length )        // 19

    println( stringBuilder3.capacity());    // 10
    println( stringBuilder2.capacity());    // 35

    stringBuilder2.append(" 123")
    stringBuilder2.append(" 456")

    println( stringBuilder2 )                   // Hello Kotlin String 123 456

    stringBuilder2.insert(0, "String ")
    println( stringBuilder2 )                   // String Hello Kotlin String 123 456

    stringBuilder2.delete(0,7)
    println(stringBuilder2)                     // Hello Kotlin String 123 456

    stringBuilder2.deleteCharAt(0)
    println(stringBuilder2)                     // ello Kotlin String 123 456

    stringBuilder2.reverse()
    println(stringBuilder2)                     // 654 321 gnirtS niltoK olle
    println(stringBuilder2.substring(0 .. 5))   // 654 32
    println(stringBuilder2[0])                  // 6
    println(stringBuilder2[1])                  // 5

    var tempValue: String = stringBuilder2.toString()
    println(tempValue)                          // 654 321 gnirtS niltoK olle
}