package ListaSimple_Mantenimiento;

public class ListaSimple_mantenimiento {

    public Nodo_LS primero, ultimo;

    public Boolean EstaVacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Modificar(int id_estacion, int id_avion, int mantenimiento, String estado) {
        if (EstaVacio()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LS aux = primero;

            while (aux != null) {
                if(aux.ID_estaciones==id_estacion){
                    aux.estado=estado;
                    aux.ID_Aviones= id_avion;
                    aux.ID_Mantenimiento=mantenimiento;
                }
                aux = aux.siguiente;
            }
        }
    }
    
    public void insertarAlFinal(Nodo_LS nuevo) {
        if (EstaVacio()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }
    

    public String imprimir() {
        String temp = "";
        if (EstaVacio()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LS aux = primero;
            temp += "****************ESTACIONES****************" + "\n";
            while (aux != null) {
                temp += "ESTACION: " + aux.getID_estaciones() + "\n";
                temp += "\t" + "ESTADO: " + aux.getEstado() + "\n";
                temp += "\t" + "AVION: " + aux.getID_Aviones()+ "\n";
                temp += "\t" + "MANTENIMIENTO: " + aux.getID_Mantenimiento() + "\n";
                temp += "\n";
                aux = aux.siguiente;
            }
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }
}
