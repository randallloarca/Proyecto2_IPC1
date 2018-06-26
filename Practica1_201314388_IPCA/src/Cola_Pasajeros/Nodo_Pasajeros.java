package Cola_Pasajeros;

public class Nodo_Pasajeros {

    int id_avion, id_pasajero, maletas, documentos;
    public Nodo_Pasajeros siguiente, anterior;

    public Nodo_Pasajeros(int id_avion, int id_pasajero, int maletas, int documentos) {
        this.id_avion = id_avion;
        this.id_pasajero = id_pasajero;
        this.maletas = maletas;
        this.documentos = documentos;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

}
