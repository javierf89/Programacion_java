public class CatchOrderDemo {
    public static void main(String[] args) {
        try {
     
            throwExceptions();
        } catch (ExceptionA e) {
            System.out.println("Caught ExceptionA: " + e.getMessage());
        } catch (ExceptionB e) {
            System.out.println("Caught ExceptionB: " + e.getMessage());
        }
    }

    public static void throwExceptions() throws ExceptionA, ExceptionB {
        
        throw new ExceptionB("This is ExceptionB");

        /
    }
}

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}
/*En este ejemplo, tenemos dos excepciones personalizadas ExceptionA y ExceptionB, donde ExceptionB
 es una subclase de ExceptionA. Cuando llamamos al método throwExceptions, lanzamos una excepción 
 ExceptionB, pero si intentáramos lanzar una excepción de tipo ExceptionA después de eso, el compilador
  generaría un error porque ExceptionB es una subclase de ExceptionA y ya se ha capturado la excepción 
  ás específica.*/