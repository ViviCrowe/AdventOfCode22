package Day4

import java.io.File

class Cleanup {

    fun findPairs(filename: String): Int {
        val list = fileToArray(filename)
        var count = 0
        for (i in list.indices step 4) {
            if (list[i] >= list[i+2] && list[i+1] <= list[i+3]) {
                count++
            }
            else if(list[i] <= list[i+2] && list[i+1] >= list[i+3]) {
                count++
            }
        }
        return count
    }

    fun findOverlaps(filename: String): Int {
        val list = fileToArray(filename)
        var count = 0
        for (i in list.indices step 4) {
            if (list[i] >= list[i+2] && list[i] <= list[i+3]) {
                count++
            }
            else if(list[i+1] >= list[i+2] && list[i+1] <= list[i+3]) {
                count++
            }
            else if(list[i] <= list[i+2] && list[i+1] >= list[i+3]) {
                count++
            }
        }
        return count
    }

    private fun fileToArray(filename: String): ArrayList<Int> {
        val list: ArrayList<Int> = ArrayList()
        File(filename).readLines().forEach {
            (it.split('-', ',')).forEach { iter ->
                list.add(iter.toInt())
            }
        }
        return list
    }



}
