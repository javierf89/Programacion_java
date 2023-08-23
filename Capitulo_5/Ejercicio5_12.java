public class Ejercicio5_12 {
    public static void main(String args[]) {
         int pr=1;
         for (int x=1;x<=15;x++){
             if(x%2!=0 )
             pr*=x;
         }
        System.out.printf("\nProducto de valores impares (1-15): %d\n", pr );
    }
}
