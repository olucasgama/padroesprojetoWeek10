package padroesestruturais.proxy;

public class Terminal {

    private boolean ligado;

    public Terminal(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
