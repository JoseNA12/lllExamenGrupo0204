package Caso2_COMMAND;

import Caso2_COMMAND.CommandsConcretos.TrabajoCorreo;
import Caso2_COMMAND.CommandsConcretos.TrabajoFoto;
import Caso2_COMMAND.CommandsConcretos.TrabajoMusica;
import Caso2_COMMAND.CommandsConcretos.TrabajoSMS;
import Caso2_COMMAND.Invocador.Sistema;
import Caso2_COMMAND.Receivers.Correo;
import Caso2_COMMAND.Receivers.Foto;
import Caso2_COMMAND.Receivers.Musica;
import Caso2_COMMAND.Receivers.SMS;

public class DemoCommand {

    public static void main(String[] args)
    {
        Sistema sistema = new Sistema();

        System.out.println("Iniciado primer lote de procesos");
        for(int i = 0; i <= 50; i++){ //Encola abrir 50 fotos
            sistema.encolarTrabajo(new TrabajoCorreo(new Correo()));
        }

        try {
            Thread.sleep(7000); //Espera 7s para que termine el primer lote
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Iniciado segundo lote de procesos");
        for(int i = 0; i <= 50; i++){
            sistema.encolarTrabajo(new TrabajoMusica(new Musica())); //Encola 50 canciones
            sistema.encolarTrabajo(new TrabajoSMS(new SMS())); //Encola 50 SMS
            //En total se encolan 100 trabajos, tardara 10s en hacerlos
        }
    }
}
