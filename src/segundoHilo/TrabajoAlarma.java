package segundoHilo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.SwingWorker;

@SuppressWarnings("serial")
public class TrabajoAlarma extends AbstractAction {

    private final Alarma ejemploFrame;

    public TrabajoAlarma(Alarma ejemploSinSwingWorkerFrame) {
        this.ejemploFrame = ejemploSinSwingWorkerFrame;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        final SwingWorker worker = new SwingWorker() {

            @Override
            protected Object doInBackground() throws Exception {
                System.exit(0);
                return null;
            }
        };
        worker.execute();
    }
}
