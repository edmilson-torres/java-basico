import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desafio: Conta Terminal
 * Simulando Uma Conta Bancária Através Do Terminal/Console
 * 
 * @author Edmilson Torres
 * @version 1.0
 * @since 30/03/2025
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale localeBR = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeBR);

        Scanner scan = new Scanner(System.in);

        System.out.println("Seja Bem-Vindo! \nPor favor, digite o número da Agência.");
        String accountAgency = scan.next();

        System.out.println("Por favor, digite o número da Conta.");
        int accountNumber = scan.nextInt();

        System.out.println("Por favor, digite seu nome.");
        String customerName = scan.next();

        System.out.println("Por favor, digite o saldo.");
        double currentBalance = scan.nextDouble();

        System.out.println("\nOlá " + customerName + ", obrigado por criar uma conta em nosso banco! \nSua agência é: "
                + accountAgency + ", conta: " + accountNumber + " e seu saldo "
                + currencyFormatter.format(currentBalance)
                + " já está disponível para saque");
    }
}