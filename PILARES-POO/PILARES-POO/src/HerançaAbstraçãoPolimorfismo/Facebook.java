package HerançaAbstraçãoPolimorfismo;

public class Facebook extends ServicoMensagemInstantanea
{
    public void enviarMensagem()
    {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FACEBOOK");
    }
    public void receberMensagem()
    {
        System.out.println("Recebendo mensagem pelo FACEBOOK");
    }
}
