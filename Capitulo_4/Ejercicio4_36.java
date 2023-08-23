import java.util.Scanner;
public class Ejercicio4_36 {
    public static void main(String args[]) {
        Scanner z=new Scanner(System.in);
        
         System.out.println("Lado 1: ");
         double a=z.nextInt();
         System.out.println("Lado 2: ");
         double b=z.nextInt();
         System.out.println("Lado 3: ");
         double c=z.nextInt();
         
         if (a!=0 && b!=0 && c!=0){
             if (a>b && a>c){
                  if (Math.pow(b, 2)+Math.pow(c, 2)==Math.pow(a, 2)){
                     System.out.printf("\n%f = %f\n",Math.pow(b, 2)+Math.pow(c, 2),Math.pow(a, 2));
                     System.out.println("Los parámetros ingresados conforman las medidas de un triángulo rectángulo");
                  }else{
                     System.out.printf("\n%f = %f\n",Math.pow(b, 2)+Math.pow(c, 2),Math.pow(a, 2));
                     System.out.println("Los parámetros ingresados no conforman las medidas de un triángulo rectángulo");
                  }
             }else if(b>a && b>c){
                   if (Math.pow(a, 2)+Math.pow(c, 2)==Math.pow(b, 2)){
                     System.out.printf("\n%f = %f\n",Math.pow(a, 2)+Math.pow(c, 2),Math.pow(b, 2));
                     System.out.println("Los parámetros ingresados conforman las medidas de un triángulo rectángulo");
                  }else{
                     System.out.printf("\n%f = %f\n",Math.pow(a, 2)+Math.pow(c, 2),Math.pow(b, 2));
                     System.out.println("Los parámetros ingresados no conforman las medidas de un triángulo rectángulo");
                  }
             }else if(c>a && c>b){
                   if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
                     System.out.printf("\n%f = %f\n",Math.pow(a, 2)+Math.pow(b, 2),Math.pow(c, 2));
                     System.out.println("Los parámetros ingresados conforman las medidas de un triángulo rectángulo");
                  }else{
                     System.out.printf("\n%f = %f\n",Math.pow(a, 2)+Math.pow(b, 2),Math.pow(c, 2));
                     System.out.println("Los parámetros ingresados no conforman las medidas de un triángulo rectángulo");
                  }
             }
         }
    }
}
