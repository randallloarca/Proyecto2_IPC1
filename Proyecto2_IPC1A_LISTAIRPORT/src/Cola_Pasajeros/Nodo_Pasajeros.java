package Cola_Pasajeros;

public class Nodo_Pasajeros {

    public int id_avion, id_pasajero, maletas, documentos, turnos_registro;
    public Nodo_Pasajeros siguiente, anterior;

    public Nodo_Pasajeros(int id_avion, int id_pasajero, int maletas, int documentos, int turnos_registro) {
        this.id_avion = id_avion;
        this.id_pasajero = id_pasajero;
        this.maletas = maletas;
        this.documentos = documentos;
        this.turnos_registro = turnos_registro;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getTurnos_registro() {
        return turnos_registro;
    }

    public void setTurnos_registro(int turnos_registro) {
        this.turnos_registro = turnos_registro;
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
