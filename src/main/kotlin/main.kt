fun main() {
    val grade = (0..10).random()
    println(grade.getStudentStatus())

//    var t:Int
//    var x:Int? = null
//    var o:Int? = 10
//    t = x
}

fun Int.getStudentStatus():String{
    println("nota $this")

    return when (this) {
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }
}