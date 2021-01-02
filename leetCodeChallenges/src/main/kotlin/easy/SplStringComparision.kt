package easy

class SplStringComparision {
    fun isValid(s: String): Boolean {
        val stack: MutableList<Char> = mutableListOf()

        fun isStackEmpty() = stack.isEmpty()
        fun push(char: Char) = stack.add(char)
        fun pop() : Any? {
            val item = stack.lastOrNull()
            if (!isStackEmpty()){
                stack.removeAt(stack.size -1)
            }
            return item
        }

        val mappings : HashMap<Char, Char> = HashMap()
        mappings.apply {
            put(')', '(')
            put('}', '{')
            put(']', '[')
        }

        s.toCharArray().forEach {
            if(mappings.containsKey(it)) {
                val topChar = if(isStackEmpty()) '#' else pop()

                if(topChar != mappings[it]) return false
            } else {
                push(it)
            }
        }

        return isStackEmpty()
    }
}


fun main(args: Array<String>) {
    println(SplStringComparision().isValid("([)]"))
    println(SplStringComparision().isValid("()"))
}