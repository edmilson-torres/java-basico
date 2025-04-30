package iphone;

public class Iphone implements ReprodutorMusicalInterface, AparelhoTelefonicoInterface, NavegadorInternetInterface {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone() {
        this.reprodutor = new ReprodutorMusical();
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
    }

    @Override
    public void tocar() {
        reprodutor.tocar();
    }

    @Override
    public void pausar() {
        reprodutor.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void desligar() {
        telefone.desligar();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    public void ligarDispositivo() {
        System.out.println("iPhone ligado");
    }

    public void desligarDispositivo() {
        System.out.println("iPhone desligado");
    }
}