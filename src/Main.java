import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoDev = new Curso();
        cursoDev.setTitulo("curso java");
        cursoDev.setDescricao("descrição curso java");
        cursoDev.setCargaHoraria(8);

        Curso cursoTester = new Curso();
        cursoTester.setTitulo("curso js");
        cursoTester.setDescricao("descrição curso js");
        cursoTester.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(cursoDev);
        System.out.println(cursoTester);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoDev);
        bootcamp.getConteudos().add(cursoTester);
        bootcamp.getConteudos().add(mentoria);

        Dev devNoca = new Dev();
        devNoca.setNome("Noca");
        devNoca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Noca:" + devNoca.getConteudosInscritos());
        devNoca.progredir();
        devNoca.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Noca:" + devNoca.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Noca:" + devNoca.getConteudosConcluidos());
        System.out.println("XP:" + devNoca.calcularTotalXp());

        System.out.println("-------");

        Dev devXibungo = new Dev();
        devXibungo.setNome("Joao");
        devXibungo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Xibungo:" + devXibungo.getConteudosInscritos());
        devXibungo.progredir();
        devXibungo.progredir();
        devXibungo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Xibungo:" + devXibungo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Xibungo:" + devXibungo.getConteudosConcluidos());
        System.out.println("XP:" + devXibungo.calcularTotalXp());

    }

}
