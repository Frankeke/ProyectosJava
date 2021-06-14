package varios.app;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class A02_Lee_Proceso {

    A03_ListaMetodos lm = new A03_ListaMetodos();
    String proceso = "\\proceso.txt";
    public void leer_TXT(String ruta) throws IOException, AWTException, InterruptedException {
        
        try {
            FileReader fr = new FileReader(ruta + proceso);
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            while ((cadena = br.readLine()) != null) {
                String[] lineas = cadena.split(";");
                System.out.println(Arrays.toString(lineas));
                lm.numeroMetodo(lineas);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
