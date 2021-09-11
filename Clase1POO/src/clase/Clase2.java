/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jesus
 */
public class Clase2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b = 0;
        float c;
        while (true) {
            try {
                System.out.println("Escribe el primer número : ");
                a = leer.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Un error ocurrió");
                leer = new Scanner(System.in);
            }
        }
        while (true) {
            try {
                System.out.println("Escribe el segundo número : ");
                b = leer.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Un error ocurrió");
                leer = new Scanner(System.in);
            }
        }
        while (true) {
            try {
                c = a / (float) b;
                System.out.println("El resultado es: " + c);
                break;
            } catch (Exception e) {
                System.out.println("Un error ocurrió");
                leer = new Scanner(System.in);
            }
        }
        System.out.println("Escribe un número: ");
        int d = leer.nextInt();
        System.out.println("El cuadrado es: " + (d * d));
    }
}
