import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Música 1");
        iphone.tocar();
        iphone.ligar("123456789");
        iphone.exibirPagina("www.example.com");
    }
}
