package ClasesLogicas

abstract class Producto(INITitulo : String, INITPrecio : Float, INITAño : Int) {

    val Titulo:String

    var precio : Float

    val año_publicacion : Int

    var DescuentoProducto = 0

    init {
        Titulo = INITitulo
        precio = INITPrecio
        año_publicacion = INITAño
    }

}