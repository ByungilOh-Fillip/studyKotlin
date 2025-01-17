open class Animal(){

    init{
        println("Animal 호출")
    }
}

class Dog() : Animal(){

    init{
        println("Dog 호출")
    }
}

open class BasePerson(name:String, age:Int, club:String){
    var name: String=name
    var age:Int=age
    var club: String = club

    fun talk(){
        println("$club $name 이고 $age 입니다.")
    }

    fun walk(){
        println("$name 는 걷는다")
    }

    open fun speakAge(){
        println("I'm ${age} years old")
    }
}

class FootballPlayer(name:String, age:Int, club:String): BasePerson(name,age,club){

    init{
        println("$name,$age,$club")
    }

    fun playFootball(){
        println("Play Football..")
    }

}

class SuperStar(name:String, age:Int, club:String) : BasePerson(name,age,club){
    override fun speakAge(){
        println("I'm ${super.age-5} years old officially")
    }
}

fun main(){
    var a : Animal = Animal()
    var d : Dog = Dog()

    var person01 = FootballPlayer("Min",25,"Seoul")
    var superStar = SuperStar("curry",30,"Seoul");

    person01.playFootball()
    person01.talk()
    person01.walk()
    person01.speakAge()

    superStar.speakAge()
}