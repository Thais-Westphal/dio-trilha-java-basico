public class OperadorTernario 
{
    public static void main(String[] args) 
    {
        int a = 8;
        int b = 6;
        String resultado;

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if (a == b) 
        {
            resultado = "Verdadeiro";    
        }
        else
        {
            resultado = "Falso";
        }

        System.out.println(resultado);

        // UTILIZANDO OPERADOR TERNARIO

         resultado = a == b ? "Verdadeiro" : "Falso";
         System.out.println(resultado);

    }
}
