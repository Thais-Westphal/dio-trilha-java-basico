public class SistemaCadastro 
{
    public static void main(String[] args) 
    {
        //chamando o método construtor
        Pessoa p1 = new Pessoa("123.456.789-1", "Joana Santos");
        p1.setEndereco("RUA DAS MARIAS");    
        System.out.println(p1.getNome() + " portadora do cpf: " + p1.getCpf() + " ,reside no endereço " + p1.getEndereco());

    }    
}
