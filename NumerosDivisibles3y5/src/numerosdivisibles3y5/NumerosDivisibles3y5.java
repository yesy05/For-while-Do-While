/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosdivisibles3y5;

/**
 *
 * @author 52449
 */
public class NumerosDivisibles3y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("Numeros del 1 al 100 divisibles por 3 y 5:");
           
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                     System.out.println(i);
                }
            }
    }
    
}
