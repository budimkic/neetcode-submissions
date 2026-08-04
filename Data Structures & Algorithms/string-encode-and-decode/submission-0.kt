class Solution {

    fun encode(strs: List<String>): String {
        val sb = StringBuilder()
        for (s in strs) {
            sb.append(s.length).append("#").append(s)
        }
        return sb.toString()
    }

    fun decode(str: String): List<String> {
            val result = mutableListOf<String>()
            var i = 0 

            while(i < str.length) {
                var j = i

                while(str[j] != '#') {
                    j++
                }

                val length = str.substring(i, j).toInt()
                val s = str.substring(j + 1, j + 1 + length)
                result.add(s)
                i = j + 1 + length
            }
        return result
    }
}
