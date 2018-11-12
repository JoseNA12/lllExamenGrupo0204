package Caso2_COMMAND.CommandsConcretos;

import Caso2_COMMAND.Receivers.Musica;
import Caso2_COMMAND.Trabajo;

public class TrabajoMusica implements Trabajo {
    private Musica musica;

    public TrabajoMusica(Musica m) {
        this.musica = m;
    }

    @Override
    public void ejecutar() {
        musica.reproducirTrack();
    }
}
