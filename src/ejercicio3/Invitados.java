package ejercicio3;

import java.util.ArrayList;

public abstract class Invitados {

    private String nombre;
    private String empresa;

    public Invitados(String nombre, String empresa) {
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public abstract void comerTorta();

}
