import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal 
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" ===== Seja bem-vindo ao banco ==== ");
        System.out.println("Para darmos inicio ao seu cadastro digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Agora digite seu nome e sobrenome: ");
        String nomeCliente = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Estamos quase lá!");
        System.out.println("Digite o numero de 4 digitos da sua conta bancaria: ");
        int numeroConta = scanner.nextInt();

        System.out.println("E por fim, digite o valor que você deseja sacar: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+ " " +sobrenome+ " obrigado por criar uma conta em nosso banco, sua agência é: " +agencia+ " ,o número da sua conta é: " +numeroConta+ ", e o seu saldo de R$: " + saldo+ " ja está desponível para saque");

    }    
}
