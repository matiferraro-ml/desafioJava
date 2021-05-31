package ejercicio2;

import java.util.List;

public class Carrera {

    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;

    SocorristaAuto socorristaAuto;
    SocorristaMoto socorristaMoto;

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, List<Vehiculo> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos) {
            Auto auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
            listaDeVehiculos.add(auto);
        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos) {
            Moto moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
            listaDeVehiculos.add(moto);
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String patente) {
        listaDeVehiculos.remove(busquedaPorPatente(patente));
    }

    public Vehiculo ganador() {
        Vehiculo vAux = listaDeVehiculos.get(0);//inicializando
        Double maxAux = vAux.calcularGanador();//inicializando
        for(Vehiculo v : listaDeVehiculos) {
            if(v.calcularGanador() > maxAux) {
                vAux = v;
                maxAux = v.calcularGanador();
            }
        }
        return vAux;

        // listaDeVehiculos.stream().max(v -> v.calcularGanador());
    }

    public void socorrerAuto(String patente) {
        socorristaAuto.socorrer((Auto) busquedaPorPatente(patente));
    }

    public void socorrerMoto(String patente) {
        socorristaMoto.socorrer((Moto) busquedaPorPatente(patente));
    }

    public Vehiculo busquedaPorPatente(String patente) {
        for(Vehiculo v : listaDeVehiculos) {
            // if(v.getPatente() == patente) {
            if(v.getPatente().equals(patente)) {
            // if(v.getPatente().compareTo(patente)) {
                return v;
            }
        }
        return null;
    }

    // Getters y setters

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(Double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getListaDeVehiculos() {
        return listaDeVehiculos;
    }

    public void setListaDeVehiculos(List<Vehiculo> listaDeVehiculos) {
        this.listaDeVehiculos = listaDeVehiculos;
    }

}
