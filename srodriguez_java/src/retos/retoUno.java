package retos;
import java.util.Scanner;

public class retoUno {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        float c,f;

        System.out.println("Ingrese los grados F° que quiera conventir a C°");
        f = pc.nextFloat();
        c = (f-32) * 5/9 ;
        System.out.println("En grados C serian:" +c );
        
pc.close();
    }
}
