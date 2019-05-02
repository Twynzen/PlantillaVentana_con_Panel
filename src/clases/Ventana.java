
package clases;

import javax.swing.JFrame;


public class Ventana extends JFrame{
    
    private final int ANCHO = 800, ALTO = 500;
    private Tablerojuego lamina;
    public Ventana(){
    setTitle("Pong");
    setSize(ANCHO,ALTO);
    setLocationRelativeTo(null);//ubica la ventana en el centro de la panatalla
    setResizable(false);//impide que se modifique el tamaño de la ventana
    lamina = new Tablerojuego();//intanciar
    add(lamina);
}
    
}
