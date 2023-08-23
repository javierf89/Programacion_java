import java.util.Scanner;
public class Ejercicio5_24{
    public static void main(String args[]) {
         int f=9; 
         
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
