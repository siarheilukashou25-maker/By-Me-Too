import controlador.Controlador;
import java.awt.EventQueue;
import javax.swing.UIManager;
import modelo.Modelo;
import vista.LoginWindow;
import vista.MainWindow;

public class ByMeToo {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        EventQueue.invokeLater(() -> {
            Controlador controlador = new Controlador(new Modelo(), new LoginWindow(), new MainWindow());
            controlador.iniciar();
        });
    }
}
