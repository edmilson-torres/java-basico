import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private final List<Conta> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}

	public void listaClientes() {
		System.out.println(String.format("=== Clientes %s ===", nome));
		for (Conta conta : contas) {
			System.out.println(
					String.format("Nome: %s, Agência: %d, Conta: %d", conta.getCliente().getNome(), conta.getAgencia(),
							conta.getNumero()));
		}
	}

}
