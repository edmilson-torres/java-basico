package iPhone;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private String urlAtual;
    private List<String> historico = new ArrayList<>();

    public void exibirPagina(String url) {
        this.urlAtual = url;
        this.historico.add(url);
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página: " + this.urlAtual);
    }
}
