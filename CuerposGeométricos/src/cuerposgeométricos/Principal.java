/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuerposgeométricos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<CuerpoGeometrico> array = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opcion = menu.getOpcion();
        switch (opcion) {
            case 1 ->
                crearObjeto();
            case 2 ->
                mostrarTodos();
            case 3 ->
                mostrarPrismas();
//            case 4 ->
//                
//            case 0 ->
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
                cg = new CilindroRecto();
            case 5 ->
                cg = new CilindroOblicuo();
            case 6 ->
                cg = new Cono();
            case 7 ->
                cg = new TroncoDeCono();

        }
        if (array.contains(cg)) {
            System.out.println("El valor ya existe");
        } else {
            array.add(cg);
        }
    }

    public static void mostrarTodos() {
        Collections.sort(array); //comparar por colores por que en la clase curpo geometrico lo hemos modificado
        System.out.println(array);

//        Comparar por altura
        
//        Collections.sort(array, new Comparator<CuerpoGeometrico>() {
//            @Override
//            public int compare(CuerpoGeometrico o1, CuerpoGeometrico o2) {
//                return Double.compare(o1.getAltura(), o2.getAltura());
//            }
//        });
    }
    public static void mostrarPrismas(){
        if(array.contains())
    }
}
