class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val currentValue = nums[i]
            val complement = target - currentValue
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[currentValue] = i
        }
        return intArrayOf()
    }
}
