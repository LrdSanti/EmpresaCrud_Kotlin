class Empresa (nit: Long,
               nombre: String, direccion: String) {

    val listaDeEmpleados: MutableList<Empleado> = mutableListOf();

    fun agregarEmpleado(empleado: Empleado):String{

        val empleadoAux: Empleado? = buscarEmpleado(empleado.documento);

        if (empleadoAux == null){
            listaDeEmpleados.add(empleado);
            return "Agregado exitosamente!"
        } else {
            println("Este empleado ya se encuentra registrado!")
        }
        return "Sucedio un error inesperado agregando el empleado..."
    }

    fun buscarEmpleado(cedula: String): Empleado?{

        if (!listaDeEmpleados.isEmpty()){
            for (empleado in listaDeEmpleados){
                if (empleado.documento.equals(cedula)){
                    return empleado;
                }
            }
        }
        return null;
    }

    fun listarEmpleados():String{

            var empleados: String = "Empleados Activos de Santiago Hernandez S.A.S\n";
        if (!listaDeEmpleados.isEmpty()){
            var aumentador: Int = 1
            for (empleado in listaDeEmpleados){

                empleados += "[$aumentador] - ${empleado.getNombre} ${empleado.getApellido}, " +
                        "Cargo: ${empleado.cargo.nombre}, Salario: ${empleado.cargo.salario()} \n"
                aumentador++;
            }
        return empleados;
        } else {
            return "No hay empleados para mostrar"
        }
    }

}

