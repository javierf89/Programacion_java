public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Longitud: " + rectangulo.getLongitud());
        System.out.println("Anchura: " + rectangulo.getAnchura());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Área: " + rectangulo.calcularArea());

        rectangulo.setLongitud(5.0);
        rectangulo.setAnchura(3.0);
        System.out.println("Longitud: " + rectangulo.getLongitud());
        System.out.println("Anchura: " + rectangulo.getAnchura());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}
