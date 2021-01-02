package easy

class RemoveElement {
    fun removeElement(nums: IntArray, value: Int): Int {
        val i = 0
        if(nums.isNotEmpty()) {
          for(j in nums.indices) {
              if(nums[j] != value) {
                  nums[i] = nums[j]
                  i.plus(1)
              }
          }
        }
        return i
    }
}


fun main(args: Array<String>) {
}