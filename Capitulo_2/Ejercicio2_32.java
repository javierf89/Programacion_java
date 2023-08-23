import java.util.Scanner;
public class Ejercicio2_32 {
    public static void main(String args[]) {
         Scanner z=new Scanner(System.in);
         int x1,x2,x3,x4,x5;
         int ps=0;
         int ng=0;
         int cr=0;

        
         System.out.println("Valor 1:");
         x1=z.nextInt();
         System.out.println("Valor 2:");
         x2=z.nextInt();
         System.out.println("Valor 3:");
         x3=z.nextInt();
         System.out.println("Valor 4:");
         x4=z.nextInt();
         System.out.println("Valor 5:");
         x5=z.nextInt();

   
         if(x1>0){
             ps=ps+1;
         }

         if(x1<0){
             ng=ng+1;
         }        

         if(0==x1){
             cr=cr+1;
         }        

         if(x2>0){
             ps=ps+1;  
         }        

         if(x2<0){
             ng=ng+1;
         }        

         if(0==x2){
             cr=cr+1;
         }        

         if(x3>0){
             ps=ps+1;
         }        

         if(x3<0){
            ng=ng+1; 
         }        

         if(0==x3){
            cr=cr+1; 
         }        

         if(x4>0){
             ps=ps+1;
         }        

         if(x4<0){
             ng=ng+1;
         }        

         if(0==x4){
             cr=cr+1;
         }       

         if(x5>0){
             ps=ps+1;
         }        

         if(x5<0){
             ng=ng+1;
         }        

         if(0==x5){
            cr=cr+1; 
         }     
 
         System.out.printf("\n%d Positivos\n%d Negativos\n%d Ceros\n", ps, ng, cr);
    }
}
