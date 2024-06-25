package encapsulamento;

public class MsnMessenger 
{
       	public void enviarMensagem() 
        {
            //primeiro confirmar se esta conectado a internet
            validarConexaoInternet();
            System.out.println("Enviando mensagem");
            //depois de enviada, salva o histórico da mensagem
            salvarHistoricoMensagem();

        }
        public void receberMensagem()
        {
            System.out.println("Recebendo mensagem");

        }

        //métodos privados, visíveis somente na classe
        private void validarConexaoInternet()
        {
            System.out.println("Valindando conexão com a internet");
        }
        private void salvarHistoricoMensagem()
        {
            System.out.println("Salvando o histórico da mensagem");
        }

}
