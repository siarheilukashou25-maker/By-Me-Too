package controlador;

import vista.LoginWindow;

public class ArranqueTest {

    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeAndWait(ArranqueTest::comprobarCambioDeVentana);
        System.out.println("OK");
    }

    private static void comprobarCambioDeVentana() {
        LoginWindow login = new LoginWindow();
    }
}
