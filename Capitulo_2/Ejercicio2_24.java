import java.util.Scanner;
public class Ejercicio2_24 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
         int x1, x2, x3, x4, x5;
 
         System.out.print("Valor 1: ");
         x1=z.nextInt();
 
         System.out.print("Valor 2: ");
         x2=z.nextInt();
 
         System.out.print("Valor 3: ");
         x3=z.nextInt();
 
         System.out.print("Valor 4: ");
         x4=z.nextInt();
 
         System.out.print("Valor 5: ");
         x5=z.nextInt();
 
         z.close();
 
         if (x1<x2) {
             x1+=x2; 
             x2=x1-x2;
             x1-=x2; 
         }
         if (x1<x3) {
             x1+=x3;
             x3= x1-x3;
             x1 -= x3;
         }
         if (x1<x4) {
             x1+=x4;
             x4=x1-x4;
             x1-=x4;
         }
         if (x1<x5) {
             x1+=x5; 
             x5=x1-x5;
             x1-=x5;
         }
 
         if (x2<x3) { 
             x2+=x3; 
             x3=x2-x3;
             x2-=x3;
         }
         if (x2<x4) { 
             x2+=x4; 
             x4=x2-x4; 
             x2-=x4; 
         }
         if (x2<x5) { 
             x2+=x5; 
             x5=x2-x5; 
             x2-=x5; 
         }
 
         if (x3<x4) {
             x3+=x4; 
             x4=x3-x4; 
             x3-=x4;
         }
         if (x3< x5) {
             x3+=x5; 
             x5=x3-x5;
             x3-=x5; 
         }
  
         if (x4<x5){ 
            x4+=x5; 
            x5=x4-x5;
            x4-=x5; 
          }
         
         System.out.printf("\n%d  %d", x1,  x5);
    }
}
