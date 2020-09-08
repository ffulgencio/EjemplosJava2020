package com.company;

import com.company.ejercicio5.*;


public class Program {

    public static void main(String[] args) {

        // plantilla -> crear un curso
        Curso c1 = new Curso("java",20,0);
        c1.display();

        Curso c2 = new Curso("sql",30,10);
        c2.display();

        Curso c3 = new Curso();

        Curso c4 = new Curso("Python",10);
        c4.display();
        c4.setCupos(31);
        c4.display();
        System.out.println(c4.getCupos());

        Corolla c = new Corolla();

        CursoVerano c5 = new CursoVerano();
        c5.setCupos(15);
        c5.display();

        Civic cv = new Civic();

    }

}
