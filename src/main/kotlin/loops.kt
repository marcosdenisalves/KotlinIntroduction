fun main() {
    var alphabet = "abcdefghijklmnopqrstuvwxyz"
    lettersLoop(alphabet)
}

fun basicLoop(text:String){
    for(i in 0..text.length-1)
        println("index:$i ${text[i]}")
}

fun downLoop(text:String) {
    for(i in text.length-1 downTo 0)
        println("index:$i ${text[i]}")
}

fun untilLoop(text:String) {
    for(i in 0 until text.length)
        println("index:$i ${text[i]}")

}

fun stepLoop(text:String, num:Int) {
    for(i in 0..text.length-1 step num)
        println("index:$i ${text[i]}")

}

fun lettersLoop(text:String) {
    for(i in text)
        print("${i.toUpperCase()} ")
}

fun forEachLoop(text:String) {
    text.forEach{x ->
        print("$x ")
    }
}
