
package com.mycompany.Area;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Circulo circulo1 = new Circulo();
        System.out.println("Valor de raio:");
        circulo1.setRaio(scan.nextDouble());
        
        System.out.println("Area: " +circulo1.calcularArea());
    }
    
}
