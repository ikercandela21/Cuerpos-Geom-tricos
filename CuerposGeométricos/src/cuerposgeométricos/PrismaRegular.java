/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

import java.util.Scanner;

/**
 *
 * @author ikerc
 */
public abstract class PrismaRegular extends CuerpoGeometrico {

    private double lado;

    public PrismaRegular(double lado, Colores color, double altura) {
        super(color, altura);
        this.lado = lado;
    }

    public PrismaRegular(Colores color, double altura) {
        super(color, altura);
    }
    
    public PrismaRegular(){
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void leerLado() {
        double lados;
        System.out.println("Introduce el valor de un lado");
        this.lado = sc.nextDouble();
    }

}
