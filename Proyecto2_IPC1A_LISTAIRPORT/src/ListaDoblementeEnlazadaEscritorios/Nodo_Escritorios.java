package ListaDoblementeEnlazadaEscritorios;

import Cola_Pasajeros.Cola_pasajeros;



public class Nodo_Escritorios {

    public int id_pasajero;
    public String id_escritorios;
    public String estado;
    public int numeros_doc;
    public int cantidad_turnos;
    
    public Cola_Pasajeros.Cola_pasajeros cola_pasajeros_escritorios;

    public Cola_pasajeros getCola_pasajeros_escritorios() {
        return cola_pasajeros_escritorios;
    }

    public void setCola_pasajeros_escritorios(Cola_pasajeros cola_pasajeros_escritorios) {
        this.cola_pasajeros_escritorios = cola_pasajeros_escritorios;
    }
    
    public Nodo_Escritorios siguiente, anterior;

    public Nodo_Escritorios(String id_escritorios, int id_pasajero, String estado, int numeros_doc, int cantidad_turnos) {
        this.id_escritorios = id_escritorios;
        this.id_pasajero = id_pasajero;
        this.estado = estado;
        this.numeros_doc = numeros_doc;
        this.cantidad_turnos = cantidad_turnos;

        this.cola_pasajeros_escritorios= new Cola_pasajeros();
        
        this.siguiente = null;
        this.anterior = null;       
        

    }

    public String getId_escritorios() {
        return id_escritorios;
    }

    public void setId_escritorios(String id_escritorios) {
        this.id_escritorios = id_escritorios;
    }

    
    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeros_doc() {
        return numeros_doc;
    }

    public void setNumeros_doc(int numeros_doc) {
        this.numeros_doc = numeros_doc;
    }

    public int getCantidad_turnos() {
        return cantidad_turnos;
    }

    public void setCantidad_turnos(int cantidad_turnos) {
        this.cantidad_turnos = cantidad_turnos;
    }

}
