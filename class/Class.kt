
class Person{
    var name: String = ""
    var age: Int = 0

    constructor( name: String, age:Int ) {
        println("생성자 호출")

        this.name = name
        this.age = age
    }

}

class People constructor( name: String, age:Int ){
    var name: String = ""
    var age: Int = 0

    init {
        this.name = name
        this.age = age
    }
}

class People1 ( name: String, age:Int ){
    var name: String = name
    var age: Int = age

    fun doFunc(){
        var data: String = "10"
        println( "doFunc() 호출 : ${data}")
    }

    fun doSum(data1: Int, data2: Int):Int{
        var sum = data1+data2
        return sum
    }
}

object Counter{
    var count: Int = 0

    fun countUp(){
        count++
    }

    fun countDown(){
        count--
    }

    fun clear(){
        count=0
    }
}

class People2 (var name: String = "홍길동", var age:Int = 27)

class Person2(name : String, age : Int){
    constructor(name:String) : this(name,age=20)
    constructor() : this("홍길동",26)

    var name: String = name
        get(){
            return field
        }
        set(value){
            field=value
        }
    var age : Int = age
        get(){
            return field
        }
        set(value){
            field=value
        }
}

data class Person3(val name: String, var age: Int, var gender: String)

fun main() {
    var p1: Person = Person("tester1", 20 )
    println(p1.name)
    println(p1.age)

    var p2: People = People("tester2", 22)
    println(p2.name)
    println(p2.age)

    var p3: People1 = People1("tester3", 25)
    println(p3.name)
    println(p3.age)

    p3.doFunc()
    println(p3.doSum(2, 4))

    var p4: People2 = People2("tester4", 28)
    println(p4.name)
    println(p4.age)

    var p8: People2 = People2()
    println(p8.name)
    println(p8.age)

    var p9: People2 = People2(name="박문수")
    println(p9.name)
    println(p9.age)
    
    var p10: People2 = People2(age=30)
    println(p10.name)
    println(p10.age)


    var p5: Person2 = Person2("tester5",21)
    println(p5.name)
    println(p5.age)

    var p6 : Person2 = Person2("홍길동")
    println(p6.name)
    println(p6.age)
    
    var p7 : Person2 = Person2()
    println(p7.name)
    println(p7.age)


    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    Counter.countDown()
    Counter.countDown()

    println(Counter.count)

    Counter.clear()

    val per1 = Person3("UncleBae",40,"Male")
    val (name, age, gender) = per1
    val per2 = per1.copy()
    val per3 = per1.copy(name="Ruby")

    println(name)
    println(age)
    println(gender)

    println(per1.component1())
    println(per1.component2())
    println(per1.component3())

    println(per1.hashCode())
    println(per2.hashCode())
    println(per3.hashCode())

    if(per1.equals(per2)){
        println("equals")
    }else{
        println("not equals")
    }

    if(per1.equals(per3)){
        println("equals")
    }else{
        println("not equals")
    }


}