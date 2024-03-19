/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

/**
 *
 * @author ikerc
 */
public abstract class CuerpoGeometricoCircular extends CuerpoGeometrico {
    private Circulo circuloBase;
    private double generatriz;

    public CuerpoGeometricoCircular(Circulo circuloBase, double generatriz, Colores color, double altura) {
        super(color, altura);
        this.circuloBase = circuloBase;
        this.generatriz = generatriz;
    }

    public CuerpoGeometricoCircular(Colores color, double altura) {
        super(color, altura);
    }

    public CuerpoGeometricoCircular() {
    }
    
    
}
