package Cola_Pasajeros;

import Graficas.Grafica_Pasajeros;
import ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada_Aviones;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cola_pasajeros {

    public Nodo_Pasajeros primero;
    public Nodo_Pasajeros ultimo;

    public Boolean EstaVacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void eliminar(int id_pasajero) {
        if (EstaVacio()) {
            System.out.println("COLA VACIA PASAJEROS");
        } else {
            Nodo_Pasajeros aux = primero;
            while (aux != null) {
                if (primero.getId_pasajero() == id_pasajero) {
                    primero = aux.siguiente;
                }
                if (aux.siguiente != null) {

                    if (aux.siguiente.getId_pasajero() == id_pasajero) {;
                        aux.siguiente = aux.siguiente.siguiente;
                    }
                }
                aux = aux.siguiente;
            }
        }
    }

    public void InsertarAlFinal(Nodo_Pasajeros nuevo) {

        if (EstaVacio()) {
            primero = nuevo;
            ultimo = nuevo;
            //primero.siguiente = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            //nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }

    public String imprimir_primero(int id_avion) {
        String temp = "";
        temp += "****************PASAJEROS****************" + "\n";
        if (EstaVacio()) {
            System.out.println("COLA VACIA PASAJEROS");
        } else {
            Nodo_Pasajeros aux = primero;

            while (aux != null) {
                if (aux.getId_avion() == id_avion) {
                    temp += "PASAJERO: " + aux.getId_pasajero() + "   ID_AVION: " + aux.getId_avion() + "\n";
                    temp += "\t" + "MALETAS: " + aux.getMaletas() + "\n";
                    temp += "\t" + "DOCUMENTOS: " + aux.getDocumentos() + "\n";
                    temp += "\t" + "TURNOS REGISTRO: " + aux.getTurnos_registro() + "\n";
                    temp += "\n";
                }

                aux = aux.siguiente;
            }
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

    public String imprimir() {
        String temp = "";

        if (EstaVacio()) {
            System.out.println("COLA VACIA PASAJEROS");
        } else {
            Nodo_Pasajeros aux = primero;
            temp += "****************PASAJEROS****************" + "\n";
            while (aux != null) {
                temp += "PASAJERO: " + aux.getId_pasajero() + "   ID_AVION: " + aux.getId_avion() + "\n";
                temp += "\t" + "MALETAS: " + aux.getMaletas() + "\n";
                temp += "\t" + "DOCUMENTOS: " + aux.getDocumentos() + "\n";
                temp += "\t" + "TURNOS REGISTRO: " + aux.getTurnos_registro() + "\n";
                temp += "\n";
                aux = aux.siguiente;
            }
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

    
    //PARA GRAFICAR
    String nombre = "Desabordaje";
    Grafica_Pasajeros grafica;
    File file;

    public void graficarLista() {
        grafica = new Grafica_Pasajeros();
        try {
            grafica.graficar(primero, nombre);
        } catch (IOException ex) {
            Logger.getLogger(Cola_pasajeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrir_grafica() {
        try {
            file = new File(nombre + ".jpg");
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(Cola_pasajeros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
