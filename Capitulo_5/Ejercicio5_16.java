import java.util.Scanner;
public class Ejercicio5_16 {
    public static void main(String args[]) {
         Scanner z= new Scanner(System.in);

         int num;
         int x=1;

         while (x<=5){
            System.out.printf("Ingrese el valor %d%s \n",x," (Rango: 1-30):");
            num=z.nextInt();
             if ((num>=5) && (num<=30)){
                for (int c=1;c<=num;c++){
                    System.out.println("*");
                }
             }else if (num<0 || num>30){
                 System.out.println("Valor introducido fuera de rango");
             }
            x++;
         }
     }
}
