package ListaSimple_Mantenimiento;

import Graficas.Grafica_Aviones;
import Graficas.Grafica_ColaMantenimiento;
import ListaDoblementeEnlazadaAviones.ListaDoblementeEnlazada_Aviones;
import ListaDoblementeEnlazadaAviones.Nodo_LDE_Aviones;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cola_Mantenimiento {

    public Nodo_LDE_Aviones primero, ultimo;

    public Boolean EstaVacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public Nodo_LDE_Aviones buscar(int id_avion) {
        Nodo_LDE_Aviones aux = primero;
        if (EstaVacio()) {
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
        temp += "****************COLA****************" + "\n";
        if (EstaVacio()) {
            System.out.println("LISTA VACIA");
        } else {
            Nodo_LDE_Aviones aux = primero;
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

    //nuevo metodo creado 
    public Nodo_LDE_Aviones eliminar_aviones_Cola(int id_aviones) {
        if (EstaVacio()) {
            System.out.println("COLA VACIA DE AVIONES");
        } else {
            Nodo_LDE_Aviones aux = primero;
            while (aux != null) {
                if (primero.getNo_Aviones() == id_aviones) {
                    primero = aux.siguiente;
                }
                if (aux.siguiente != null) {
                    if (aux.siguiente.getNo_Aviones() == id_aviones) {;
                        aux.siguiente = aux.siguiente.siguiente;
                    }
                }
                aux = aux.siguiente;
            }
        }
        return null;
    }
    
     //PARA GRAFICAR
    String nombre = "ColadeAvionesMantenimiento";
    Grafica_ColaMantenimiento grafica;
    File file;

    public void graficarLista() {
        grafica = new Grafica_ColaMantenimiento();
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
