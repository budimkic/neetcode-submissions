class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {
            val charArray = s.toCharArray()
            charArray.sort()
            val key = String(charArray)
            map.getOrPut(key) { mutableListOf() }.add(s)
        }
        return map.values.toList()
    }
}
