package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private List<Invitados> listaDeInvitados;
    private List<iComponente> listaDeFuegosArtificiales;

    public Evento(List<Invitados> listaDeInvitados, List<iComponente> listaDeFuegosArtificiales) {
        this.listaDeInvitados = listaDeInvitados;
        this.listaDeFuegosArtificiales = listaDeFuegosArtificiales;
    }

    public void explotarTodo() {
        for(iComponente ic : listaDeFuegosArtificiales) {
            ic.explotar();
        }
    }

    public void todosComenTorta() {
        for(Invitados i : listaDeInvitados) {
            i.comerTorta();
        }
    }

    public List<Invitados> getListaDeInvitados() {
        return listaDeInvitados;
    }

    public void setListaDeInvitados(List<Invitados> listaDeInvitados) {
        this.listaDeInvitados = listaDeInvitados;
    }

    public List<iComponente> getListaDeFuegosArtificiales() {
        return listaDeFuegosArtificiales;
    }

    public void setListaDeFuegosArtificiales(List<iComponente> listaDeFuegosArtificiales) {
        this.listaDeFuegosArtificiales = listaDeFuegosArtificiales;
    }

}
