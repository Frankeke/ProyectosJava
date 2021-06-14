package metodos.app;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import javax.swing.Timer;

public class A06_EjecucionExterna {

    Timer tiempo = new Timer(5000, null);

    public void ejecutarCMD(String comando) throws IOException,
            InterruptedException, AWTException {
        Process p = Runtime.getRuntime().exec("cmd.exe /C start " + comando);
        p.waitFor();
        p.destroy();
    }

    public void ejecutarPrograma(String ruta) throws IOException,
            InterruptedException {
        Runtime.getRuntime().exec(ruta);
    }

    public void tiempoEspera(int segundos) throws AWTException,
            InterruptedException {
        Robot r = new Robot();
        int milisegundos = (segundos * 1000) / 1;
        r.delay(milisegundos);
    }
}
