
import HerançaAbstraçãoPolimorfismo.*;
import encapsulamento.*;

public class Computador 
{
	public static void main(String[] args) 
	{
		//ENCAPSULAMENTO

		MsnMessenger msn = new MsnMessenger();
		System.out.println("BEM-VINDO AO MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println("==============================");
	
		//HERANÇAS	
		Facebook fb = new Facebook();
		System.out.println("BEM-VINDO AO FACEBOOK");
		fb.enviarMensagem();
		fb.receberMensagem();
		
		System.out.println("==============================");
		
		//Abstração e polimorfismo
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="Telegram"; 
		
		if(appEscolhido.equals("FB"))
			smi = new Facebook();
		else if(appEscolhido.equals("Telegram"))
			smi = new Telegram();
		
		System.out.println("BEM-VINDO AO "+appEscolhido);
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}	
}

    
