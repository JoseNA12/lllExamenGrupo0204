package Caso2_COMMAND.CommandsConcretos;

import Caso2_COMMAND.Receivers.SMS;
import Caso2_COMMAND.Trabajo;

public class TrabajoSMS implements Trabajo {
    private SMS sms;

    public TrabajoSMS(SMS s) {
        this.sms = s;
    }

    @Override
    public void ejecutar() {
        sms.enviarSMS();
    }
}
