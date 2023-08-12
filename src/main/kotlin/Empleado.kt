class Empleado (nombre: String, apellido:
String, documento: String, correo: String, cargo: Cargo ){

    val listaDeEmpleadosSubordinados: MutableList<Empleado> = mutableListOf();

    fun agregarEmpleadoSubordinado(empleado: Empleado){

        if (!empleado.getDocumento.equals(this.getDocumento)){
            if (buscarEmpleadoSubordinado(empleado.getDocumento) == null){
            listaDeEmpleadosSubordinados.add(empleado);
            }
        }
    }

    fun buscarEmpleadoSubordinado(cedula: String): Empleado?{
        for (empleadoSubordinado in listaDeEmpleadosSubordinados){
            if (empleadoSubordinado.getDocumento.equals(cedula)){
                return empleadoSubordinado
            }
        }

        return null;
    }



    var getCargo: Cargo =cargo
        get(){
            return field;
        }

    var setCargo: Cargo = cargo
        set(value){
            field = value
        }


    var getDocumento: String = documento

        get(){
            return field;
        }

    var getNombre: String = nombre

        get(){
            return field;
        }

    var setNombre: String = nombre
        set(value){
            field = value
        }

    var getApellido: String = apellido

        get(){
            return field;
        }

    var setApellido: String = apellido
        set(value){
            field = value
        }

    var getCorreo: String = correo

        get(){
            return field;
        }

    var setCorreo: String = correo
        set(value){
            field = value
        }





}