package easy

class SumOfTwo {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        //indices in nums such that its equal to taregt
        //each input would have exactly one solution
        //what happens if it doesnt find the solution?

        //target = index 1 + index 2
        // index2 = target - index[1]

        val hashMap : HashMap<Int, Int> = HashMap()

        for(i in nums.indices) {
            hashMap[i] = nums[i]
        }

        var result = IntArray(2)

        hashMap.forEach { (key, value) ->
            val compliment = target - value
            val keys = hashMap.filterValues { it == compliment }.keys

            println("keys - $keys")

            if(hashMap.containsKey(compliment) && hashMap.get(compliment) != key) {
                result = intArrayOf(key, hashMap.get(compliment)!!)
            }
        }




        return if(result.isNotEmpty()) result else throw IllegalArgumentException("No two sum solution")

    }
}

fun main(args: Array<String>) {
    SumOfTwo().twoSum(intArrayOf(
        2,7,11,15), 9)
}