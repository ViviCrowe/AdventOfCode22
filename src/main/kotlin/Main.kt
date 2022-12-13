import Day1.Calories
import Day2.RockPaperScissors
import Day3.Rucksack
import Day4.Cleanup

fun main() {
    println("Day1:")
    val calories = Calories()
    var result = calories.findMostCalories("src/main/kotlin/Day1/part1.txt")
    println(result)
    result = calories.findThirdMostCaloriesTotal("src/main/kotlin/Day1/part1.txt")
    println(result)
    println()

    println("Day2:")
    val rockPaperScissors = RockPaperScissors()
    result = rockPaperScissors.howManyPoints("src/main/kotlin/Day2/day2.txt")
    println(result)
    result = rockPaperScissors.howManyPoints2("src/main/kotlin/Day2/day2.txt")
    println(result)
    println()

    println("Day3:")
    val rucksack = Rucksack()
    result = rucksack.getPriority("src/main/kotlin/Day3/day3.txt")
    println(result)
    result = rucksack.getPriority2("src/main/kotlin/Day3/day3.txt")
    println(result)
    println()

    println("Day4:")
    val cleanup = Cleanup()
    result = cleanup.findPairs("src/main/kotlin/Day4/day4.txt")
    println(result)
    result = cleanup.findOverlaps("src/main/kotlin/Day4/day4.txt")
    println(result)
    println()

}
