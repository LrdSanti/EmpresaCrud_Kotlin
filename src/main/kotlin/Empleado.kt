class Empleado (nombre: String, apellido:
String, documento: String, correo: String, cargo: Cargo ){

    val listaDeEmpleadosSubordinados: MutableList<Empleado> = mutableListOf();

    fun agregarEmpleadoSubordinado(empleado: Empleado){

        if (!empleado.documento.equals(this.documento)){
            if (buscarEmpleadoSubordinado(empleado.documento) == null){
            listaDeEmpleadosSubordinados.add(empleado);
            }
        }
    }

    fun buscarEmpleadoSubordinado(cedula: String): Empleado?{
        for (empleadoSubordinado in listaDeEmpleadosSubordinados){
            if (empleadoSubordinado.documento.equals(cedula)){
                return empleadoSubordinado
            }
        }

        return null;
    }

    var cargo: Cargo =cargo
        get(){
            return field;
        }

    var setCargo: Cargo = cargo
        set(value){
            field = value
        }


    var documento: String = documento

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





}