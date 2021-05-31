package ejercicio3;

public class FuegoArtificial implements iComponente {

    private String ruido;

    public FuegoArtificial(String ruido) {
        this.ruido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(ruido);
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

}
