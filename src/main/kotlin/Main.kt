import ClasesLogicas.Tienda_DM

fun main() {

    val tienda = Tienda_DM()

    while (true){

        println("1. Listar los discos\n" +
                "2. Listar las películas" +
                "\n3. Comprar una película o disco\n" +
                "4. Listar los clientes\n" +
                "5. Salir")

        var opcion = readln().toInt()

        when (opcion){

            1->{
                tienda.buscaPelicula()
            }
            2->{
                tienda.buscaPelicula()
            }
            3->{

                println("quieres disco o pelicula?")

                var objetivo = readln()

                while (objetivo!in arrayOf("disco", "pelicula")){
                    println("error, vuelve a escribir")
                    objetivo = readln()
                }

                println("cuantos ejemplares? ")
                if (objetivo == "disco")
                tienda.compraDisco(readln().toInt())
                else
                    tienda.compraPelicula(readln().toInt())
            }
            4->{
                for (cliente in tienda.listaClientes){
                    println(cliente.toString())
                }
            }
            5->{break}
            else->println("introduce una opcion valida")
        }

    }


}