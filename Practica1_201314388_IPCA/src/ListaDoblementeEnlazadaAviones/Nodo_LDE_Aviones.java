package ListaDoblementeEnlazadaAviones;

public class Nodo_LDE_Aviones {

    private int no_Aviones, no_Mantenimiento, cantidad_Pasajeros, desabordaje;
    private String tipo_Avion;
    public Nodo_LDE_Aviones siguiente, anterior;


    public Nodo_LDE_Aviones(int no_Aviones, int no_Mantenimiento, int cantidad_Pasajeros, int desabordaje, String tipo_Avion) {
        this.no_Aviones = no_Aviones;
        this.no_Mantenimiento = no_Mantenimiento;
        this.cantidad_Pasajeros = cantidad_Pasajeros;
        this.desabordaje = desabordaje;
        this.tipo_Avion = tipo_Avion;
        this.siguiente = null;
        this.anterior = null;
    }

    public Nodo_LDE_Aviones() {
    }
    
    

    public int getNo_Aviones() {
        return no_Aviones;
    }

    public void setNo_Aviones(int no_Aviones) {
        this.no_Aviones = no_Aviones;
    }

    public int getNo_Mantenimiento() {
        return no_Mantenimiento;
    }

    public void setNo_Mantenimiento(int no_Mantenimiento) {
        this.no_Mantenimiento = no_Mantenimiento;
    }

    public int getCantidad_Pasajeros() {
        return cantidad_Pasajeros;
    }

    public void setCantidad_Pasajeros(int cantidad_Pasajeros) {
        this.cantidad_Pasajeros = cantidad_Pasajeros;
    }

    public int getDesabordaje() {
        return desabordaje;
    }

    public void setDesabordaje(int desabordaje) {
        this.desabordaje = desabordaje;
    }

    public String getTipo_Avion() {
        return tipo_Avion;
    }

    public void setTipo_Avion(String tipo_Avion) {
        this.tipo_Avion = tipo_Avion;
    }

    public Nodo_LDE_Aviones getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_LDE_Aviones siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_LDE_Aviones getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_LDE_Aviones anterior) {
        this.anterior = anterior;
    }

}
