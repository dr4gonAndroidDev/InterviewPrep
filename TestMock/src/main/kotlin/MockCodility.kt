
    fun main(A: Array<String>) {
        //println (solution( intArrayOf(1, 3, 6, 4, 1, 2)))
        //println (solution( intArrayOf(1, 2, 3)))
        println (solution( intArrayOf(-1, -3, 2)))
    }


    fun solution(A: IntArray): Int {
        // write your code in Kotlin

        //inputs
        //IntArray : A = [1, 3, 6, 4, 1, 2]
        // [1, 2, 3]
        // [-1, -3]

        //conditions:
        //1. range of [-1,000,000 ... 1,000,000] input

        //outputs
        //Int

        //conditions:
        //1. greater than 0
        //2. positive , int
        //3. should not occur in A
        //4. range is [1..100,000] of output

        var n = 0


        val listOfPositiveInt = A.filter { it > 0 }

        val  sortedListOfPositiveNumbers = listOfPositiveInt.sortedDescending().reversed()
        for (i in 0..sortedListOfPositiveNumbers.size) {
            if(!sortedListOfPositiveNumbers.contains(i))
                 n = i
        }
        return n
    }