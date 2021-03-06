package ListaDoblementeEnlazdaCircular_Maletas;

public class ListaDoblementeEnlazadaCircular {

    Nodo_LDEC_Maletas primero, ultimo;

    public boolean EstaVacia() {
        return null == primero;
    }

    public void InsertarAlFinal(Nodo_LDEC_Maletas nuevo) {
        if (EstaVacia()) {
            primero = ultimo = nuevo;
            ultimo.siguiente = primero.siguiente = nuevo;
            ultimo.anterior = primero.anterior = nuevo;

        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            ultimo.siguiente = primero;
            primero.anterior = ultimo;
        }
    }

    public void sacar_maletas(int cantidad_maletas) {

        if (EstaVacia()) {

            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDEC_Maletas aux;
            for (int c = 0; c < cantidad_maletas; c++) {
                aux = primero;
                primero = aux.siguiente;
                primero.anterior = ultimo;
                ultimo.siguiente = primero;
                aux = null;
            }
            if (primero.siguiente == primero) {
                primero = null;

            }
        }
    }



    public String imprimir() {
        String temp = "";
        if (EstaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDEC_Maletas aux = primero;
            temp += "********MALETAS*********" + "\n";

            do {
                temp += "\n";
                temp += "MALETA: " + aux.getId_Maleta() + "\n";
                temp += "\t" + "ID_PASAJERO: " + aux.getId_pasajero() + "\n"; 
                                temp += "\t" + "ID_AVION: " + aux.getId_avion()+ "\n"; 
                aux = aux.siguiente;
            } while (aux != primero);

            temp += "\n";
            temp += "\n";
        }
        return temp;
    }
}
