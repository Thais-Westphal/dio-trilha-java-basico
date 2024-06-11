public class SmartTv 
{
    boolean ligada = false;
    int canal = 5;
    int volume = 15;

    public void ligar() 
    {
        ligada = true;
    }

    public void desligar ()
    {
        ligada = false;
    }
    public void aumentarVolume()
    {
        volume ++;
        System.out.println("Aumentando volume para " +volume);
    }

    public void diminuirVolume()
    {
        volume --;
        System.out.println("Diminuindo volume para " +volume);
    }
    
    public void aumentarCanal()
    {
        canal ++;
        System.out.println("Mudando para canal: " +canal);
    }
    public void diminuirCanal()
    {
        canal--;
        System.out.println("Voltando para o canal: " +canal);
    }
}    
