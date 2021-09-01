fun main(args: Array<String>) {
    println("Hello World! Test paulo")

    // Try adding program arguments at Run/Debug configuration
   // println("Program arguments: ${args.joinToString()}")

    println("Ingrese su primer nombre: ")
    val nombre = readLine()
    println("Ingrese su edad: ")
    val edad = readLine()

    //println("Tu nombre es $nombre y tu edad es: $edad ")

    println (""" 
        *** Datos ***
        Nombre: $nombre
        Edad: $edad años        
    """.trimIndent())
}