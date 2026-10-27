package controlador;

import modelo.Modelo;
import vista.LoginWindow;
import vista.MainWindow;

public class ArranqueTest {

    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeAndWait(ArranqueTest::comprobarCambioDeVentana);
        System.out.println("OK");
    }

    private static void comprobarCambioDeVentana() {
        LoginWindow login = new LoginWindow();
        MainWindow principal = new MainWindow();
        Controlador controlador = new Controlador(new Modelo(), login, principal);

        controlador.iniciar();
        if (!login.isVisible() || principal.isVisible()) {
            throw new AssertionError("Al arrancar solo debe verse el login");
        }

        login.pulsarEntrar();
        if (login.isVisible() || !principal.isVisible()) {
            throw new AssertionError("Entrar debe abrir la ventana principal y ocultar el login");
        }

        login.dispose();
        principal.dispose();
    }
}
