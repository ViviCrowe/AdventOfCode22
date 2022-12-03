import Day1.Calories

fun main() {
    val calories = Calories()
    var result = calories.findMostCalories("src/main/kotlin/Day1/part1.txt")
    println(result)
    result = calories.findThirdMostCaloriesTotal("src/main/kotlin/Day1/part1.txt")
    println(result)
}