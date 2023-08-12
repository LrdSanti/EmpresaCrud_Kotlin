class Empresa (nit: Long,
               nombre: String, direccion: String) {

    val listaDeEmpleados: MutableList<Empleado> = mutableListOf();

    fun agregarEmpleado(empleado: Empleado):String{

        val empleadoAux: Empleado? = buscarEmpleado(empleado.getDocumento);

        if (empleadoAux == null){
            listaDeEmpleados.add(empleado);
            return "[Aviso Interno]- Agregado exitosamente!"
        } else {
            println("[Aviso Interno]- Este empleado ya se encuentra registrado!")
        }
        return "[Aviso Interno]- Sucedio un error inesperado agregando el empleado..."
    }

    fun buscarEmpleado(cedula: String): Empleado?{

        if (!listaDeEmpleados.isEmpty()){
            for (empleado in listaDeEmpleados){
                if (empleado.getDocumento.equals(cedula)){
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
                        "Cargo: ${empleado.getCargo.nombre}, Salario: ${empleado.getCargo.salario()} \n"
                aumentador++;
            }
        return empleados;
        } else {
            return "[Aviso Interno]- No hay empleados para mostrar"
        }
    }

    fun modificarEmpleado(empleado: Empleado): String{

        val empleadoModificar: Empleado? = buscarEmpleado(empleado.getDocumento);

        if (empleadoModificar != null){
            empleadoModificar.setNombre = empleado.getNombre;
            empleadoModificar.setApellido = empleado.getApellido;
            empleadoModificar.setCorreo = empleado.getCorreo;
            empleadoModificar.setCargo = empleado.getCargo;

           return "[Aviso Interno]- Empleado modificado exitosamente!"
        }

        return "[Error Interno]- Sucedio un error al intentar modificar el empleado"
    }

    fun eliminarEmpleado(cedula: String): String{

        if (listaDeEmpleados.isNotEmpty()){

            for (empleado in listaDeEmpleados){

                if (empleado.getDocumento.equals(cedula)){
                    listaDeEmpleados.remove(empleado);
                    return "[Aviso Interno]- Se elimino el empleado ${empleado.getNombre}";
                }
            }
        } else {
            return  "[Error Interno]- No hay empleados registrados por eliminar"
        }

        return "[Error Interno]- Ha sucedido un error al intentar ejecutar el metodo Eliminar"
    }

}

