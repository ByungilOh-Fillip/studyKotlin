class Animal(){

    init{
        println("Animal 호출")
    }
}

class Dog(){

    init{
        println("Dog 호출")
    }
}

fun main(){
    var a : Animal = Animal()
    var d : Dog = Dog()
}