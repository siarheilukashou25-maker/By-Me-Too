package controlador;

import java.awt.event.ActionEvent;
import modelo.Modelo;
import vista.LoginWindow;
import vista.MainWindow;

/**
 * Conecta las ventanas con el modelo.
 * De momento solo cambia de la pantalla de acceso a la principal.
 */
public class Controlador {

    private final Modelo modelo;
    private final LoginWindow login;
    private final MainWindow principal;

    public Controlador(Modelo modelo, LoginWindow login, MainWindow principal) {
        this.modelo = modelo;
        this.login = login;
        this.principal = principal;
        this.login.alEntrar(this::entrar);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void iniciar() {
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    public void entrar(ActionEvent evento) {
        login.setVisible(false);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }
}
