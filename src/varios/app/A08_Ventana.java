package varios.app;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import metodos.app.A06_EjecucionExterna;

public class A08_Ventana extends JFrame {

    A06_EjecucionExterna tiempo = new A06_EjecucionExterna();

    public A08_Ventana() throws AWTException, InterruptedException {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1300, 700);
        setTitle("ALERTA");
        CenteredFrame(this);
        iniciarComponentes();
        setIconImage(new ImageIcon(getClass().getResource("/Images/BTareas.png")).getImage());
        
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        this.getContentPane().add(panel);
    }

    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
}
