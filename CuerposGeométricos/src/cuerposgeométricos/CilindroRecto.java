/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

/**
 *
 * @author ikerc
 */
public class CilindroRecto extends Cilindro {

    public CilindroRecto(Circulo circuloBase, double generatriz, Colores color, double altura) {
        super(circuloBase, generatriz, color, altura);
    }

    public CilindroRecto(Colores color, double altura) {
        super(color, altura);
    }
    
}
