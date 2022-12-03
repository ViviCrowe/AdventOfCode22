package Day1

import java.io.File

class Calories {
    fun findMostCalories(filename: String): Int {
        val list: ArrayList<Int> = fileToArray(filename)

        list.sortDescending()

        return list.first()
    }

    fun findThirdMostCaloriesTotal(filename: String): Int {
        val list: ArrayList<Int> = fileToArray(filename)

        list.sortDescending()
        var sum = 0
        for (i in 0..2) {
            sum += list.elementAt(i)
        }

        return sum
    }

    private fun fileToArray(filename: String): ArrayList<Int> {
        val list: ArrayList<Int> = ArrayList()
        var sum = 0
        File(filename).readLines().forEach {
            if (it == "") {
                list.add(sum)
                sum = 0
            } else {
                sum += it.toInt()
            }
        }

        list.add(sum)

        return list
    }

}