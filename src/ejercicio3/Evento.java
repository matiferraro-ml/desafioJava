package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Evento {

    private List<Invitados> listaDeInvitados = new ArrayList<>();
    private List<FuegosArtificiales> fuegosArtificiales;

    private HashMap<Integer, Invitados> hm = new HashMap<>();
    private List<Invitados> listaprueba = new ArrayList<>();
    private ArrayList<InvitadosMeli> invimeli = new ArrayList<>();
    InvitadosMeli invi21 = new InvitadosMeli("Marcos");

    public Evento(List<Invitados> listaDeInvitados, List<FuegosArtificiales> fuegosArtificiales) {
        this.listaDeInvitados = listaDeInvitados;
        this.fuegosArtificiales = fuegosArtificiales;
    }

    Persona laChiqui = new Persona("La Chiqui");


    InvitadosMeli invi1 = new InvitadosMeli("Marcos");


    listaDeInvitados.add()

    public List<Invitados> getListaDeInvitados() {
        return listaDeInvitados;
    }

    public void setListaDeInvitados(List<Invitados> listaDeInvitados) {
        this.listaDeInvitados = listaDeInvitados;
    }

    public List<FuegosArtificiales> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void setFuegosArtificiales(List<FuegosArtificiales> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

}
