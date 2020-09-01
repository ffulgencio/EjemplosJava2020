package com.company;

public class Ejemplo2 {
    public static void main(String[] args){
        // ejemplo 2
        // un programa que determina el capital y el porciento de acciones de una startup
        double socio1 = 15000;
        double socio2 = 36000;
        double socio3 = 18000;
        double capital = socio1 + socio2 + socio3;

        System.out.println(capital);

        double percent1 =  (socio1 * 100) / capital;
        double percent2 =  (socio2 * 100) / capital;
        double percent3 =  (socio3 * 100) / capital;

        System.out.println(percent3);
    }
}
