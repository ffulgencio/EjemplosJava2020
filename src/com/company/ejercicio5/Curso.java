package com.company.ejercicio5;

public class Curso {
    // estado // campos
    private int participantes;
    private int cupos;
    private String titulo;

    // constructor
    public Curso(){

    }

    public Curso(String t, int c){
        this.titulo = t;
        this.cupos = c;
    }

    public Curso(String titulo,int cupos, int participantes){
        this.titulo = titulo;
        this.cupos = cupos;
        this.participantes = participantes;
    }

    public void display(){
        System.out.printf("Curso: %s Cupo: %d  Participante: %d \n",this.titulo, this.cupos, this.participantes);
    }

    // comportamiento
    public void agregarParticipante(){
        participantes++;
    }

    public int getCupos(){
        return this.cupos;
    }

    public void setCupos(int value){
        if (value <= 30)
            this.cupos = value;
        else
            System.out.println("El valor dado supera la disponibilidad del curso.");
    }
}
