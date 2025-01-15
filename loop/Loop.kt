fun main(){
    for ( i in 1..9 step 2){
        println(i)
    }

    for ( i in 9 downTo 1 step 2){
        println(i)
    }

    for ( i in 'a' .. 'e'){
        println(i)
    }

    var alpha: String = "abcdefgh"
    for(i in alpha){
        println(i)
    }

    var i: Int=0
    outer@
    while(i<=5){
        var j: Int=0

        while(j<=5){
            if(j==3)break@outer

            println("$i + $j")
            j++
        }
        i++
    }

    var arrValue = arrayOfNulls<Int>(3)
    var intArr: IntArray = intArrayOf(0,2,4,5,6)

    //var arrValue: Array<Array<Int>> = Array<Array<Int>>(3){ Array<Int>(3){ 0 } }
    var arrValue2: Array<Array<Int>> = arrayOf(
        arrayOf(1,2,3), 
        arrayOf(4,5,6)
    )

    // arrValue.forEach({
    //     println( it )
    // })

    println(arrValue.contentToString())

    for(i in arrValue2.indices){
        for(j in arrValue2[0].indices){
            println(arrValue2[i][j])
        }
    }

    for(i in arrValue2.indices){
        println(arrValue2[i].contentToString())
    }

    // immu - List
    // mu - MutableList

    // var listValue: List<Int> = arrayListOf<Int>(5,3,2,1,6)
    var listValue: List<Int> = listOf(5,3,2,1,6)

    println(listValue)

    var readOnlyList: List<String> = listOf("Kevin","Kotlin","Korea")

    for(i in 0..readOnlyList.size-1){
        println(readOnlyList.get(i))
    }

    readOnlyList.forEach({
        println(it)
    })

    //indexOf
    println(readOnlyList.indexOf("Kotlin"))


    // Mutable
    var muList: MutableList<String> = mutableListOf("Kevin","Kotlin","Korea")

    muList.add("Kubernetes")
    println(muList)

    muList.add(1,"KIA")
    println(muList)

    muList.remove("Kevin")
    println(muList)

    muList.removeAt(2)
    println(muList)

    muList.shuffle()
    println( muList )

    muList.sort()
    println( muList )

    
}