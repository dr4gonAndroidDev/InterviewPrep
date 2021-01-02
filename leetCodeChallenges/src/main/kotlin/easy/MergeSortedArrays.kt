package easy

class MergeSortedArrays {
    // do a check if its s string:
    private fun check(s: IntArray, u: IntArray): Boolean {
        return s.isNotEmpty() && u.isNotEmpty()
    }

    fun mergeSort(s: IntArray, u: IntArray): IntArray {
        if(check(s, u)) {
            val mergedArrays = s + u
            return mergedArrays.sorted().toIntArray()
        } else throw Exception("One of the arrays is empty")
    }
}

fun main(args: Array<String>) {
    //test cases
}