package varios.app;

import java.awt.AWTException;
import metodos.app.A01_Teclado_Escribir;
import metodos.app.A02_CombinacionesTeclas;

public class A04_Metodos_01_20 {

    public void primeraLista(String[] primeraLista) throws AWTException, InterruptedException {
        A01_Teclado_Escribir teclado = new A01_Teclado_Escribir();
        A02_CombinacionesTeclas combi = new A02_CombinacionesTeclas();
        String[] primera = primeraLista;
        switch (primera[0]) {
            case "1":
                teclado.escribirStringDos(primera[1]);
                break;
            case "2":
                teclado.borrarCaracter();
                break;
            case "3":
                teclado.borrarTodo();
                break;
            case "11":
                int ite = Integer.parseInt(primera[1]);
                int num1 = Integer.parseInt(primera[2]);
                switch (num1) {
                    case 14:
                        combi.unaTeclaEnter(ite, num1);
                        break;
                    case 15:
                        combi.unaTeclaAlt(ite, num1);
                        break;
                    default:
                        combi.unaTecla(ite, num1);
                        break;
                }
                break;
            case "12":
                int iter = Integer.parseInt(primera[1]);
                int tecla1 = Integer.parseInt(primera[2]);
                int tecla2 = Integer.parseInt(primera[3]);
                if (primera[2].equals("15")) {
                    combi.dosTeclasAlt(primera[1], primera[2], primera[3]);
                } else {
                    combi.dosTeclas(iter, tecla1, tecla2);
                }
                break;
            case "13":
                combi.tresTeclas(primera[1], primera[2], primera[3], primera[4]);
                break;
            default:
                break;
        }
    }
}
