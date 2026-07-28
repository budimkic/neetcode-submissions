class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val count = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            count[s[i]] = (count[s[i]] ?: 0) + 1
            count[t[i]] = (count[t[i]] ?: 0) - 1
        }
        return count.values.all { it == 0 }
    }
}
