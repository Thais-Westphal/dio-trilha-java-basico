public class Usuario {
    public static void main(String[] args) throws Exception 
    {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar ();
        System.out.println("A TV está ligada? " +smartTv.ligada); 
        System.out.println("------------------------------------");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume);
        System.out.println("------------------------------------");
        smartTv.aumentarCanal();    
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " +smartTv.canal);
    }
}
