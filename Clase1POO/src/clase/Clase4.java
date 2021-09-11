/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Clase4 {
    
    public void escribir(){
        try {
            File f=new File("agenda.txt");
            FileWriter fw=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fw);
            String texto="0";
            Scanner leer=new Scanner(System.in);
            while(texto.length()>0){
                System.out.println("Escribe algo en el archivo");
                texto = leer.nextLine();
                bw.write(texto);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void leer(){
        try {
            Scanner leer=new Scanner(System.in);
            System.out.println("Escribe el nombre del archivo: ");
            String nombre = leer.nextLine();
            File f=new File(nombre);
            FileReader fr=new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String texto = br.readLine();
            System.out.println("El texto del archivo es: " + texto);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public static void main(String[] args) {
        Clase4 obj = new Clase4();
        //obj.escribir();
        obj.leer();
    }
    
}
