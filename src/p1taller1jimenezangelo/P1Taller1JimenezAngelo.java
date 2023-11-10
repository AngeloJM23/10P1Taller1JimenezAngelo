/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1taller1jimenezangelo;
import java.util.Scanner;
/**
 *
 * Nombre: Angelo Jimenez
 * Tema: Trabajo Grupal
 * Ingeniera: Veronica Martinez
 */
public class P1Taller1JimenezAngelo {

    /**
     * @param args the command line arguments
     */
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double op1, op2;
        System.out.print("*********************  \n  ");
        System.out.print("Nombre: Angelo Jimenez \n");
        System.out.print("Tema: Trabajo en clase¨\n");
         System.out.print("********************* \n");

        System.out.print("Introduzca el primer operando: ");
        op1 = sc.nextDouble();
        System.out.print("\nIntroduzca el segundo operando: ");
        op2 = sc.nextDouble();
         System.out.print("\nEl resultado de la suma es: ");
        System.out.println(op1 + op2);  
        System.out.print("\nEl resultado de la resta es : ");
        System.out.println(op1 - op2);
        System.out.print("\nEl resultado de la multiplicacion es : ");
        System.out.println(op1 * op2);
        System.out.print("\nEl resultado de la division es : ");
        System.out.println(op1 / op2);
        
        
    }

}
    

