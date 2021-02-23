fun main() {
    println("Enter your weight: ")
    var weight= readLine()!!.toFloat()

    println("Is that in (L) for pounds or (K) for kgs?")
    var answer=readLine()!!
    if (answer=="L"){
        var pounds= weight * 0.453592
        kotlin.io.println("You weigh $pounds in lbs")
    }
    if (answer=="K"){
        var kg=weight/0.453592
        kotlin.io.println("You weigh $kg in lbs")
    }

}



