public class Ejercicio5_15 {
    public static void main(String args[]) {
         int hg=10;
         
         for (int x=1;x<=hg;x++){       
             
            for (int j=1;j<=x;j++){
                System.out.print("*");
            }
            
            for (int z=x+1;z<=hg;z++){
                System.out.print(" ");
            }
            
            
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            
            for (int s=1;s<=hg+1-x;s++){
                System.out.print("*");
            }
            for (int c=hg-1-x;c<=hg;c++){
                System.out.print(" ");
            }
            
            
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            
            for (int m=1;m<x;m++){
                System.out.print(" ");
            }
            
            for (int n=x;n<=hg;n++){
                System.out.print("*");
            }
            
            
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            
            for (int j=1;j<=hg-x;j++){
                System.out.print(" ");
            }
            
            for (int d=hg-x;d<hg;d++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
