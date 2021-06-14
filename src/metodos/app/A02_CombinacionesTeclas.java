package metodos.app;

import java.awt.*;
import java.awt.event.KeyEvent;

public class A02_CombinacionesTeclas {

    Robot r = new Robot();

    public A02_CombinacionesTeclas() throws AWTException {
        this.r = new Robot();
    }

    //////////////////////////////REPETIR UNA TECLA///////////////////////////// 
    public void unaTecla(int contador, int digTecla) {
        for (int i = 0; i < contador; i++) {
            r.keyPress(digTecla);
            r.keyRelease(digTecla);
        }
    }

    ///////////////////////REPETIR UNA TECLA (ENTER)////////////////////////////    
    public void unaTeclaEnter(int contador, int digTecla) throws AWTException {
        for (int i = 0; i < contador; i++) {
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        }
    }

    ///////////////////////REPETIR UNA TECLA (ALT)//////////////////////////////
    public void unaTeclaAlt(int contador, int digTecla) throws AWTException {
        for (int i = 0; i < contador; i++) {
            r.keyPress(KeyEvent.VK_ALT);
            r.keyRelease(KeyEvent.VK_ALT);
        }
    }

    ////////////////////ABREVIACION DE DOS TECLAS///////////////////////////////
    public void dosTeclas(int conta, int digUno, int digDos) throws
            AWTException {
        r.keyPress(digUno);
        for (int i = 0; i < conta; i++) {
            r.keyPress(digDos);
            r.keyRelease(digDos);
        }
        r.keyRelease(digUno);
    }

    ////////////////ABREVIACION DE DOS TECLA CON ALT////////////////////////////
    public void dosTeclasAlt(String conta, String digUno, String digDos) throws
            AWTException {
        int iterador1 = Integer.parseInt(conta);
        int num1 = Integer.parseInt(digUno);
        int num2 = Integer.parseInt(digDos);
        switch (num1) {
            case 15:
                r.keyPress(KeyEvent.VK_ALT);
                for (int i = 0; i < iterador1; i++) {
                    r.keyPress(num2);
                    r.keyRelease(num2);
                }
                r.keyRelease(KeyEvent.VK_ALT);
                break;
            default:
                r.keyPress(num1);
                for (int i = 0; i < iterador1; i++) {
                    r.keyPress(num2);
                    r.keyRelease(num2);
                }
                r.keyRelease(num1);
                break;
        }
    }

    /////////////////ABREVIACION TRES TECLAS////////////////////////////////////
    public void tresTeclas(String conta, String digitoUno, String digitoDos,
            String digitoTres) throws AWTException {
        int iterador = Integer.parseInt(conta);
        int teclasUno = Integer.parseInt(digitoUno);
        int teclasDos = Integer.parseInt(digitoDos);
        int teclasTres = Integer.parseInt(digitoTres);
        switch (teclasUno) {
            case 15:
                r.keyPress(KeyEvent.VK_ALT);
                r.keyPress(teclasDos);
                for (int i = 0; i < iterador; i++) {
                    r.keyPress(teclasTres);
                    r.keyRelease(teclasTres);
                }
                r.keyRelease(teclasDos);
                r.keyRelease(KeyEvent.VK_ALT);
                break;
            default:
                r.keyPress(teclasUno);
                r.keyPress(teclasDos);
                for (int i = 0; i < iterador; i++) {
                    r.keyPress(teclasTres);
                    r.keyRelease(teclasTres);
                }
                r.keyRelease(teclasDos);
                r.keyRelease(teclasUno);
                break;
        }
    }
}
