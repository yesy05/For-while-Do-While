/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciadecuadros;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class SecuenciadeCuadros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         int numero, i = 1;
         
          System.out.print("Ingresa un numero entero positivo: ");
           numero = teclado.nextInt();
           
           System.out.println("Cuadrados del 1 al " + numero + ":");
           
           do {
               System.out.println(i + " x " + i + " = " + (i * i));
                i++;
                 } while (i <= numero);
           }
    }
    

