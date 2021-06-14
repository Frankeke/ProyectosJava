package metodos.app;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import varios.app.A01_Teclado_teclas;

public class A01_Teclado_Escribir {
    Robot r = new Robot();

    public A01_Teclado_Escribir() throws AWTException {
        this.r = new Robot();
    }
    ///////////////////ESCRIBIR TEXTO////////////////////////////////
    public void escribirStringDos(String texto) throws AWTException, InterruptedException {
        A01_Teclado_teclas t = new A01_Teclado_teclas();
        String[] sp = texto.split("");
        for (String sp1 : sp) {
            t.teclado(sp1);
        }
    }
    ////////////BORRAR TODOS LOS CARACTERES//////////////////////////
    public void borrarTodo() throws AWTException {
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_CONTROL);
    }
    ///////////////////BORRAR CARACTER///////////////////////////////
    public void borrarCaracter() throws AWTException {
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
    }
}
