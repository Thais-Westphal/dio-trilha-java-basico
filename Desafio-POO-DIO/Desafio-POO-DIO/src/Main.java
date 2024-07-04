public class Main 
{

	public static void main(String[] args) 
    {
        Banco banco = new Banco();
        banco.imprimirInformacoesBanco();

		Cliente cliente = new Cliente();
		cliente.setNome("Thais");

        Conta contacorrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

        contacorrente.depositar(100);
		contacorrente.transferir(10, poupanca);
        contacorrente.imprimirExtrato();
		poupanca.imprimirExtrato();

        System.out.println("====================");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Lucas");

        Conta contacorrente2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);
        
        
        contacorrente2.depositar(100);
		contacorrente2.transferir(20, poupanca2);

        contacorrente2.imprimirExtrato();
        poupanca2.imprimirExtrato();
        
    }
}
