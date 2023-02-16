package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1;    
        num1= lectura.nextInt();

        System.out.println(num1);

        lectura.close();
    }
    
}
