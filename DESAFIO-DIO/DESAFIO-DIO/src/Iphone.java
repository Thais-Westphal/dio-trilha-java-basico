public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical
{
    // métdos da classe AparelhoTelefonico
    public void ligar(String numero) 
    {
        System.out.println("LIGANDO PARA "+ numero);
    }
    public void atender()
    {
        System.out.println("ATENDENDO LIGAÇÃO");
    }
    public void  iniciarCorreioVoz()
    {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // métodos da classe NavegadorInternet 
    public void exibirPagina(String url) 
    {
       System.out.println("EXIBINDO PÁGINA: " + url);
        
    }
    public void adicionarNovaAba()
    {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina()
    {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    // métodos da classe ReprodutorMusical
    public void tocar()
    {
        System.out.println("REPRODUZINDO MUSICA");
    }
    public void pausar()
    {
        System.out.println("MUSICA PAUSADA ");
    }
    public void selecionarMusica(String musica)
    {
        System.out.println("SELECIONADO MUSICA: " + musica);

    }






    




}
