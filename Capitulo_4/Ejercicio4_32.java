public class Ejercicio4_32 {
    public static void main(String args[]) {
        for (int x=1 ; x<=8; x++){
             for (int z=1; z<=8 ; z++){
                 System.out.print("* ");
             }
             if (x%2==0){
                 System.out.println(" ");
             }else{
                 System.out.println("");
                 System.out.print(" ");
             }
         }
    }
}
