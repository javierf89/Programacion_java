import java.util.Random;

public class Poker {
    private static final int NUMERO_CARTAS_MANO = 5;
    
    public static void main(String[] args) {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();
        
        Carta[] mano = new Carta[NUMERO_CARTAS_MANO];
        
        // Repartir una mano de póker de cinco cartas
        for (int i = 0; i < NUMERO_CARTAS_MANO; i++) {
            mano[i] = miPaqueteDeCartas.repartirCarta();
            System.out.println(mano[i]);
        }
        
        // Verificar las combinaciones de la mano
        if (contienePar(mano)) {
            System.out.println("La mano contiene un par.");
        }
        
        if (contieneDosPares(mano)) {
            System.out.println("La mano contiene dos pares.");
        }
        
        if (contieneTercia(mano)) {
            System.out.println("La mano contiene una tercia.");
        }
        
        if (contienePoker(mano)) {
            System.out.println("La mano contiene un póquer.");
        }
        
        if (contieneCorrida(mano)) {
            System.out.println("La mano contiene una corrida.");
        }
        
        if (contieneEscalera(mano)) {
            System.out.println("La mano contiene una escalera.");
        }
        
        if (contieneFullHouse(mano)) {
            System.out.println("La mano contiene un full house.");
        }
    }
    
    // Método para determinar si una mano contiene un par
    public static boolean contienePar(Carta[] mano) {
        for (int i = 0; i < NUMERO_CARTAS_MANO - 1; i++) {
            for (int j = i + 1; j < NUMERO_CARTAS_MANO; j++) {
                if (mano[i].getValor() == mano[j].getValor()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Método para determinar si una mano contiene dos pares
    public static boolean contieneDosPares(Carta[] mano) {
        int contadorPares = 0;
        for (int i = 0; i < NUMERO_CARTAS_MANO - 1; i++) {
            for (int j = i + 1; j < NUMERO_CARTAS_MANO; j++) {
                if (mano[i].getValor() == mano[j].getValor()) {
                    contadorPares++;
                }
            }
        }
        return contadorPares == 2;
    }
    
    // Método para determinar si una mano contiene una tercia
    public static boolean contieneTercia(Carta[] mano) {
        for (int i = 0; i < NUMERO_CARTAS_MANO - 2; i++) {
            for (int j = i + 1; j < NUMERO_CARTAS_MANO - 1; j++) {
                for (int k = j + 1; k < NUMERO_CARTAS_MANO; k++) {
                    if (mano[i].getValor() == mano[j].getValor() &&
                        mano[j].getValor() == mano[k].getValor()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    // Método para determinar si una mano contiene un póquer
    public static boolean contienePoker(Carta[] mano) {
        for (int i = 0; i < NUMERO_CARTAS_MANO - 3; i++) {
            for (int j = i + 1; j < NUMERO_CARTAS_MANO - 2; j++) {
                for (int k = j + 1; k < NUMERO_CARTAS_MANO - 1; k++) {
                    for (int l = k + 1; l < NUMERO_CARTAS_MANO; l++) {
                        if (mano[i].getValor() == mano[j].getValor() &&
                            mano[j].getValor() == mano[k].getValor() &&
                            mano[k].getValor() == mano[l].getValor()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    // Método para determinar si una mano contiene una corrida
    public static boolean contieneCorrida(Carta[] mano) {
        int[] valores = new int[NUMERO_CARTAS_MANO];
        for (int i = 0; i < NUMERO_CARTAS_MANO; i++) {
            valores[i] = mano[i].getValor();
        }
        // Ordenar los valores de forma ascendente
        Arrays.sort(valores);
        
        for (int i = 0; i < NUMERO_CARTAS_MANO - 1; i++) {
            if (valores[i] != valores[i + 1] - 1) {
                return false;
            }
        }
        return true;
    }
    
    // Método para determinar si una mano contiene una escalera
    public static boolean contieneEscalera(Carta[] mano) {
        return contieneCorrida(mano) && contieneCorridaDeMismoPalo(mano);
    }
    
    // Método para determinar si una mano contiene un full house
    public static boolean contieneFullHouse(Carta[] mano) {
        int[] contadorValores = new int[Carta.NUMERO_CARAS];
        for (Carta carta : mano) {
            contadorValores[carta.getValor() - 1]++;
        }
        
        boolean tieneTresIguales = false;
        boolean tieneDosIguales = false;
        
        for (int contador : contadorValores) {
            if (contador == 3) {
                tieneTresIguales = true;
            } else if (contador == 2) {
                tieneDosIguales = true;
            }
        }
        
        return tieneTresIguales && tieneDosIguales;
    }
}

class PaqueteDeCartas {
    private Carta[] paquete;
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    private static final Random numerosAleatorios = new Random();
    
    public PaqueteDeCartas() {
        String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
            "Ocho", "Nueve", "Diez", "Joto", "Reina", "Rey" };
        String[] palos = { "Corazones", "Diamantes", "Tréboles", "Espadas" };
        
        paquete = new Carta[NUMERO_DE_CARTAS];
        cartaActual = 0;
        
        for (int cuenta = 0; cuenta < paquete.length; cuenta++) {
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
        }
    }
    
    public void barajar() {
        cartaActual = 0;
        
        for (int primera = 0; primera < paquete.length; primera++) {
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }
    
    public Carta repartirCarta() {
        if (cartaActual < paquete.length) {
            return paquete[cartaActual++];
        } else {
            return null;
        }
    }
}

class Carta {
    private final String cara;
    private final String palo;
    public static final int NUMERO_CARAS = 13;
    
    public Carta(String caraCarta, String paloCarta) {
        cara = caraCarta;
        palo = paloCarta;
    }
    
    public String toString() {
        return cara + " de " + palo;
    }
    
    public String getCara() {
        return cara;
    }
    
    public String getPalo() {
        return palo;
    }
    
    public int getValor() {
        if (cara.equals("As")) {
            return 1;
        } else if (cara.equals("Dos")) {
            return 2;
        } else if (cara.equals("Tres")) {
            return 3;
        } else if (cara.equals("Cuatro")) {
            return 4;
        } else if (cara.equals("Cinco")) {
            return 5;
        } else if (cara.equals("Seis")) {
            return 6;
        } else if (cara.equals("Siete")) {
            return 7;
        } else if (cara.equals("Ocho")) {
            return 8;
        } else if (cara.equals("Nueve")) {
            return 9;
        } else if (cara.equals("Diez")) {
            return 10;
        } else if (cara.equals("Joto")) {
            return 11;
        } else if (cara.equals("Reina")) {
            return 12;
        } else if (cara.equals("Rey")) {
            return 13;
        } else {
            return 0;
        }
    }
}
