fun main() {

    while (true){

        println("1. Listar los discos\n" +
                "2. Listar las películas" +
                "\n3. Comprar una película o disco\n" +
                "4. Listar los clientes\n" +
                "5. Salir")

        var opcion = readln().toInt()

        while (opcion !in 1..5){
            println("introduce una opcion valida")
            opcion = readln().toInt()
        }



    }


}