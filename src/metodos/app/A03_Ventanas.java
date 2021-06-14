package metodos.app;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class A03_Ventanas {

    Robot r = new Robot();

    public A03_Ventanas() throws AWTException {
        this.r = new Robot();
    }

    //////////////////////////////MINIMIZAR VENTANA/////////////////////////////////   
    public void minimizarVentana() throws AWTException {
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_SPACE);
        r.keyPress(KeyEvent.VK_N);
        r.keyRelease(KeyEvent.VK_ALT);
        r.keyRelease(KeyEvent.VK_SPACE);
        r.keyRelease(KeyEvent.VK_N);
    }

//////////////////////////////MAXIMIZAR VENTANA/////////////////////////////////    
    public void maximizarVentana() throws AWTException {
        r.keyPress(KeyEvent.VK_WINDOWS);
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_WINDOWS);
    }

//////////////////////////////CERRAR VENTANA////////////////////////////////////    
    public void cerrarVentana() throws AWTException {
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_F4);
        r.keyRelease(KeyEvent.VK_F4);
        r.keyRelease(KeyEvent.VK_ALT);
    }

//////////////////////////////CAMBIAR VENTANA///////////////////////////////////    
    public void cambiarVentana(int cambios) throws AWTException {
        r.keyPress(KeyEvent.VK_ALT);
        for (int i = 0; i < cambios; i++) {
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
        }
        r.keyRelease(KeyEvent.VK_ALT);
    }

}
