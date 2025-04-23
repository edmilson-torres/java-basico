package iPhone;

public class ReprodutorMusical {
    private String musicaAtual;
    private boolean tocando;

    public void tocar() {
        this.tocando = true;
        System.out.println("Tocando: " + this.musicaAtual);
    }

    public void pausar() {
        this.tocando = false;
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
