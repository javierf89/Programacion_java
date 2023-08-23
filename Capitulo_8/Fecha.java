public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia2, int mes2, int año2) {

        if (mes2 > 0) {
            if (mes2 <= 12) {
                mes = mes2;
            }
        }

        if (dia2 > 0) {
            if (dia2 <= 31) {
                dia = dia2;
            }
        }

        if (año2 >= 1950) {
            if (año2 <= 2029) {
                año = año2;
            }
        }
    }


    public void establecerMes(int mes2) {
        if (mes2 > 0) {
            if (mes2 >= 31) {
                mes = mes2;
            }
        }
    }


    public int obtenerMes() {
        return mes;
    }


    public void establecerDia(int dia2) {
        if (dia2 > 0) {
            if (dia2 <= 31) {
                dia = dia2;
            }
        }
    }


    public int obtenerDia() {
        return dia;
    }


    public void establecerAño(int año2) {
        if (año2 >= 1950) {
            if (año2 <= 2050) {
                año = año2;
            }
        }
    }


    public int obtenerAño() {
        return año;
    }


    public void mostrarFecha() {
        System.out.print("\nFecha seleccionada: ");
        System.out.printf("\n%d / %d / %d", obtenerDia(), obtenerMes(), obtenerAño());
    }
}
