package segundoHilo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Alarma extends JFrame {

    private final JButton jbIncrementarConSwingWorker = new JButton();
    private final JPanel jpMarco = new JPanel();
    private final JPanel jpAccciones = new JPanel();

    public Alarma() {
        
        initComponents();
        this.setTitle("ALERTA");
        this.setSize(800, 600);
        CenteredFrame(this);
        this.setTitle("ALERTA");
        //setExtendedState(JFrame.ICONIFIED);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Images/BTareas.png")).getImage());
        
    }

    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }

    private void initComponents() {
        jbIncrementarConSwingWorker.setAction(new TrabajoAlarma(this));
        Font fuente = new Font("ARIAL", 50, 50);
        jbIncrementarConSwingWorker.setFont(fuente);
        jbIncrementarConSwingWorker.setText("CIERRE DE PROGRAMA");
        jpAccciones.setBackground(Color.GREEN);
        jpAccciones.add(jbIncrementarConSwingWorker);
        jpMarco.add(jpAccciones);
        jpMarco.setBackground(Color.GREEN);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jpMarco);
        
        pack();
    }
}
