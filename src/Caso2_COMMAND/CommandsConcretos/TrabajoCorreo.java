package Caso2_COMMAND.CommandsConcretos;

import Caso2_COMMAND.Receivers.Correo;
import Caso2_COMMAND.Trabajo;

public class TrabajoCorreo implements Trabajo {
    private Correo correo;

    public TrabajoCorreo(Correo c) {
        this.correo = c;
    }

    @Override
    public void ejecutar() {
        correo.enviarMail();
    }
}
