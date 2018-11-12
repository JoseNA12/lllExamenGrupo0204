package Caso4_CHAIN_OF_RESPONSIBILITY;


import Caso4_CHAIN_OF_RESPONSIBILITY.AlmacenamientoPrimario.BaseDeDatos;

public abstract class ArchivoManejador implements Manejador {

    private Manejador miSiguienteManejador;

    @Override
    public void setSiguiente(Manejador miManejador)
    {
        this.miSiguienteManejador = miManejador;
    }

    @Override
    public void ProcesarArchivo(Archivo miArchivo)
    {
        if (this.miSiguienteManejador != null)
        {
            this.miSiguienteManejador.ProcesarArchivo(miArchivo);
        }
        else
        {
            System.out.println("** Error, archivo no soportado! **");
        }
    }

    public boolean GuardarHistorialMedico(String pDatos)
    {
        BaseDeDatos.InsertHistorialMedico(pDatos);
        return true;
    }

    public boolean GuardarMedicamentos(String pDatos)
    {
        BaseDeDatos.InsertMedicamentos(pDatos);
        return true;
    }

    public boolean GuardarTratamientos(String pDatos)
    {
        BaseDeDatos.InsertTratamientos(pDatos);
        return true;
    }
}
