public class Ejercico7_27{
    public static void main(String[] args){
        int  arraySize = 200;
        boolean[] booleanArray = new boolean[arraySize];
        for (int i=0 ; i< arraySize; i++){
            
            booleanArray[i]=true;
        }

        for (int i = 2; i < arraySize; i++) {
            if (booleanArray[i]) {
                for (int j = i + i; j < arraySize; j += i) {
                    booleanArray[j] = false;
                }
            }
        }

        
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Índice " + i + ": " + booleanArray[i]);
        }


    }

   

}