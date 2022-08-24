/**
Se requiere controlar el número de habitantes de un edificio con 6 pisos y 4 puertas (A, B, C Y D) en cada piso.
Se deberá realizar un programa que pida al usuario que introduzca el numero de habitantes de cada puerta del edificio. 
El programa debe decir la puerta que más habitantes tiene todo el edificio.

Nota: Pueden utilizar el lenguaje de programación que más les acomode.
 **/

package tarea2_habitantesdeunedificio;

import java.util.Scanner;

/**
 * @author Pl_Hm
 */
public class Tarea2_HabitantesDeUnEdificio {

    
    public static void main(String[] args) {
        // Usando Arreglos bidimencionales
          
        int[][] numHabitantes = new int[6][4];
        int mayorR = 0;
        int mayorC = 0;
        int mayorValor = 0;
        Scanner read =new Scanner(System.in);
        int aux = 0;
        
     
        //Pedir datos:
        for(int r = 0; r < numHabitantes.length; r++)
        {
            for(int c = 0; c < numHabitantes[aux].length; c++)
            {
                if (c == 0)
                {
                    System.out.println("Número de habitantes en la puerta del piso " + (r+1) + "  puerta A: ");
                    numHabitantes[r][c] = read.nextInt();
                }
                else{
                    if (c == 1)
                    {
                        System.out.println("Número de habitantes en la puerta del piso " + (r+1) + "  puerta B: ");
                        numHabitantes[r][c] = read.nextInt();
                    }
                    else{
                        if (c == 2)
                        {
                            System.out.println("Número de habitantes en la puerta del piso " + (r+1) + "  puerta C: ");
                            numHabitantes[r][c] = read.nextInt();
                        }
                        else{
                            if (c == 3)
                            {
                                System.out.println("Número de habitantes en la puerta del piso " + (r+1) + "  puerta D: ");
                                numHabitantes[r][c] = read.nextInt();
                            }
                        }
                    }
                }
            
                
            }
            aux++;
        }
        
    
        // Encontrar el mayor número de habitantes
        
        aux = 0;
        for(int r = 0; r < numHabitantes.length; r++)
        {
            for(int c = 0; c < numHabitantes[aux].length; c++)
            {
                if (numHabitantes[r][c] > mayorValor)
                {
                    mayorR = r;
                    mayorC = c;
                    mayorValor = numHabitantes[r][c];
                } 
            }
            aux++;
        }
        
         
        if (mayorC == 0)
        {
            System.out.println("La puerta con mayor número de habitantes es la: " + (mayorR + 1)  + "A con " + mayorValor);
        }
        else{
            if (mayorC == 1)
            {
                System.out.println("La puerta con mayor número de habitantes es la: " + (mayorR + 1)  + "B con " + mayorValor);
            }
            else{
                if (mayorC == 2)
                {
                    System.out.println("La puerta con mayor número de habitantes es la: " + (mayorR + 1)  + "C con " + mayorValor);
                }
                    else{
                        if (mayorC == 3)
                        {
                            System.out.println("La puerta con mayor número de habitantes es la: " + (mayorR + 1)  + "D con " + mayorValor);
                        }
                    }
                }
            }
        
        
    }
    
}
