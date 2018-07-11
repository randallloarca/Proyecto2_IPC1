package ListaDoblementeEnlazdaCircular_Maletas;

import Graficas.Grafica_Maletas;
import ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada_Aviones;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

//        public void sacar_maletas_pasajero(int id_pasajero)  {
//        boolean estado = false;
//        Nodo_LDEC_Maletas aux = primero;
//        if (aux != null) {
//            while (aux.siguiente != primero) {
//                if (aux.id_pasajero==id_pasajero) {
//                    primero.siguiente.anterior = aux.anterior; // inicio en su nodo siguiente, en su .ant apunta al nodo anterior de inicio
//                    primero.anterior.siguiente = aux.siguiente; // inicio en su nodo anterior, en su .next apunta al nodo siguiente de inicio
//                    primero = primero.siguiente;
//                    estado = true;
//                }
//                aux = aux.siguiente;
//            }
//        }
//}
    //metodo usado para remover las maletas de los pasajeros
    public void sacar_maletas_pasajero(int id_pasajero) {

        if (EstaVacia()) {
            System.out.println("LISTA VACIA MALETAS");
        } else {
            Nodo_LDEC_Maletas aux = primero;
            do {

                if (aux.getId_pasajero() == id_pasajero) {

                    if (primero.id_pasajero == aux.id_pasajero) {
                        primero = null;
                        primero = aux.siguiente;
                        primero.anterior = ultimo;
                        ultimo.siguiente = primero;
                    }
                    aux.anterior.siguiente = aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;

                    aux = primero;

                }

                if (aux.siguiente != null) {
                    aux = aux.siguiente;
                }

            } while (aux != primero);
            if (primero.siguiente == primero) {
                primero = null;
            }

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

    public String imprimir_primero(int id_avion) {
        String temp = "";
        temp += "****************MALETAS****************" + "\n";
        if (EstaVacia()) {
            System.out.println("LISTA VACIA");
        } else {

            Nodo_LDEC_Maletas aux = primero;

            do {
                if (aux.id_avion == id_avion) {
                    temp += "\n";
                    temp += "MALETA: " + aux.getId_Maleta() + "\n";
                    temp += "\t" + "ID_PASAJERO: " + aux.getId_pasajero() + "\n";
                    temp += "\t" + "ID_AVION: " + aux.getId_avion() + "\n";
                }

                aux = aux.siguiente;
            } while (aux != primero);

            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

    public String imprimir() {
        String temp = "";
        if (EstaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDEC_Maletas aux = primero;
            temp += "****************MALETAS****************" + "\n";

            do {
                temp += "\n";
                temp += "MALETA: " + aux.getId_Maleta() + "\n";
                temp += "\t" + "ID_PASAJERO: " + aux.getId_pasajero() + "\n";
                temp += "\t" + "ID_AVION: " + aux.getId_avion() + "\n";
                aux = aux.siguiente;
            } while (aux != primero);

            temp += "\n";
            temp += "\n";
        }
        return temp;
    }
    
     //PARA GRAFICAR
    String nombre = "Equipaje";
    Grafica_Maletas grafica;
    File file;

    public void graficarLista() {
        grafica = new Grafica_Maletas();
        try {
            grafica.graficar(primero, nombre);
        } catch (IOException ex) {
            Logger.getLogger(ListaDoblementeEnlazada_Aviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrir_grafica() {
        try {
            file = new File(nombre + ".jpg");
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(ListaDoblementeEnlazada_Aviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
