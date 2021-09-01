import java.text.DecimalFormat

fun main (){
    println("Ingresa tu edad: ")
    val edad = readLine()
    println("Edad: $edad")
    //------------------------------
    val pi = 3.14159
    println(DecimalFormat().format(pi))
    println(DecimalFormat("#.#").format(pi))
}