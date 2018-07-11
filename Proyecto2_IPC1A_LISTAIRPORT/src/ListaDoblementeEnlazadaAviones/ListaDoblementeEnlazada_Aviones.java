package ListaDoblementeEnlazadaAviones;

import Graficas.Grafica_Aviones;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaDoblementeEnlazada_Aviones {

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

    public Nodo_LDE_Aviones buscar(int id_avion) {
        Nodo_LDE_Aviones aux = primero;

        if (estaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            while (aux != null) {
                if (aux.getNo_Aviones() == id_avion) {
                    return aux;
                }
                aux = aux.siguiente;
            }
        }
        return null;
    }

    public String ImprimirLista_DE_soloprimero() {
        String temp = "";
        if (estaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDE_Aviones aux = primero;
            temp += "****************AVIONES****************" + "\n";
            temp += "\n";
            temp += "AVION: " + aux.getNo_Aviones() + "\n";
            temp += "\t" + "TIPO: " + aux.getTipo_Avion() + "\n";
            temp += "\t" + "PASAJEROS: " + aux.getCantidad_Pasajeros() + "\n";
            temp += "\t" + "DESABORDAJE: " + aux.getDesabordaje() + "\n";
            temp += "\t" + "MANTENIMIENTO: " + aux.getNo_Mantenimiento() + "\n";
            temp += "\n";
            temp += "\n";
        }
        return temp;
    }

    //imprime todos
    public String ImprimirLista_DE() {
        String temp = "";
        if (estaVacia()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDE_Aviones aux = primero;
            temp += "****************AVIONES****************" + "\n";
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

    //PARA GRAFICAR
    String nombre = "Llegada de Aviones";
    Grafica_Aviones grafica;
    File file;

    public void graficarLista() {
        grafica = new Grafica_Aviones();
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
