import java.util.*

fun main(args: Array<String>) {
    /** println("Hello World!")**/

    var empresaSantiagoSas = Empresa(666666, "Santiago Hernandez S.A.S", "Armenia/Quindio")
    val cargo1 = Cargo("Ventas");
    val cargo2 = Cargo("Recursos humanos");
    val empleado1 = Empleado("Santiago", "Hernandez",
        "1005253670", "santihernandez2501@gmail.com",
        cargo2);

    println(empleado1.cargo.salario());

    val scanner = Scanner(System.`in`)

    var opcion: Int
    var opcionEmpleados: Int
    var opcionClientes: Int
    var opcionInfoEmpresa: Int
    do {
        println("---- Empresa Santiago Hernandez ----")
        println("1. Gestionar Empleados")
        println("2. Gestionar Clientes")
        println("3. Informacion Adicional de la Empresa")
        println("4. Salir")
        print("Selecciona una opción: ")

        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                do {

                    println("----Gestor de Empleados----") //GESTOR DE EMPLEADOS---------------
                    println("1. Ver empleados de la empresa ")
                    println("2. Registrar nuevo empleado")
                    println("3. Modifcar un empleado")
                    println("4. Eliminar un empleado")
                    println("5. Volver")
                    print("Selecciona una opcion:")
                    opcionEmpleados = scanner.nextInt()
                    when (opcionEmpleados) {
                        1 -> {println("-Empleados de la empresa Santiago Hernandez-")
                              println(empresaSantiagoSas.listarEmpleados())
                        }
                        2 -> {println("-Nuevo Empleado-")

                            val scanner2 = Scanner(System.`in`)

                            print("Ingresa el nombre del nuevo empleado: ")
                            val nombre: String = scanner2.nextLine()
                            print("Ingresa el apellido del nuevo empleado: ")
                            val apellido: String = scanner2.nextLine()
                            print("Ingresa el documento del nuevo empleado: ")
                            val documento: String = scanner2.nextLine()
                            print("Ingresa el correo del nuevo empleado: ")
                            val correo: String = scanner2.nextLine()

                            print("Selecciona un cargo para esta persona: \n" +
                                    "1. Ventas\n" +
                                    "2. Recursos humanos\n" +
                                    "3. Gerencia\n" +
                                    "4. Operativo")
                            println("Selecciona un cargo:")
                            val opcionCargo: Int = scanner2.nextInt();
                            fun cargoSeleccionado(opcionCargo: Int):String{
                                if (opcionCargo == 1){
                                    return "Ventas"
                                } else if (opcionCargo == 2){
                                    return  "Recursos humanos"
                                } else if (opcionCargo == 3){
                                    return "Gerencia"
                                }else if (opcionCargo == 4){
                                    return "Operativo"
                                } else {
                                    println("No es una opcion valida para un cargo...")
                                }
                                return "null";
                            }

                            val cargo = Cargo(cargoSeleccionado(opcionCargo));
                            //Crear nuevo empleado
                            val empleado = Empleado(nombre, apellido, documento, correo, cargo);
                            println(empresaSantiagoSas.agregarEmpleado(empleado));

                        }
                        3 -> {println("Opcion3")}
                        4 -> {println("Opcion4")}
                        5 -> println("Volviendo al menu principal...")
                        else -> println("Opción invalida...")
                    }
                } while (opcionEmpleados != 5)

            }
            2 -> {
                do {

                println("----Gestor de Clientes----") //GESTOR DE CLIENTES---------------
                println("1. Ver clientes de la empresa ")
                println("2. Registrar nuevo cliente")
                println("3. Modifcar un cliente")
                println("4. Eliminar un cliente")
                println("5. Volver")
                print("Selecciona una opcion:")
                opcionClientes = scanner.nextInt()
                when (opcionClientes) {
                    1 -> {println("Opcion1")}
                    2 -> {println("Opcion2")}
                    3 -> {println("Opcion3")}
                    4 -> {println("Opcion4")}
                    5 -> println("Volviendo al menu principal...")
                    else -> println("Opción invalida...")
                }
            } while (opcionClientes != 5)
            }
            3 -> {do {

                println("----Informacion Adicional de la Empresa----") //INFORMACION ADICIONAL DE LA EMPRESA--------
                println("1. Valor total de nomina")
                println("2. Valor de nomina por cada cargo")
                println("3. Jerarquia de cargos")
                println("4. Buscar un empleado")
                println("5. Volver")
                print("Selecciona una opcion:")
                opcionInfoEmpresa = scanner.nextInt()
                when (opcionInfoEmpresa) {
                    1 -> {println("Opcion1")}
                    2 -> {println("Opcion2")}
                    3 -> {println("Opcion3")}
                    4 -> {println("Opcion4")}
                    5 -> println("Volviendo al menu principal...")
                    else -> println("Opción invalida...")
                }
            } while (opcionInfoEmpresa != 5)}
            4 -> println("Saliendo del programa...")
            else -> println("Opción inválida, por favor elige nuevamente.")
        }
    } while (opcion != 4)

    scanner.close()
}
