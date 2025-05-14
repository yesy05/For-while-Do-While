/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalnovocal;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class VocalNoVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
          char letra;
          
          System.out.println("Escribe letras. Escribe un espacio para salir.");
          
          do {
              System.out.print("Ingresa una letra: ");
               letra = teclado.next().charAt(0);
               
                letra = Character.toLowerCase(letra);
                
                if (letra == ' ') {
                     System.out.println("Programa terminado.");
                     } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                         System.out.println("Es una vocal.");
                         } else {
                          System.out.println("Es una consonante.");
                          }
                
                 } while (letra != ' ');
                }
          }
    
    

