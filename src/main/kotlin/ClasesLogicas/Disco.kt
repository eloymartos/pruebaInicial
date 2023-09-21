package ClasesLogicas

class Disco(INITitulo : String,
            INITPrecio : Float,
            INITAño : Int,
            INITGenero : GeneroMusica,
            INITGrupo : String,
            INITStock : Int):Producto(INITitulo,
    INITPrecio,
    INITAño) {

    val genero : GeneroMusica

    val grupo : String

    var stock : Int

    init {
        genero = INITGenero
        grupo = INITGrupo
        stock = INITStock
    }

}