fun main() {
    println("Enter the amount you'd wish to convert: ")
    var amount= readLine()!!.toInt()

    println("is that (U) for Ugandan Shillings or (K) for Kenyan Shillings?")
    var currency=readLine()!!
    if (currency=="U"){
        var ugandansh= amount / 0.030
        println("That is $ugandansh Kenyan shillings ")
    }
    if (currency=="K"){
        var kenyansh=amount * 0.030
        println("That is $kenyansh in Ugandan Shillings")
    }

}



