package controlador;

import java.awt.event.ActionEvent;
import modelo.Modelo;
import vista.LoginView;

/**
 * Conecta las ventanas con el modelo.
 * De momento solo cambia de la pantalla de acceso a la principal.
 */
public class Controlador {

    private final Modelo modelo;
    private final LoginView login;

    public Controlador(Modelo modelo, LoginView login) {
        this.modelo = modelo;
        this.login = login;
        //this.login.alEntrar(this::entrar);
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
    }
}
