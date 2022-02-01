import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso= new Curso("java","Bootcamp Java Spread",97);
        Mentoria mentoria = new Mentoria();
        Curso curso1 = new Curso();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java Spread");
        mentoria.setData(LocalDate.now());

        curso1.setTitulo("JavaScript");
        curso1.setDescricao("Curso de JavaScript TCS");
        curso1.setCargaHoraria(68);

       /* System.out.println(curso1.toString());
        System.out.println(curso.toString());
        System.out.println(mentoria.toString());
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1= new Dev();
        dev1.setNome("Fabio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluidos" + dev1.getConteudoConcluidos());


        Dev dev2= new Dev();
        dev1.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos concluidos" + dev2.getConteudoConcluidos());




    }
}
