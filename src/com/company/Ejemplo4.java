package com.company;

public class Ejemplo4 {

    public static void main(String[] args) {
        // calcular isr
        double top1 = 416220.00;
        double top2 = 624329.00;
        double top3 = 867123.00;

        double salario = 85000;
        double salarioAnual = salario * 12;
        double isr = 0.00;

        if (salarioAnual <= top1){
            System.out.println("Exento");
        }else if( salarioAnual <= top2 ){
            isr = ((salarioAnual - top1) * 0.15);
        }else if( salarioAnual <= top3 ){
            isr = ((salarioAnual - top2) * 0.20 + 31216.00);
        }else {
            isr = ((salarioAnual - top3) * 0.25 + 79776.00);
        }

        System.out.printf("IRS = %.2f",isr / 12); // %.2f Muestra solo dos decimales

    }
}
