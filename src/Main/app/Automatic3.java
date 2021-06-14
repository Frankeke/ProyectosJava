package Main.app;

import java.awt.AWTException;
import java.io.IOException;

public class Automatic3 extends Thread implements Runnable {

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        Thread hilo1 = new Thread(new ProcesoUno());
        Thread hilo2 = new Thread(new ProcesoDos());
        hilo1.start();
        hilo2.start();
    }
}
