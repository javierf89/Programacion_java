public class ProductoLista{
    public static void main(String[] args) {
        System.out.println("Producto de 2, 3, 4, 5: " + producto(2, 3, 4, 5));
        System.out.println("Producto de 1, 2, 3, 4, 5, 6: " + producto(1, 2, 3, 4, 5, 6));
        System.out.println("Producto de 3, 4: " + producto(3, 4));
    }

    public static int producto(int... numeros) {
        int resultado = 1;

        for (int numero : numeros) {
            resultado *= numero;
        }

        return resultado;
    }
}
