package Caso4_CHAIN_OF_RESPONSIBILITY;

import Caso4_CHAIN_OF_RESPONSIBILITY.ArchivosConcretos.*;

public class DemoChainOfResponsiblity {

    public static void main(String[] args)
    {
        Archivo miArchivo = null;

        Manejador archivoTxtManejador = new ArchivoTxtManejador();
        Manejador documentoManejador = new DocumentoManejador();
        Manejador audioManejador = new AudioManejador();
        Manejador imagenManejador = new ImagenManejador();
        Manejador videoManejador = new VideoManejador();

        archivoTxtManejador.setSiguiente(documentoManejador);
        documentoManejador.setSiguiente(audioManejador);
        audioManejador.setSiguiente(imagenManejador);
        imagenManejador.setSiguiente(videoManejador);

        System.out.println("/ ---------------------- Caso de prueba 1 - Video ---------------------- \\");

        miArchivo = new Archivo("anotaciones_en_video", "mp4", "C:\\Users\\user\\Downloads\\",
                "Información historial en mp4", "Información tratamientos en mp4", "Información medicamentos en mp4");
        archivoTxtManejador.ProcesarArchivo(miArchivo);

        System.out.println("\n/ ---------------------- Caso de prueba 2 - Imágen ---------------------- \\");

        miArchivo = new Archivo("anotaciones_en_imagen", "jpg", "C:\\Users\\user\\Downloads\\",
                "Información historial en jpg", "Información tratamientos en jpg", "Información medicamentos en jpg");
        documentoManejador.ProcesarArchivo(miArchivo);

        System.out.println("\n/ ---------------------- Caso de prueba 3 - HTML (inválido) ---------------------- \\");

        miArchivo = new Archivo("anotaciones_en_html", "html", "C:\\Users\\user\\Downloads\\",
                "Información historial en html", "Información tratamientos en html", "Información medicamentos en html");
        archivoTxtManejador.ProcesarArchivo(miArchivo);

    }
}
