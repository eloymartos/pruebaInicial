package ClasesLogicas

class Cliente_registrado(INITNombre : String,INITApellidos : String, INITDNI_NIF : String, INITTelefono : String, INITSaldo : Float) : Cliente {

    private val nombre : String

    private val apellidos : String

    private val DNI_NIF : String

    private var telefono : String

    private var saldo : Float = 0.0f
        get() {
            return field
        }
        set(value){
            var operador = value
            if (operador >= 100){
                actualizaDescuento(7)
                operador - 100
            }
            while (true){
                if (operador>=50 && descuento<30) {
                    operador - 50
                    actualizaDescuento(descuento+1)
                }else break
            }
        }

    private var descuento = 2

    init {
        nombre = INITNombre
        apellidos = INITApellidos
        DNI_NIF = INITDNI_NIF
        telefono = INITTelefono
        saldo = INITSaldo
    }

    fun valida_DNI():Boolean{
        return TODO()
    }

    fun esVIP():Boolean{
        return TODO()
    }

    private fun actualizaDescuento(cantidadNueva : Int){
        return TODO()
    }

    override fun aplicaDescuento(producto: Producto): Int {
        TODO("Not yet implemented")
    }

    override fun pagar(cantidad: Int): Boolean {
        TODO("Not yet implemented")
    }

}