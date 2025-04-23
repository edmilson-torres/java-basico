package iPhone;

public class AparelhoTelefonico {
    private String numeroAtual;
    private boolean emChamada;

    public void ligar(String numero) {
        this.numeroAtual = numero;
        this.emChamada = true;
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        this.emChamada = true;
        System.out.println("Chamada atendida");
    }

    public void desligar() {
        this.emChamada = false;
        System.out.println("Chamada encerrada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}