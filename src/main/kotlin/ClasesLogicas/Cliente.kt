package ClasesLogicas

interface Cliente {

    fun aplicaDescuento(producto : Producto):Int
    fun pagar(cantidad : Int):Boolean

}