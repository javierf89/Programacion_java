import java.util.Scanner;
public class Ejercicio4_29{
    public static void main(String args[]){
         Scanner l=new Scanner(System.in);
         
         System.out.println("Ingrese el tamaño del cuadrado (1-20): ");
         int ld=l.nextInt();
         
         if(ld>=0 && ld<=20){
             for(int x=0;x<ld;x++){
                 System.out.print(" * ");
             }
             System.out.println();
           
             for(int x=0;x<ld-2;x++){
                 System.out.print(" * ");
                 for(int z=0;z<ld-2;z++){
                    System.out.print("   ");
                 }
                 System.out.println(" * ");
              }
          
              for(int x=0;x<ld;x++){
                 System.out.print(" * ");
             }
          }else{
             System.out.println("Parámetro fuera de rango");
        }
    }
}
