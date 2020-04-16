
package com.mycompany.area2;


public class Trapezio {
    private double bMaior;
    private double bMenor;
    private double altura;

    public double getbMaior() {
        return bMaior;
    }

    public void setbMaior(double bMaior) {
        this.bMaior = bMaior;
    }

    public double getbMenor() {
        return bMenor;
    }

    public void setbMenor(double bMenor) {
        this.bMenor = bMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculo(){
        return ((this.bMaior + this.bMenor) * this.altura ) / 2;
    }
}
