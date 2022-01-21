package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoVida = new Curso("N prograstine","Aprenda a nao prograstinar",1000);
        System.out.println(cursoVida);
        Mentoria mentorando = new Mentoria("Aprenda a mentorar","tornese um mentor",10, LocalDate.now());
        System.out.println(mentorando);

    }
}
