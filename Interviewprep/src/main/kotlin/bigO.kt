import java.sql.Timestamp

val nemo = arrayOf("nemo")

val everyone = arrayOf("dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank")

fun main(args: Array<String>) {
    findNemo(everyone) // O(n) ---> LINEAR TIME

    compressFirstBox(boxes) //as inputs increase the operation will still be 1, CONSTANT TIME O(1)

    logFirstTwoBoxes(boxes) // O(2)

    //as inputs increase the number of operations increase linearly
}

fun findNemo(array: Array<String>) {
    val t0 = Timestamp(System.currentTimeMillis())
    for (element in array) {
       if(element == "nemo") {
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
    for (element  in input) {
        val x = element + 1; //O(n)
        val y = element + 2;//O(n)
        val z = element + 3;//O(n)

    }
    for (element2  in input) {
        val p = element2 * 2 //O(n)
        val q = element2 * 2 //O(n)
    }
    val whoAmI = "I don't know";//O(1)

    //total - O(4+5n) --->> O(n)

    // RULE 1: BIG O takes the worst case scenario, not the best case, finding nemo as a first item in array is best case, As a last item is the worst case
    // BIG O doesnt care about anything else apart from worst case

    // RULE 2: drop the constants ex: O(2n + 3) / O(n+900) = O(n)

    //RULE 3:
}


