package controlador;

import vista.LoginView;

public class ArranqueTest {

    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeAndWait(ArranqueTest::comprobarCambioDeVentana);
        System.out.println("OK");
    }

    private static void comprobarCambioDeVentana() {
        LoginView login = new LoginView();
    }
}
