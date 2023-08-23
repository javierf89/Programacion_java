import java.util.Scanner;

abstract class Figura {
    abstract String obtenerDescripcion();
}

class FiguraBidimensional extends Figura {
    double obtenerArea() {
        return 0.0;
    }
    
    @Override
    String obtenerDescripcion() {
        return "Figura bidimensional";
    }
}

class FiguraTridimensional extends Figura {
    double obtenerArea() {
        return 0.0;
    }
    
    double obtenerVolumen() {
        return 0.0;
    }
    
    @Override
    String obtenerDescripcion() {
        return "Figura tridimensional";
    }
}

class Cuadrado extends FiguraBidimensional {
    private double lado;
    
    Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    double obtenerArea() {
        return lado * lado;
    }
    
    @Override
    String obtenerDescripcion() {
        return "Cuadrado";
    }
}

class Circulo extends FiguraBidimensional {
    private double radio;
    
    Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    String obtenerDescripcion() {
        return "Círculo";
    }
}

class Cubo extends FiguraTridimensional {
    private double lado;
    
    Cubo(double lado) {
        this.lado = lado;
    }
    
    @Override
    double obtenerArea() {
        return 6 * lado * lado;
    }
    
    @Override
    double obtenerVolumen() {
        return lado * lado * lado;
    }
    
    @Override
    String obtenerDescripcion() {
        return "Cubo";
    }
}

class Esfera extends FiguraTridimensional {
    private double radio;
    
    Esfera(double radio) {
        this.radio = radio;
    }
    
    @Override
    double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }
    
    @Override
    double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    
    @Override
    String obtenerDescripcion() {
        return "Esfera";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los datos para las figuras:");
        
        System.out.print("Lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        
        System.out.print("Radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);
        
        System.out.print("Lado del cubo: ");
        double ladoCubo = scanner.nextDouble();
        Cubo cubo = new Cubo(ladoCubo);
        
        System.out.print("Radio de la esfera: ");
        double radioEsfera = scanner.nextDouble();
        Esfera esfera = new Esfera(radioEsfera);
        
        scanner.close();
        
        Figura[] figuras = { cuadrado, circulo, cubo, esfera };
        
        for (Figura figura : figuras) {
            System.out.println(figura.obtenerDescripcion());
            
            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.println("Área: " + figuraBidimensional.obtenerArea());
            }
            
            if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
                System.out.println("Área superficial: " + figuraTridimensional.obtenerArea());
                System.out.println("Volumen: " + figuraTridimensional.obtenerVolumen());
            }
            
            System.out.println();
        }
    }
}
