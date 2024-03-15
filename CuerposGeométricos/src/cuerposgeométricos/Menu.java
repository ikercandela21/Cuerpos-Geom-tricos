/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuerposgeométricos;

import static cuerposgeométricos.CuerposGeométricos.sc;
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

    public int creacionPrismas() {
        System.out.println("Que clase es el cuerpo geometrico");
        System.out.println("Opcion 1 -> Prisma Regular Triangualr"
                + "Opcion 2 -> Prisma Regular Cuadrangular"
                + "Opcion 3 -> Circulo"
                + "Opcion 4 -> Cuerpo Geometrico Circular"
                + "Opcion 5 -> Cuerpo Geometrico Circular"
                + "Opcion 6 -> Cilindro"
                + "Opcion 7 -> Cilindro Recto"
                + "Opcion 8 -> Cilindro Oblicuo"
                + "Opcion 9 -> Cono"
                + "Opcion 10 -> Tronco de Cono");
        int opcion = sc.nextInt();
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
