import java.util.*
fun main(){
    ejemplo()
    ejemplo()
   mostrarDatos("Paulo", 34)
   println(ejemplo2("Hugo"))
    println(calcularImpuestos(100_000.0,5.00))
    println(calcularImpuestos(200_000.0))
    println(calcularImpuestos2(salario = 50000.00))
}
fun ejemplo(){
    println("""
        Hola desde Kotlin 
        fecha: ${Date()}
    """.trimIndent())
}

fun mostrarDatos(nombre: String, edad: Int){
    println("nombre: $nombre y Edad: $edad")
}

fun ejemplo2(nombre:String) : String {
    return "hola $nombre bienvenido"
}

fun calcularImpuestos(salario: Double, porcentaje: Double = 16.00): Double {
    val imp = (salario / 100) * porcentaje
    return imp
}

fun calcularImpuestos2( porcentaje: Double = 10.00, salario: Double) : Double {
    val imp = (salario / 100) * porcentaje
    return imp
}