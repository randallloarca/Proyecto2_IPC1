package ListaDoblementeEnlazdaCircular_Maletas;

public class Nodo_LDEC_Maletas {

    public int id_pasajero, id_Maleta, id_avion;
    public Nodo_LDEC_Maletas siguiente, anterior;

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public Nodo_LDEC_Maletas(int id_Maleta, int id_pasajero, int id_avion) {

        this.id_pasajero = id_pasajero;
        this.id_Maleta = id_Maleta;
        this.id_avion = id_avion;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getId_Maleta() {
        return id_Maleta;
    }

    public void setId_Maleta(int id_Maleta) {
        this.id_Maleta = id_Maleta;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

}
