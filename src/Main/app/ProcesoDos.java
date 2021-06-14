package Main.app;

import javax.swing.SwingUtilities;
import segundoHilo.Alarma;

public class ProcesoDos extends Thread {

    @Override
    public void run() {
        SwingUtilities.invokeLater(() -> {
            Alarma alerta = new Alarma();
            alerta.setVisible(true);
        });
    }
}
