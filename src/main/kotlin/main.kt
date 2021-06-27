fun main() {
    var x:Int? = 1
    var w:Int? = null
    var t:String? = x!!.getStudentStatus()
    println(t)
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