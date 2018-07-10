package ListaDoblementeEnlazadaEscritorios;

public class ListaDoblementeEnlazada_Escritorios {

    public Nodo_Escritorios primero, ultimo;

    public boolean estaVacia() {
        return null == primero;
    }

    public void InsertarAlFinal(Nodo_Escritorios nuevo) {
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }

    public void vaciar() {
        Nodo_Escritorios aux = primero;
        while (aux != null) {
            primero=null;
            aux = aux.siguiente;
            primero=aux;

        }

    }

    public void remove(Nodo_Escritorios node) {
        if (node.siguiente == null) {
            primero = node.siguiente;
        } else if (node.siguiente == null) {
            ultimo = node.anterior;
        } else {
            node.anterior.siguiente = node.siguiente;
            node.siguiente.anterior = node.anterior;
        }
    }

    public String ImprimirLista_DE() {
        String temp = "";
        if (estaVacia()) {
            temp = "****************ESCRITORIOS****************" + "\n" + "ESCRITORIO: " + "VACIA" + "\n";
        } else {
            Nodo_Escritorios aux = primero;
            temp += "****************ESCRITORIOS****************" + "\n";
            while (aux != null) {
                temp += "\n";
                temp += "ESCRITORIO: " + aux.getId_escritorios() + "\n";
                temp += "\t" + "ESTADO: " + aux.getEstado() + "\n";
                if (!aux.getCola_pasajeros_escritorios().EstaVacio()) {
                    Cola_Pasajeros.Nodo_Pasajeros aux_pasajero = aux.cola_pasajeros_escritorios.primero;
                    while (aux_pasajero != null) {
                        temp += "\n";
                        temp += "\t\t" + "CLIENTE: " + aux_pasajero.id_pasajero + "\n";
                        temp += "\t\t" + "DOCUMENTOS: " + aux_pasajero.documentos + "\n";
                        temp += "\t\t" + "TURNOS REGISTRO: " + aux_pasajero.turnos_registro + "\n";

                        aux_pasajero = aux_pasajero.siguiente;
                    }

                }

                aux = aux.siguiente;
            }
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

//    public String ImprimirLista_DE() {
//        String temp = "";
//        if (estaVacia()) {
//            temp = "********ESCRITORIOS*********" + "\n" + "ESCRITORIO: " + "VACIA" + "\n";
//        } else {
//            Nodo_Escritorios aux = primero;
//            temp += "********ESCRITORIOS*********" + "\n";
//            while (aux != null) {
//                temp += "\n";
//                temp += "ESCRITORIO: " + aux.getId_escritorios() + "\n";
//                temp += "\t" + "CLIENTE: " + aux.getPasajeros().primero.id_pasajero+ "\n";
//                temp += "\t" + "ESTADO: " + aux.getEstado() + "\n";
//                temp += "\t" + "DOCUMENTOS: " + aux.getNumeros_doc() + "\n";
//                temp += "\t" + "TURNOS REGISTRO: " + aux.getCantidad_turnos() + "\n";
//                aux = aux.siguiente;
//            }
//            temp += "\n";
//            temp += "\n";
//        }
//        return temp;
//    }
}
