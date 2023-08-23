public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    public Complejo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public Complejo sumar(Complejo otroComplejo) {
        double sumaParteReal = this.parteReal + otroComplejo.getParteReal();
        double sumaParteImaginaria = this.parteImaginaria + otroComplejo.getParteImaginaria();
        return new Complejo(sumaParteReal, sumaParteImaginaria);
    }

    public Complejo restar(Complejo otroComplejo) {
        double restaParteReal = this.parteReal - otroComplejo.getParteReal();
        double restaParteImaginaria = this.parteImaginaria - otroComplejo.getParteImaginaria();
        return new Complejo(restaParteReal, restaParteImaginaria);
    }

    public void imprimir() {
        System.out.println("(" + parteReal + ", " + parteImaginaria + ")");
    }
}
