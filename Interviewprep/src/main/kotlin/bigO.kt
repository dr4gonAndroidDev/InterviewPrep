import java.sql.Timestamp

// big O is all about scalability - how does the algo behaves when theres a huge SCALE.
//CHECK https://www.bigocheatsheet.com/

val nemo = arrayOf("nemo")

val everyone = arrayOf("dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank")

fun main(args: Array<String>) {
    //findNemo(everyone) // O(n) ---> LINEAR TIME

    //compressFirstBox(boxes) //as inputs increase the operation will still be 1, CONSTANT TIME O(1) (GOOD)

    //logFirstTwoBoxes(boxes) // O(2) (GOOD)

    val boxList = arrayListOf(1, 2, 3, 4, 5)

    //logAllPairsOfArray(boxList) //O(n^2) - nested loops (Quadratic Time) (HORRIBLE)

    //as inputs increase the number of operations increase linearly
}


fun logAllPairsOfArray(boxList: ArrayList<Int>) {
    for (i in boxList.indices) {
        for (j in boxList.indices) {
            print(" \n $i and $j")
        }
    }
}

fun findNemo(array: Array<String>) {
    val t0 = Timestamp(System.currentTimeMillis())
    for (element in array) {
        if (element == "nemo") {
            print("Found Nemo")
        }
    }
    val t1 = Timestamp(System.currentTimeMillis())

    print(" That Call took : ${t1.time - t0.time}")
}

fun compressFirstBox(box: Array<String>) {
    print(box[0])
}

val boxes = arrayOf("1", "2", "3", "4", "5")
fun logFirstTwoBoxes(box: Array<String>) {
    print(box[0]) // O(1)
    print(box[1]) // O(1)
}

// What is the Big O of the below function? (Hint, you may want to go line by line)
fun funChallenge(input: Array<Int>): Int {
    var a = 10; //O(1)
    a = 50 + 3; //O(1)

    for (element in input) { //O(n)
        //anotherFunction() //O(n)
        val stranger = true// O(n)
        a++// O(n)
    }
    return a // O(1)
    //BIG O notation (3+4n) --->> O(n)
}

// What is the Big O of the below function? (Hint, you may want to go line by line)
fun anotherFunChallenge(input: Array<Int>) {
    val a = 5; //O(1)
    val b = 10; //O(1)
    val c = 50;//O(1)
    for (element in input) {
        val x = element + 1; //O(n)
        val y = element + 2;//O(n)
        val z = element + 3;//O(n)

    }
    for (element2 in input) {
        val p = element2 * 2 //O(n)
        val q = element2 * 2 //O(n)
    }
    val whoAmI = "I don't know";//O(1)

    //total - O(4+5n) --->> O(n)

    // RULE 1: BIG O takes the worst case scenario, not the best case, finding nemo as a first item in array is best case, As a last item is the worst case
    // BIG O doesnt care about anything else apart from worst case

    // RULE 2: drop the constants ex: O(2n + 3) / O(n+900) = O(n) (FAIR)

    //RULE 3: different inputs have different terms
    fun compressBoxesTwice(boxes1: Array<Int>, boxes2: Array<Int>) {
        boxes1.forEach { print(it) } // O(m)

        boxes2.forEach { print(it) } // O(n)

        //Total : O(m+n)
    }

    fun nonSensicleCompressBoxes(boxes1: Array<Int>, boxes2: Array<Int>) {
        boxes1.forEach {
            boxes2.forEach { print(it) } // O(n*m) (HORRIBLE)

            //Total : O(m*n) nested loops - different inputs
        }
    }

    //RULE 4: worry about the most dominant term
    fun printAllNumbersThenAllPairsSums(number: ArrayList<Int>) {
        print("These are the numbers")
        number.forEach {
            print("\n $it") // O(n)
        }
        print("These are their sums")
        number.forEach { firstNumber ->
            number.forEach { secondNumber -> firstNumber + secondNumber } // O(n^2)
        }

        //TOTAL :  O(n) +  O(n^2) = O(n + n^2) -> O(n^2) --- most imp term, DROP THE insignificant term.
    }

    //O(n!) OH NO most expensive = Factorial Time ; adding a nested loop with every encounter WORST EVER

    //O(n!) OH NO most expensive = Factorial Time ; adding a nested loop with every encounter WORST EVER

    //O(2^n) &  O(n^2) [A little better than 2^n] WORST TOO!



    //SPACE COMPLEXITY
    fun boooo(n:ArrayList<Int>) {
        // has a space complexity of O(1) - since its a fixed array
        for (i in n.indices) { print(i) }
    }

    fun fillMeUpDaddy(n: ArrayList<String>):  ArrayList<String> {

        //has a space complexity of O(n)
        val hiArray = ArrayList<String>() //created new data structure

        for (i in n.indices) {
            hiArray[i] = "hi"
        }

        return hiArray
    }

    //TRICK QUESTION: whats the length of a string -- depends on a language in JS its just a look up so its O(1)
}


