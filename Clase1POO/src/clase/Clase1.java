/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Jesus
 */
public class Clase1 {
    public static void main(String [] args){   
        int arreglo [] = {3,7,5,6,1,0,9,8,2,4};
        Clase1 obj = new Clase1();
        //Clase objeto = new Clase();
        obj.consultar(arreglo);
        System.out.println("********");
        obj.ordenar(arreglo);
        
    }//Esta cierra el main
    
    public void consultar(int a []){
        for(int i=0;i<a.length;i++){
            System.out.println("Arreglo : " + a[i]);
        }//Esta cierra el For
    }//Esta cierra el método de consultar
    
    public void ordenar(int a []){
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a.length-1; j++) {
                if(a[j+1]<a[j]){
                    int aux=a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }//Cierra el if
            }//Cierra el for j
        }//Cierra el for i
        consultar(a);
    }
}//Esta cierra la clase
