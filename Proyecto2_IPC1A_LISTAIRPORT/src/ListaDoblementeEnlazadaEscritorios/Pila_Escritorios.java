package ListaDoblementeEnlazadaEscritorios;

public class Pila_Escritorios {

    public Nodo_Escritorios primero, ultimo;

    public boolean estaVacia() {
        return null == primero;
    }

    public void InsertarAlInicio(Nodo_Escritorios nuevo) {
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            nuevo = primero;
            primero.anterior = nuevo;
            nuevo.siguiente = primero;
            primero.siguiente = ultimo;
        }
    }

    public String imprimirPila_Documentos() {
        String temp = "";
        if (estaVacia()) {
            System.out.println("PILA VACIA");
        } else {
            Nodo_Escritorios aux = primero;
            while (aux != null) {
                temp += "\n";
                if (!aux.getCola_pasajeros_escritorios().EstaVacio()) {
                    Cola_Pasajeros.Nodo_Pasajeros aux_pasajero = aux.cola_pasajeros_escritorios.primero;
                    while (aux_pasajero != null) {
                        temp += "\n";
                        temp += "\t\t" + "CLIENTE: " + aux_pasajero.id_pasajero + "\n";
                        temp += "\t\t" + "DOCUMENTOS: " + aux_pasajero.documentos + "\n";
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

}
