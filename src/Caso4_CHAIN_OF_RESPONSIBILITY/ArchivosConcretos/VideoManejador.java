package Caso4_CHAIN_OF_RESPONSIBILITY.ArchivosConcretos;

import Caso4_CHAIN_OF_RESPONSIBILITY.Archivo;
import Caso4_CHAIN_OF_RESPONSIBILITY.ArchivoManejador;
import Caso4_CHAIN_OF_RESPONSIBILITY.AlmacenamientoPrimario.BaseDeDatos;

public class VideoManejador extends ArchivoManejador {


    @Override
    public void ProcesarArchivo(Archivo miArchivo)
    {
        if (miArchivo.getFormato().toLowerCase().equals("mp4"))
        {
            String[] misDatos = miArchivo.getMetaDatos();

            super.GuardarHistorialMedico(misDatos[0]);
            super.GuardarTratamientos(misDatos[1]);
            super.GuardarMedicamentos(misDatos[2]);

            System.out.println("Archivo MP4 procesado y almacenado en la base de datos por el manejador de videos!");
        }
        else
        {
            System.out.println("El manejador de videos mp4 no pudo procesar el archivo...");
            super.ProcesarArchivo(miArchivo);
        }
    }
}
