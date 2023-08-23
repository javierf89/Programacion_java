import java.util.Scanner;
public class Ejercicio5_25 {
    public static void main(String args[]) {
        Scanner z=new Scanner(System.in);
        
         
         boolean cd=false;
         int f=9; 
         do{
            System.out.print("Ingrese el número de filas a dibujar  (valor numérico impar): ");
            f=z.nextInt();
            if(f>0 && f%2!=0){
                cd=true;
            }
         }while (!cd);
         
         System.out.println("");
         
         int Fnum=f/2+1;
                 
         for(int hg=1;hg<=Fnum;hg++){
             for(int y=1;y<=Fnum-hg;y++){
                System.out.print(" ");
             }
             for(int x=1;x<=(2*hg)-1;x++){
                 System.out.print("*");
             }
             System.out.println("");         
         }
         
         Fnum--;
         
         for(int hg=1;hg<=Fnum;hg++){
             for(int y=1;y<=hg;y++){
                 System.out.print(" ");
             }
             for(int x=1;x<=(Fnum-hg)*2 +1;x++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
