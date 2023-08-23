import java.util.Scanner;
public class Ejercicio4_35 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
        
         System.out.println("Lado 1: ");
         int a=z.nextInt();
         System.out.println("Lado 2: ");
         int b=z.nextInt();
         System.out.println("Lado 3: ");
         int c=z.nextInt();
         
         if (a!=0 && b!=0 && c!=0){
             if (a+b>c && a+c>b && c+b>a){
                  System.out.printf("\n%d > %d",a+b,c);
                  System.out.printf("\n%d > %d",a+c,b);
                  System.out.printf("\n%d > %d\n",c+b,c);
                  System.out.println("Los parámetros ingresados conforman las medidas de un triángulo");
             }else{
                  System.out.printf("\n%d > %d",a+b,c);
                  System.out.printf("\n%d > %d",a+c,b);
                  System.out.printf("\n%d > %d\n",c+b,c);
                  System.out.println("Los parámetros ingresados no conforman las medidas de un triángulo");
             }
         }
    }
}
