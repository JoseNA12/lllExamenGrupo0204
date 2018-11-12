package Caso4_CHAIN_OF_RESPONSIBILITY;

public interface Manejador {

    void setSiguiente(Manejador miManejador); // nextHandler
    void ProcesarArchivo(Archivo miArchivo); // Handle
}
