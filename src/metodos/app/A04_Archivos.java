package metodos.app;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class A04_Archivos {

    Robot r = new Robot();

    public A04_Archivos() throws AWTException {
        this.r = new Robot();
    }

    //////////////////////////////COPIAR ARCHIVO////////////////////////////////
    public void corpiarArchivo() throws AWTException, InterruptedException {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
    }

//////////////////////////////CORTAR ARCHIVO////////////////////////////////////    
    public void cortarArchivo() throws AWTException, InterruptedException {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_X);
        r.keyRelease(KeyEvent.VK_X);
        r.keyRelease(KeyEvent.VK_CONTROL);
    }

//////////////////////////////PEGAR ARCHIVO/////////////////////////////////////    
    public void pegarArchivo() throws AWTException, InterruptedException {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
    }
}
