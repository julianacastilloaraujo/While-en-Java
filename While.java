/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;
/**
 *
 * @author Familia
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int salir=0;
        while (salir!=5) { 
            System.out.println("las opciones son del 1-5");
            System.out.println("dame la opcion");
            salir=leer.nextInt();
            switch(salir){
                case 1:
                    System.out.println("estas en el caso 1");
                break;
                case 2:
                    System.out.println("estas en el caso 2");
                break;
                default:
                    System.out.println("no has escogido un numero valido");
            }//instrucciones
 
        }
        System.out.println("se romple el ciclo");
    }
    
}
