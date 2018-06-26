package ListaSimple_Mantenimiento;

import ListaDoblementeEnlazadaAviones.Nodo_LDE_Aviones;

public class Cola_Mantenimiento {

    public Nodo_LDE_Aviones primero, ultimo;

    public Boolean EstaVacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarAlFinal(Nodo_LDE_Aviones nuevo) {
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
            Nodo_LDE_Aviones aux = primero;
            temp += "********COLA*********" + "\n";
            while (aux != null) {
                temp += "\n";
                temp += "\t" + "AVION: " + aux.getNo_Aviones() + "\n";
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
