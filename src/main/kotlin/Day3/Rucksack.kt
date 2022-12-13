package Day3

import java.io.File

class Rucksack {

    fun getPriority(filename: String): Int {
        val list: ArrayList<String> = fileToArray(filename)
        var priority = 0
        for (i in list.indices step 2) {
            val character = sameChars(list[i],  list[i+1])
            priority += valueOfChar(character)
        }

        return priority
    }

    private fun valueOfChar(character: Char): Int {
        var priority: Int = character.code
        priority -= if(priority in 97..122) {
            96
        } else {
            38
        }

        return priority
    }

    private fun sameChars(string1: String, string2: String): Char {
        var sameChar = ' '
        for (i in string1) {
            val index = string2.indexOf(i)
            if(index != -1){
                sameChar = string2[index]
                break
            }
        }
        return sameChar
    }

    private fun fileToArray(filename: String): ArrayList<String> {
        val list: ArrayList<String> = ArrayList()
        File(filename).readLines().forEach {
            list.addAll(it.chunked(it.length/2))
        }
        return list
    }
}
