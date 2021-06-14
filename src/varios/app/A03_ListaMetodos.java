package varios.app;

import java.awt.AWTException;
import java.io.IOException;

public class A03_ListaMetodos {

    public void numeroMetodo(String[] arrayList) throws AWTException, InterruptedException, IOException {
        String[] lista;
        lista = arrayList;
        A04_Metodos_01_20 primeraLista = new A04_Metodos_01_20();
        A05_Metodos_21_40 segundaLista = new A05_Metodos_21_40();
        A06_Metodos_41_55 terceraLista = new A06_Metodos_41_55();
        try {
            int numMetodo = Integer.parseInt(lista[0]);
            if (numMetodo >= 1 && numMetodo <= 20) {
                primeraLista.primeraLista(arrayList);
            }
            if (numMetodo >= 21 && numMetodo <= 40) {
                segundaLista.segundaLista(arrayList);
            }
            if (numMetodo >= 41 && numMetodo <= 55) {
                terceraLista.terceraLista(arrayList);
            } else {

            }
        } catch (NumberFormatException e) {
        }
    }
}
