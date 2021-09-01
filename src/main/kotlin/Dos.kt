import kotlin.math.round

fun main () {
    var number = 100
    val resultado = number / 10

    println(resultado)

    number = 10
    number += 5
    println(number)
    number++
    println(number)

    val num1 = "5"
    val num2 = num1.toInt() * 2
    println("num2: $num2")
     //----------------------------
    print("Escriba numero: ")
    val valor = readLine()!!.toInt()
    val result = valor * 5
    println("Resultado: $result ")
    //-----------------------------
    val pi = 3.14159
    val redondeo = round(pi)
    println("pi redondeado $redondeo")
}