package ListaDoblementeEnlazadaAviones;

public class ListaDoblementeEnlazada {

 
   public Nodo_LDE_Aviones primero;
   public Nodo_LDE_Aviones ultimo;

    public boolean estaVacia() {
        return null == primero;
    }

    public void InsertarAlFinal(Nodo_LDE_Aviones nuevo) {
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
//            nuevo.siguiente = inicio;
//            inicio.anterior = nuevo;
//            inicio = nuevo;
        }
    }

    public String fimprimirLista() {
        String temp = "";
        if (estaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDE_Aviones aux = primero;
            temp += "********AVIONES*********" + "\n";
            while (aux != null) {
                temp += "\n";
                temp += "AVION: " + aux.getNo_Aviones() + "\n";
                temp += "\t" + "TIPO: " + aux.getTipo_Avion() + "\n";
                temp += "\t" + "PASAJEROS: " + aux.getCantidad_Pasajeros() + "\n";
                temp += "\t" + "DESABORDAJE: " + aux.getDesabordaje() + "\n";
                temp += "\t" + "MANTENIMIENTO: " + aux.getNo_Mantenimiento() + "\n";
                aux = aux.siguiente;
            }
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

}
