public class ExemploForArray 
{
    // ExemploFor.java
    public static void main(String[] args) 
    {
        String alunos[] = { "THAIS", "CATIA", "ERVANDIL", "LUCAS" };
    
        // Observe que, como os arrays começam com índice igual a 0 (zero)
        for (int i = 0; i <alunos.length; i++) 
        {
            System.out.println("O aluno no indice i = " + i + " é " + alunos[i]);
        }
        
        System.out.println("===============================");

        // Forma abreviada
	    for(String aluno : alunos) 
        {
        System.out.println(aluno); 
        }
    }
}
