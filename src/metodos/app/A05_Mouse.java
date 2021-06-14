package metodos.app;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class A05_Mouse {

    Robot r = new Robot();

    public A05_Mouse() throws AWTException {
        this.r = new Robot();
    }

    public void posicicionarMouse(int x, int y) throws AWTException,
            InterruptedException {
        r.mouseMove(x, y);
    }

//////////////////////////////CLICK IZQUIERDO///////////////////////////////////
    public void clickizquierdo() throws AWTException, InterruptedException {
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

//////////////////////////////CLICK DERECHO/////////////////////////////////////
    public void clickDerecho() throws AWTException, InterruptedException {
        r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

//////////////////////////////DOBLE CLICK///////////////////////////////////////    
    public void dobleClick() throws AWTException, InterruptedException {
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
