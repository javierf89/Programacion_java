import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio2_15 {
    public static void main(String[] args) {
         DecimalFormat v=new DecimalFormat("0.00");
         Scanner z = new Scanner(System.in);
        
        
         System.out.println("Ingrese valor 1: ");
         double x1=z.nextDouble();
         System.out.println("Ingrese valor 2: ");
         double x2=z.nextDouble();
        
        
         double sm=x1+x2;
         double diff=x1-x2;
         double pr=x1*x2;
         double cc=x1/x2;
        
        
         System.out.println("----------------------------------------" );
         System.out.println("----------------------------------------" );
        
         System.out.println("Suma: "+v.format(sm));
         System.out.println("Diferencia: "+v.format(diff));
         System.out.println("Producto: "+v.format(pr));
         System.out.println("Cociente: "+v.format(cc));
        
         System.out.println("----------------------------------------" );
         System.out.println("----------------------------------------" );
    }
}
