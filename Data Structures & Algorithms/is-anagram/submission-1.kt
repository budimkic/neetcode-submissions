class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val map = mutableMapOf<Char, Int>()

        for (i in s.indices) {
         val charS = s[i]
         val charT = t[i]

         map[charS] = map.getOrDefault(charS, 0) + 1
         map[charT] = map.getOrDefault(charT, 0) - 1
        }

    for ((_, count) in map) {
        if (count != 0) return false
    }
    return true 
    }
}
