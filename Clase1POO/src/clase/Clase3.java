/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Clase3 {
    
    int cali [] =new int[5];
    
    public void llenar(){
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < cali.length; i++) {
            try{
                System.out.println("Escribe el valor del arreglo " + i + " : ");
                cali[i] = leer.nextInt();
            }catch(Exception e){
                System.out.println("Ocurrió un problema");
                i--;
                leer = new Scanner(System.in);
            }
        }
    }//Termina la llave del método llenar
    
    public void consultar(){
        for (int i = 0; i < cali.length; i++) {
            System.out.println("Arreglo "+i+" : " + cali[i]);
        }
    }
    
    public static void main(String [] args){
        Clase3 obj = new Clase3();
        obj.llenar();
        System.out.println("***********************");
        obj.consultar();
    }
}
