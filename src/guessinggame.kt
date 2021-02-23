fun main() {
    var maxtries=3
    var numberOfTries=1
    var secretnumber=5

    println("Im thinking of a number. The number lies between 0 and 10. Guess the number ")

    while (numberOfTries<maxtries) {
        var guess=readLine()!!.toInt()
        numberOfTries += 1

        if (guess > secretnumber) {
            println("That is too large, Guess again ")

        }

        else if (guess < secretnumber) {
                println("That is too small, guess again")


            } else if (guess == secretnumber) {
                println("you guessed right")
                System.exit(-1)


            }
        }


    }



