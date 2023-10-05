class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var smallLen = 2001
        var smallStr = ""
        var index = 0

        for (str in strs)  {
            if (str.isEmpty()) { return "" }
            if (str.length < smallLen) {
                smallLen = str.length
                smallStr = str
            }
        }

        while (index < smallLen) {
            for (string in strs) {
                if (string[index] != smallStr[index]) {
                    return smallStr.substring(0, index)
                }
            }
            index++
        }
        return smallStr.substring(0, index)
    }
    
}