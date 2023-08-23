// Fig 9.13: DemoLabel.java
 // Demuestra el uso de etiquetas.
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 import javax.swing.JFrame;
 public class DemoLabel
 {
 public static void main(String[] args)
{
// Crea una etiqueta con texto solamente
    JLabel etiquetaNorte = new JLabel(“Norte”);

 // crea un icono a partir de una imagen, para poder colocarla en un objeto 
JLabel
ImageIcon etiquetaIcono = new ImageIcon(“GUItip.gif”);

 // crea una etiqueta con un icono en vez de texto
 JLabel etiquetaCentro = new JLabel(etiquetaIcono);

 // crea otra etiqueta con un icono
 JLabel etiquetaSur = new JLabel(etiquetaIcono);

 // establece la etiqueta para mostrar texto (así como un icono)
 etiquetaSur.setText(“Sur”);

// crea un marco para contener las etiquetas
 JFrame aplicacion = new JFrame();

 aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 // agrega las etiquetas al marco; el segundo argumento especifica
 // en qué parte del marco se va a agregar la etiqueta
 aplicacion.add(etiquetaNorte, BorderLayout.NORTH);
 aplicacion.add(etiquetaCentro, BorderLayout.CENTER);
 aplicacion.add(etiquetaSur, BorderLayout.SOUTH);

 aplicacion.setSize(300, 300); 
 aplicacion.setVisible(true);
 } // fin de main
 } // fin de la clase DemoLabel