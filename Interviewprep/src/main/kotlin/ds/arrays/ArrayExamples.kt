package ds.arrays

import java.util.*
import javax.swing.text.html.HTMLDocument

class ArrayExamples {

    fun arrayExamples() {
        //organises sequentially

        //they are stored in ORDER

        //TABLE : look up (O(1))
        // PUSH (O(1))
        // INSERT (O(n)) - expensive
        // DELETE (O(n)) - expensive

        //push pop operations

        val stringArray = arrayOf("1", "2", "3")
        val randomArrays = arrayOf("1", 2, 4)

        //operations available on kotlin:
        // set, get any, all, indices( array), size,

        stringArray.forEach { println(it) }

        //in kotlin we need to shift right or left manually O(n)

        //splicing - middle of the array - adding an element and shift right

        //array operations
        val nums = arrayOf(1, 2, 3, 4, 5, 21, 6, 7, 8, 9, 10)

        //slice
        //val nums13 = nums.sliceArray(1..3)

        println(nums.first())
        println(nums.last())
        println(nums.indexOf(4))
        println(nums.get(0))
        println(nums.set(0, 0))

        //ARRAY TYPES:
        //static and dynamic arrays.

        //traversals
        nums.forEach { println("traversal: $it") }
        nums.forEachIndexed { i, e -> println("traversal: $i and its $e") }
        val it: Iterator<Int> = nums.iterator()

        while (it.hasNext()) {
            println("prints through an iterator: ${it.next()}")
        }

        //sorting :
        println("sorted array:")
        val sortedNums = nums.sortedArray()
        sortedNums.forEach { println(it) }


        //two dimensional array
        val array = arrayOf(intArrayOf(1, 2),
            intArrayOf(3, 4),
            intArrayOf(5, 6, 7))

        println(Arrays.deepToString(array))

        //filtering
        val numsFilt = arrayOf(1, -2, 3, 4, -5, 7)

        numsFilt.filter { e -> e > 0 }.forEach { e -> println("$e ") }

        //similarly any, all, reduce

        val exampleNums = intArrayOf(2, 3, 4, 5, 6, 7)

        val total = exampleNums.reduce { product, next -> product * next }
        println("total after reduce: $total")


        //NOTE: O(n) - for append for DYNAMIC ARRAYS so its expensive
    }
}

fun main(args: Array<String>) {
    ArrayExamples().arrayExamples()
}