package medium

import easy.SplStringComparision

class FNLPositionsOfTarget {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val targetRange = intArrayOf(-1, -1)

        if (nums.isNotEmpty()) {
            if(nums.contains(target)) {
                for (i in nums.indices) {
                    if(nums[i] == target) {
                        targetRange[0] = i
                        break
                    }
                }

                for (j in nums.size - 1 downTo 0) {
                    if(nums[j] == target) {
                        targetRange[1] = j
                        break
                    }
                }

                return targetRange

            } else return targetRange
        }
        return  targetRange // array is empty
    }
}


fun main(args: Array<String>) {
    (FNLPositionsOfTarget().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).forEach { println(it) })
    (FNLPositionsOfTarget().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).forEach { println(it) })
}