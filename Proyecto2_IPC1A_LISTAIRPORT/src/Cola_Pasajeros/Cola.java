package Cola_Pasajeros;

public class Cola {

    public Nodo_Pasajeros primero;
    public Nodo_Pasajeros ultimo;

    public Boolean EstaVacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarAlFinal(Nodo_Pasajeros nuevo) {
        if (EstaVacio()) {
            primero = nuevo;
            ultimo = nuevo;

            primero.siguiente = nuevo;
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
            Nodo_Pasajeros aux = primero;
            temp += "********PASAJEROS*********" + "\n";
            while (aux != null) {
                temp += "PASAJERO: " + aux.getId_pasajero() + "   ID_AVION: " + aux.getId_avion() + "\n";
                temp += "\t" + "MALETAS: " + aux.getMaletas() + "\n";
                temp += "\t" + "DOCUMENTOS: " + aux.getDocumentos() + "\n";
                temp += "\n";
                aux = aux.siguiente;
            }
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

}
