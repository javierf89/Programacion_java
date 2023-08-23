import java.util.Scanner;
public class Ejercicio4_17 {
    public static void main(String args[]) {
         Scanner z = new Scanner(System.in);
         
         
         float l;
         float km;
         float kml;
         float kmlt=0;
 
         System.out.println("Cantidad de litros: (-1/0 para terminar): ");
         l=z.nextFloat();
 
         while(l>0){
            System.out.println("Kilómetros recorridos:");
            km=z.nextFloat();
            
            kml=km/l;
            kmlt+=kml;
            
            System.out.printf("\nKilómetros por litro: %f\n\n",kml);
            System.out.println("Cantidad de litros: (-1/0 para terminar): ");
            l=z.nextFloat();
            
            if (l<=0){
                  System.out.printf("\nKilómetros por litro totales: %f",kmlt);
            }
         } 
    }
}
