class Cargo(val nombre: String) {
    companion object{
        private var contadorId: Int = 0
    }
    private var nivelJerarquico: Int = jerarquia()
    private var salario: Int = salario();
    val id: Int = contadorId++;

    override fun toString(): String {
        return "ID: $id, Nombre: $nombre";
    }
    fun jerarquia(): Int{

        if (nombre.equals("Ventas")){
            return 4;
        } else if (nombre.equals("Recursos humanos")) {
            return 3;
        } else if (nombre.equals("Gerencia")){
            return 2;
        } else if (nombre.equals("Operativo")){
            return 1;
        }
        return 0;
    }
    fun salario (): Int{

        if (nombre.equals("Ventas")){
            return 1000000;
        } else if (nombre.equals("Recursos humanos")) {
            return 2000000;
        } else if (nombre.equals("Gerencia")){
            return 3000000;
        } else if (nombre.equals("Operativo")){
            return 4000000;
        }
        return 0;

    }
}