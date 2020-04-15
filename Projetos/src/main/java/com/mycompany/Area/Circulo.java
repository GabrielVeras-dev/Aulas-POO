package com.mycompany.Area;


public class Circulo {
    private double r;
    // double n = 3.14159;
    
    public double calcularArea (){
        double area = 3.14159 *(this.r*this.r); 
        return area;
    }
    
    public void setRaio(double r){
        this.r = r;
    }
    
    public double getRaio(){
        return this.r;
    }
} 