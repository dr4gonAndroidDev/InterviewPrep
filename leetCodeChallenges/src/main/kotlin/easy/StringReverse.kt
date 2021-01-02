package easy

class StringReverse {
    fun reverse(s: String): String {
        val charArray = s.toCharArray() //s - O(n)
        val reversedStringArrayList = arrayListOf<Char>()  //s - O(1)

        for(i in charArray.indices) {
            reversedStringArrayList.add(charArray[(charArray.size - 1) - i]) // T -  O(n), s - O(n)
        }

        return reversedStringArrayList.joinToString("")
    }

    fun reverse2(s: String): String {
         return s.toCharArray().reversed().joinToString("")
    }

    fun reverse3(s: String): String {
        return s.toCharArray().foldRight(String(), { next, acc ->
            acc + next
        })
    }
}

fun main(args: Array<String>) {
    // 'hsemriN'
    println(StringReverse().reverse2("hsemriN"))
    println(StringReverse().reverse3("looc si hsemriN"))
    println(StringReverse().reverse("hsemriN"))
}