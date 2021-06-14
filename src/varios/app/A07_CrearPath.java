package varios.app;

import Main.app.ProcesoDos;
import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A07_CrearPath {

    String archivo = "\\ruta_de_trabajo.txt";
    String bloque = "\\grupo_de_procesos.txt";
    A02_Lee_Proceso txt = new A02_Lee_Proceso();

    public String leerPath(String ruta) throws IOException, AWTException, InterruptedException {
        Scanner s = null;
        try {
            FileReader fr = new FileReader(ruta + bloque);
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            while ((cadena = br.readLine()) != null) {
                String[] lineas = cadena.split(";");
                System.out.println("------>" + lineas[0]);
                txt.leer_TXT(lineas[0]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje--->: " + ex.getMessage());
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        return null;
    }
}
