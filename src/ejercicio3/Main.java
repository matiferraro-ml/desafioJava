package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        InvitadosMeli facu = new InvitadosMeli("Facu");
        InvitadosMeli lisa = new InvitadosMeli("Lisa");
        InvitadosMeli walter = new InvitadosMeli("Walter");
        InvitadosMeli mati = new InvitadosMeli("Mati");

        InvitadosStandard joselo = new InvitadosStandard("Joselo");
        InvitadosStandard josefa = new InvitadosStandard("josefa");
        InvitadosStandard juana = new InvitadosStandard("juana");
        InvitadosStandard juliana = new InvitadosStandard("juliana");

        List<Invitados> invitados = new ArrayList<Invitados>();
        invitados.add(facu);
        invitados.add(lisa);
        invitados.add(walter);
        invitados.add(mati);
        invitados.add(joselo);
        invitados.add(josefa);
        invitados.add(juana);
        invitados.add(juliana);

        FuegoArtificial bombaEstruendo = new FuegoArtificial("boom");
        FuegoArtificial canitaVoladora = new FuegoArtificial("fiuuuuuuuuum");
        List<iComponente> fuegosArtificiales = new ArrayList<iComponente>();
        fuegosArtificiales.add(bombaEstruendo);
        fuegosArtificiales.add(canitaVoladora);

        Evento centenarioChiqui = new Evento(invitados, fuegosArtificiales);

        Persona laChiqui = new Persona("La Chiqui");

        System.out.println("La Chiqui apago las velas? [1/0]");

        if(scanner.nextInt() == 1) {
            centenarioChiqui.explotarTodo();
            centenarioChiqui.todosComenTorta();
        }

    }

}
