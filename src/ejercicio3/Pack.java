package ejercicio3;

import java.util.List;

public class Pack implements iComponente {

    private List<FuegoArtificial> fuegosArtificiales;

    public Pack(List<FuegoArtificial> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    @Override
    public void explotar() {
        for(FuegoArtificial fa : fuegosArtificiales) {
            fa.explotar();
        }
    }

    public List<FuegoArtificial> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void setFuegosArtificiales(List<FuegoArtificial> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

}
