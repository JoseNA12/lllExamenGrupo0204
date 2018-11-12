package Caso2_COMMAND.CommandsConcretos;

import Caso2_COMMAND.Receivers.Foto;
import Caso2_COMMAND.Trabajo;

public class TrabajoFoto implements Trabajo {
    private Foto foto;

    public TrabajoFoto(Foto f) {
        this.foto = f;
    }

    @Override
    public void ejecutar() {
        foto.abrirFoto();
    }
}
