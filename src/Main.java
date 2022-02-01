import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1.toString());
        System.out.println(curso.toString());
        System.out.println(mentoria.toString());


    }
}
