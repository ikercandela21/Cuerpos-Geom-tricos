/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

/**
 *
 * @author ikerc
 */
public class Circulo {

    private Circulo radio;

    public Circulo(Circulo radio) {
        this.radio = radio;
    }

    public Circulo getRadio() {
        return radio;
    }

    public void setRadio(Circulo radio) {
        this.radio = radio;
    }

    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
}
