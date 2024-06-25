package HerançaAbstraçãoPolimorfismo;

public class Telegram extends ServicoMensagemInstantanea
{
    
    public void enviarMensagem()
    {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo TELEGRAM");
    }
    public void receberMensagem()
    {
        System.out.println("Recebendo mensagem pelo TELEGRAM");
    }
}
