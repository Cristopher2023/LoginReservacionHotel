public class Persona {
    String nombre,apellido,tipoHabitacion,diaReservacion,tipoPago;
    int numeroPersonas;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String tipoHabitacion,
                   String diaReservacion, String tipoPago, int numeroPersonas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoHabitacion = tipoHabitacion;
        this.diaReservacion = diaReservacion;
        this.tipoPago = tipoPago;
        this.numeroPersonas = numeroPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getdiaReservacion() {
        return diaReservacion;
    }

    public void setdiaReservacion(String diaReservacion) {
        this.diaReservacion = diaReservacion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido +
                ", tipoHabitacion=" + tipoHabitacion + ", diaReservacion=" + diaReservacion +
                ", tipoPago=" + tipoPago + ", numeroPersonas=" + numeroPersonas + '}';
    }

}
