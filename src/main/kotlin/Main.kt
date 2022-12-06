import Day1.Calories
import Day2.RockPaperScissors

fun main() {
   /* val calories = Calories()
    var result = calories.findMostCalories("src/main/kotlin/Day1/part1.txt")
    println(result)
    result = calories.findThirdMostCaloriesTotal("src/main/kotlin/Day1/part1.txt")
    println(result) */

    val rockPaperScissors = RockPaperScissors()
    var result = rockPaperScissors.howManyPoints("src/main/kotlin/Day2/day2.txt")
    println(result)
    result = rockPaperScissors.howManyPoints2("src/main/kotlin/Day2/day2.txt")
    println(result)
}
