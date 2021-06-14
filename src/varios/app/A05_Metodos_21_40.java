package varios.app;

import java.awt.AWTException;
import metodos.app.A03_Ventanas;
import metodos.app.A04_Archivos;

public class A05_Metodos_21_40 {
    public void segundaLista(String[] segundaLista) throws AWTException, InterruptedException {
        A03_Ventanas ventanas = new A03_Ventanas();
        A04_Archivos archivos = new A04_Archivos();
        String[] segunda = segundaLista;
        switch (segunda[0]) {
            case "21":
                ventanas.minimizarVentana();
                break;
            case "22":
                ventanas.maximizarVentana();
                break;
            case "23":
                ventanas.cerrarVentana();
                break;
            case "24":
                int cambios = Integer.parseInt(segunda[1]);
                ventanas.cambiarVentana(cambios);
                break;
            case "31":
                archivos.corpiarArchivo();
                break;
            case "32":
                archivos.cortarArchivo();
                break;
            case "33":
                archivos.pegarArchivo();
                break;
            default:
                break;
        }
    }
}
