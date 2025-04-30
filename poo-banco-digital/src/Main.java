
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Banco da DIO");

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		banco.adicionaConta(cc);
		Conta poupanca = new ContaPoupanca(venilton);
		banco.adicionaConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.listaClientes();
	}
}
