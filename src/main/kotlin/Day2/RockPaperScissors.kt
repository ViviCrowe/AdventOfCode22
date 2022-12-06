package Day2

import java.io.File

class RockPaperScissors {
    fun howManyPoints(filename: String): Int {
        val list: ArrayList<String> = fileToArray(filename)
        var points = 0
        var i = 0
        while(i < list.size) {
            if((list[i] == "A" && list[i+1] == "X") || (list[i] == "B" && list[i+1] == "Y")
                || (list[i] == "C" && list[i+1] == "Z")) {
                points += 3
            } else if ((list[i] == "A" && list[i+1] == "Y") || (list[i] == "B" && list[i+1] == "Z")
                || (list[i] == "C" && list[i+1] == "X")) {
                points += 6
            }

            points += if(list[i+1] == "X") {
                1
            } else if (list[i+1] == "Y") {
                2
            } else {
                3
            }
            i += 2
        }
        return points
    }

    fun howManyPoints2(filename: String): Int {
        val list: ArrayList<String> = fileToArray(filename)
        var points = 0
        var i = 0
        while(i < list.size) {
            points += if((list[i] == "A" && list[i+1] == "X") || (list[i] == "B" && list[i+1] == "Z")
                || (list[i] == "C" && list[i+1] == "Y")) {
                3
            } else if ((list[i] == "A" && list[i+1] == "Z") || (list[i] == "B" && list[i+1] == "Y")
                || (list[i] == "C" && list[i+1] == "X")) {
                2
            } else {
                1
            }

            points += if(list[i+1] == "X") {
                0
            } else if (list[i+1] == "Y") {
                3
            } else {
                6
            }
            i += 2
        }
        return points
    }

    private fun fileToArray(filename: String): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()

        File(filename).readLines().forEach {
            val parts = it.split(" ")
            list.addAll(parts)
        }
        return list
    }

}
