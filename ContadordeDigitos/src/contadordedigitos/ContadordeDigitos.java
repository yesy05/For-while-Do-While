/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordedigitos;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class ContadordeDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();
        
        int contador = 0;
        if (numero == 0) {
            contador = 1;
             } else {
            while (numero != 0) {
                numero = numero / 10;
                 contador++;
                 }
             }
         System.out.println("El numero tiene " + contador + " digitos.");
            }
        }
    
    

