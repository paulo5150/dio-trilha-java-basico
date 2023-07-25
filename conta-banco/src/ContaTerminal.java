import java.util.Scanner;

public class ContaTerminal {    

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) { //"try" foi sugestão da IDE...
            int numeroConta;
            String agenciaConta;
            String nomeCliente;
            double saldo;

            System.out.println("Por favor, digite o número da agência: ");
            agenciaConta = ler.next();

            System.out.println("Digite o número da conta: ");
            numeroConta = ler.nextInt();

            ler.nextLine(); // esvaziar buffer do teclado.

            System.out.println("Digite o nome completo: ");
            nomeCliente = ler.nextLine();

            System.out.println("Digite o valor de depósito: ");
            saldo = ler.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaConta +", conta " + numeroConta + " e seu saldo de $" + saldo + " está disponível para saque.");
        }
    }
}
