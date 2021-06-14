package Main.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class ProcesoUno extends Thread {

    @Override
    public void run() {
        Timer tiempo = new Timer(10000, null);
        tiempo.start();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ActionListener oyente = (ActionEvent e) -> {
            ventana.dispose();
        };
        tiempo.addActionListener(oyente);
    }
}
