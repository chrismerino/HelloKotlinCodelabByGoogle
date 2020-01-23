
fun main(){
    val nuevoCarro = Carro()
    println("Ingresa un color")
    nuevoCarro.setColor(readLine().toString())
    println(nuevoCarro.getColor())
}
