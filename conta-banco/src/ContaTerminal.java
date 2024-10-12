import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Limpa o buffer do scanner
        scanner.nextLine();

        // Solicita o nome do cliente
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Cria uma nova conta
        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        // Exibe a mensagem final com os dados informados
        System.out.println(conta.exibirMensagem());

        scanner.close();
    }
}
