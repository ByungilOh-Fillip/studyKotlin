var data11: Int = 1234
val data12: Int = 1234
var name1: String = "Tom"
lateinit var name2: String // 지연 초기화

// 상수
const val data13 : Int =1234

fun initialize(){
    name2="Kevin"
}

fun main(){
    var data : Int =1234
    var intValue1: Int = 1234
    var intValue2 = 1234 // 타입 자동 지정

    var noNullableString: String = "Hello"
    var nullableString: String? = "Hello"

    // 재선언 가능
    val data12: Int =2345

    //main(멤버구역)에서는 상수 선언 불가능
    //const val data23: Int=1234


    println("data : " + data)
    //string template
    println("data : $data")

    println("data : $data + 1")
    println("data : ${data+1}")

    println("data11 : "+data11)
    println("data12 : "+data12)
    println("data13 : "+data13)

    println("intValue1 : "+intValue1)
    println("intValue2 : "+intValue2)

    println(intValue1 is Int)
    println(intValue2 is String)

//     VariableEx01.kt:32:13: warning: check for instance is always 'true'.
//     println(intValue1 is Int)
//             ^^^^^^^^^^^^^^^^
//     VariableEx01.kt:33:13: warning: check for instance is always 'false'.
//     println(intValue2 is String)
//             ^^^^^^^^^^^^^^^^^^^

    println(nullableString is Int) // Int 타입은 아예 가정되지 않음 null에 대한 처리만 허용
    // noNullableString=null -> 성립하지 않음    
    nullableString = null

    println("noNullable : "+noNullableString)
    println("nullable : "+nullableString)


    println(name1)

    initialize() 
    println(name2) // 지연 초기화도 초기화 없이 출력 시 에러 발생 -> kotlin.UninitializedPropertyAccessException
}


// ➜  Kotlin git:(main) ✗ kotlinc VariableEx01.kt -include-runtime -d VariableEx01.jar
// ➜  Kotlin git:(main) ✗ java -jar VariableEx01.jar 

// 출력
// data : 1234
// data : 1234
// data : 1234 + 1
// data : 1235
// data11 : 1234
// data12 : 2345
// data13 : 1234
// intValue1 : 1234
// intValue2 : 1234
// true
// false
// false
// noNullable : Hello
// nullable : null
// Tom
// Kevin