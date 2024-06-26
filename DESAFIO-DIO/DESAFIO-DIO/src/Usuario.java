
public class Usuario 
{
    public static void main(String[] args) 
    { 
        Iphone iphone = new Iphone();

        iphone.ligar("(51)123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("====================");

        iphone.exibirPagina("https://github.com/Thais-Westphal/dio-trilha-java-basico");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("====================");

        iphone.selecionarMusica("AVENGED SEVENFOLD - A LITTLE PIECE OF HEAVEN");
        iphone.tocar();
        iphone.pausar();

    }
    
}
