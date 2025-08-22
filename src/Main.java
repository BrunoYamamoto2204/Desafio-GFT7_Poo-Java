package DesafioPOO.src;

import DesafioPOO.src.classes.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Conteudo conteudo1 = new Cursos();
        Conteudo conteudo2 = new Cursos();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJonson = new Dev();
        devJonson.setNome("Jonson");
        devJonson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jonson: " + devJonson.getConteudosInscritos());

        devJonson.progredir();
        devJonson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJonson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jonson: " + devJonson.getConteudosConcluidos());
        System.out.println("XP: " + devJonson.calcularTotalXp());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
