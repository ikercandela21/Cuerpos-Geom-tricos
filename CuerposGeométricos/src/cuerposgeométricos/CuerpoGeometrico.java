/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

import java.util.Objects;
import java.util.Scanner;

public abstract class CuerpoGeometrico implements Comparable<CuerpoGeometrico> {

    private Colores color;
    private double altura;
    private double area;
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

    public void getArea(double area) {
        this.area = area;
    }

    public void setArea(double area) {
        this.area = area;
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

    @Override
    public int compareTo(CuerpoGeometrico o) {
        return this.color.compareTo(o.getColor());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.altura) ^ (Double.doubleToLongBits(this.altura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuerpoGeometrico other = (CuerpoGeometrico) obj;
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        return this.color == other.color;
    }

}
