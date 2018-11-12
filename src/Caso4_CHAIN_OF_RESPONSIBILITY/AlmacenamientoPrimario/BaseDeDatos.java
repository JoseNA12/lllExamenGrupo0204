package Caso4_CHAIN_OF_RESPONSIBILITY.AlmacenamientoPrimario;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {

    // Véanse como tablas de una BD, únicamente para simular el problema
    private static List<String> historialMedico = new ArrayList<>();
    private static List<String> historialMedicamentos = new ArrayList<>();
    private static List<String> historialTratamientos = new ArrayList<>();

    public static boolean InsertHistorialMedico(String pDatos)
    {
        historialMedico.add(pDatos);
        return true;
    }

    public static boolean InsertMedicamentos(String pDatos)
    {
        historialMedicamentos.add(pDatos);
        return true;
    }

    public static boolean InsertTratamientos(String pDatos)
    {
        historialTratamientos.add(pDatos);
        return true;
    }
}
