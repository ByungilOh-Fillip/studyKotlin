fun main(){
    val score: Int = 85
    
    val grade: String = when( score ){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "A"
        else -> "F"
    }

    println("Grade: $grade")
}