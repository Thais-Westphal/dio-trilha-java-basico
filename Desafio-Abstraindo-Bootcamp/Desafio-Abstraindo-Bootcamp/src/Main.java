import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args) 
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java Basico ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C");
        curso2.setDescricao("Curso de estrutura de dados com C ");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Curso do básico ao avançado com C#");
        curso2.setCargaHoraria(5);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria java básico");
        mentoria.setData(LocalDate.now());
        
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev dev = new Dev();
        dev.setNome("Thais");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + dev.getNome() + " está inscrito (a) nos conteúdos: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos concluidos: " + dev.getConteudosConcluidos());
        System.out.println("===================================");
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("===================================");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + dev2.getNome() + " está inscrito (a) nos conteúdos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("===================================");
        System.out.println("XP: " + dev2.calcularTotalXp());
        dev2.cancelarInscricaoBootcamp(bootcamp);
        System.out.println("Dev: " + dev2.getNome() +  " cancelou a inscrição no BootCamp: " + dev2.getConteudosInscritos());

    }
    
}
