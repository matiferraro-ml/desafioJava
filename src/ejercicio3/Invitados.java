package ejercicio3;

public abstract class Invitados {

    private String nombre;

    public Invitados(String nombre) {
        this.nombre = nombre;
    }

    public void comerTorta() {};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
