package ClasesLogicas

class Pelicula(INITitulo : String,
               INITPrecio : Float,
               INITAño : Int,
               INITGenero : GeneroPelicula,
               INITDirector : String):Producto(INITitulo,
    INITPrecio,
    INITAño) {

    val genero : GeneroPelicula

    val director : String

    init {
        genero = INITGenero

        director = INITDirector
    }

}