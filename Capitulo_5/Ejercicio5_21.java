public class Ejercicio5_21 {
    public static void main(String args[]) {
        int hg=500;
        for (int x=1;x<=hg;x++){
            for (int y=1;y<=hg;y++){
                for (int z=1;z<=hg;z++){      
                    if (x*x==y*y+z*z){
                        System.out.printf("%3d\t%3d\t%3d\n", x, y, z);
                    }
                }
            }
        }
    }
}
