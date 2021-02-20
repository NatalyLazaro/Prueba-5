
package tarea3.pkg2;
import java.util.Scanner;
/**
 *
 * @author arlet
 */
public class Tarea32 
{
public static void main(String[] args) 
{
 int resultado =(int)(Math.random()*100);
 Scanner sc = new Scanner(System.in); 
 int b, i, opcion = 0;
    do
    {
     System.out.println("\t\t\tBIENVENIDO\n");
     System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.");
     System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: "); 
     b = sc.nextInt(); 
    for (i=0; i<=4; i++)    
    {    
        if (resultado == b) 
    {  
        System.out.println("¡FELICIDADES! ¡Has acertado!"); 
        break;
    } 
    else if (i == 4) 
    { 
         System.out.println("Lo siento: ¡has perdido!"); 
         System.out.println("El número es: " +  resultado); break; 
    } 
        else if (resultado > b) 
        {   System.out.println("El número es MAYOR que " + b);}
        else if (resultado < b)
        { System.out.println("El número es MENOR que " + b); }
        if (i <=1) 
        { 
            System.out.print("Inténtalo de nuevo: "); 
            b = sc.nextInt(); 
        } 
            else if (i ==2) 
            { 
                int x = (int) (resultado/10);
                System.out.print("Inténtalo de nuevo: ");
                b = sc.nextInt(); 
            } 
            else if (i >= 3) 
            {
                System.out.print("Ultimo intento: ");
                b = sc.nextInt(); 
            }
        }
            System.out.print("Desea jugar nuevamente? ");
            System.out.print("Ingrese 1 para seguir y otra tecla para salir: ");
            opcion = sc.nextInt();
    } while (opcion == 1);
  }
}
