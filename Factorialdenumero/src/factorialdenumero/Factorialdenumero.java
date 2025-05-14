/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialdenumero;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Factorialdenumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         System.out.print("Ingresa un numero entero para calcular su factorial: ");
          int numero = teclado.nextInt();
          
           long factorial = 1;
           
           for (int i = 1; i <= numero; i++) {
               factorial *= i;
                }
           
           if (numero < 0) {
               System.out.println("El factorial no esta definido para numeros negativos.");
                } else {
               System.out.println("El factorial de " + numero + " es " + factorial);
                }
           
            teclado.close();
           }
    }
    

