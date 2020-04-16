
package com.mycompany.area2;

public class Quadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calculo(){
        return (this.lado*this.lado);
    }
}
