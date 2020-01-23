class Carro{

    private var color: String? = null
    private var placa: String? = null
    private var modelo: String? = null

    fun setColor(definirColor: String){
        color = definirColor
    }

    fun getColor(): String{
        return color?:"Blanco"
    }

}