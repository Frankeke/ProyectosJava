package varios.app;

import java.awt.AWTException;
import java.io.IOException;
import metodos.app.A05_Mouse;
import metodos.app.A06_EjecucionExterna;

public class A06_Metodos_41_55 {

    public void terceraLista(String[] terceraLista) throws AWTException, InterruptedException, IOException {
        A05_Mouse mouse = new A05_Mouse();
        A06_EjecucionExterna ejecutar = new metodos.app.A06_EjecucionExterna();
        String[] tercera = terceraLista;
        switch (tercera[0]) {
            case "41":
                int x = Integer.parseInt(tercera[1]);
                int y = Integer.parseInt(tercera[2]);
                mouse.posicicionarMouse(x, y);
                break;
            case "42":
                mouse.clickizquierdo();
                break;
            case "43":
                mouse.clickDerecho();
                break;
            case "44":
                mouse.dobleClick();
                break;
            case "51":
                ejecutar.ejecutarCMD(tercera[1]);
                break;
            case "52":
                ejecutar.ejecutarPrograma(tercera[1]);
                break;
            case "53":
                int segundos = Integer.parseInt(terceraLista[1]);
                ejecutar.tiempoEspera(segundos);
                break;
            default:
                break;
        }
    }
}
