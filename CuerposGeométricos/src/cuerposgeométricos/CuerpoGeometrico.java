/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

import java.util.Scanner;

public class CuerpoGeometrico {

    private Colores color;
    private double altura;
    static Scanner sc = new Scanner(System.in);

    public CuerpoGeometrico(Colores color, double altura) {
        this.color = color;
        this.altura = altura;
    }

    public CuerpoGeometrico() {
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void leerValores() {
        String colores;
        double alturas;
        System.out.print("Que color es: ");
        colores = sc.nextLine();
        this.color.valueOf(colores);
        System.out.print("Que altura tiene: ");
        alturas = sc.nextDouble();
//        altura=this.setAltura(alturas);
        this.altura = sc.nextDouble();
    }
}
