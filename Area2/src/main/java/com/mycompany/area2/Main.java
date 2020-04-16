
package com.mycompany.area2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valida;
        int valida2;
        
        System.out.println("Para calcular circulo digite 1");
        valida = scan.nextInt();
        
        do{
        switch(valida){
        
        case 1:  
            Circulo circulo1 = new Circulo();
            System.out.println("Valor de raio:");
            circulo1.setRaio(scan.nextDouble());
            System.out.println("Area do Circulo: " + circulo1.calculo());
         break;
        
        default: System.out.println("Valor nao encontrado");
        }
        
         System.out.println("Digite 1 se quiser continuar, se não digite 0");
         valida2 = scan.nextInt();
         
        } while (valida2 == 1);
        /*
        Circulo circulo1 = new Circulo();
        System.out.println("Valor de raio:");
        circulo1.setRaio(scan.nextDouble());
        
        Quadrado quadrado1 = new Quadrado();
        System.out.println("Valor dos lados");
        quadrado1.setLado(scan.nextDouble());
        
        Retangulo retangulo1 = new Retangulo();
        System.out.println("Digite o valor da base:");
        retangulo1.setBase(scan.nextDouble());
        System.out.println("Digite o valor da altura:");
        retangulo1.setAltura(scan.nextDouble());
        
        Trapezio trapezio1 = new Trapezio();
        System.out.println("Digite a base Maior:");
        trapezio1.setbMaior(scan.nextDouble());
        System.out.println("Digite a base Menor");
        trapezio1.setbMenor(scan.nextDouble());
        System.out.println("Digite a altura:");
        trapezio1.setAltura(scan.nextDouble());
        
        Triangulo tri1 = new Triangulo();
        System.out.println("Digite a base:");
        tri1.setBase(scan.nextDouble());
        System.out.println("Digite a altura");
        tri1.setAltura(scan.nextDouble());
        
        System.out.println("Area do Circulo: " + circulo1.calculo());
        System.out.println("Area do Quadrado: " + quadrado1.calculo());
        System.out.println("Area do Retangulo: " + retangulo1.calculo());
        System.out.println("Area do Trapezio: " + trapezio1.calculo());
        System.out.println("Area do Triangulo: " + tri1.calculo());
    }
    */
}
}