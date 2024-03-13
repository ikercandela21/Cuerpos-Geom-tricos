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
public class Menu {
     private int opcion;

    public void mostrar() {
        System.out.println(" 1. Nuevo cuerpo geometrico");
        System.out.println(" 2. Mostrar todos");
        System.out.println(" 3. Mostrar prismas");
        System.out.println(" 4. Mostrar circulares");
        System.out.println(" 0. FIN");
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4);
        sc.nextLine(); //limpiar el intro
        return opcion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
}
