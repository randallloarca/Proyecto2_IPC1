package ListaSimple_Mantenimiento;

public class Nodo_LS {

    int ID_estaciones, ID_Aviones, ID_Mantenimiento;
    String estado;
    Nodo_LS siguiente, anterior;

    public Nodo_LS(int ID_estaciones, String estado, int ID_Aviones, int ID_Mantenimiento) {
        this.ID_estaciones = ID_estaciones;
        this.ID_Aviones = ID_Aviones;
        this.ID_Mantenimiento = ID_Mantenimiento;
        this.estado = estado;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getID_estaciones() {
        return ID_estaciones;
    }

    public void setID_estaciones(int ID_estaciones) {
        this.ID_estaciones = ID_estaciones;
    }

    public int getID_Mantenimiento() {
        return ID_Mantenimiento;
    }

    public void setID_Mantenimiento(int ID_Mantenimiento) {
        this.ID_Mantenimiento = ID_Mantenimiento;
    }

    public int getID_Aviones() {
        return ID_Aviones;
    }

    public void setID_Aviones(int ID_Aviones) {
        this.ID_Aviones = ID_Aviones;
    }

    public Nodo_LS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_LS siguiente) {
        this.siguiente = siguiente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
