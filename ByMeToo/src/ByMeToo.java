import controlador.Controlador;
import java.awt.EventQueue;
import javax.swing.UIManager;
import modelo.Modelo;
import vista.LoginWindow;
import vista.MainWindow;

public class ByMeToo {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        EventQueue.invokeLater(() -> {
            Controlador controlador = new Controlador(new Modelo(), new LoginWindow(), new MainWindow());
            controlador.iniciar();
        });
    }
}
