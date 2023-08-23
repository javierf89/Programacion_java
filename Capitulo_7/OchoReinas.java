public class OchoReinas {
    private static final int N = 8; // Tamaño del tablero

    public static void main(String[] args) {
        int[][] tablero = new int[N][N];
        colocarReinas(tablero, 0);
        imprimirTablero(tablero);
    }

    public static boolean colocarReinas(int[][] tablero, int fila) {
        if (fila == N) {
            return true; // Todas las reinas colocadas con éxito
        }

        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1;
                if (colocarReinas(tablero, fila + 1)) {
                    return true;
                }
                tablero[fila][col] = 0; // Backtrack si no es posible
            }
        }
        return false;
    }

    public static boolean esSeguro(int[][] tablero, int fila, int col) {
        // Verificar filas y columnas
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) {
                return false;
            }
        }
        for (int i = 0; i < col; i++) {
            if (tablero[fila][i] == 1) {
                return false;
            }
        }
        // Verificar diagonales
        for (int i = fila, j = col; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        for (int i = fila, j = col; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
