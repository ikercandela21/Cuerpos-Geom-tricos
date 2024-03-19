/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuerposgeométricos;

import java.util.Scanner;

public abstract class CuerposGeométricos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion = menu.getOpcion();
        switch (opcion) {
            case 1 ->
                crearObjeto();
            case 2 ->
                
            case 3 ->
                
            case 4 ->
                
            case 0 ->
                
        }
    }

    public static void crearObjeto() {
        CuerpoGeometrico cg = null;
        Menu m = new Menu();
        int opcion;
        opcion = m.creacionPrismas();
        switch (opcion) {
            case 1 ->
                cg = new PrismaRegularTriangular();
            case 2 ->
                cg = new PrismaRegularCuadrangular();
            case 3 ->
                cg = new Circulo();
            case 4 ->
                
            case 5 ->
                
            case 6 ->
                
            case 7 ->
                
            case 8 ->
                
            case 9 ->
                
            case 10 ->
                
                
        }

    }
}
