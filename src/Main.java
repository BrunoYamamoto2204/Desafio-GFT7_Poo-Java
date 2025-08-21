package DesafioPOO.src;

import DesafioPOO.src.classes.Cursos;
import DesafioPOO.src.classes.Mentoria;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
