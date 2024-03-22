/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

/**
 *
 * @author ikerc
 */
public abstract class Cilindro extends CuerpoGeometricoCircular {

    public Cilindro(Circulo circuloBase, double generatriz, Colores color, double altura) {
        super(circuloBase, generatriz, color, altura);
    }

    public Cilindro() {
    }

    public Cilindro(Colores color, double altura) {
        super(color, altura);
    }
    
    
    
}
