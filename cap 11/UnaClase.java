public class UnaClase {
    public UnaClase() throws Exception {
        
        throw new Exception("Ha ocurrido una excepción en el constructor de UnaClase");
    }

    public static void main(String[] args) {
        try {
           
            UnaClase objeto = new UnaClase();
        } catch (Exception e) {
            
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
