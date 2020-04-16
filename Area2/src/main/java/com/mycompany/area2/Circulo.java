package com.mycompany.area2;


public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculo(){
        return ((this.raio*this.raio) * 3.14159);
    }
}
