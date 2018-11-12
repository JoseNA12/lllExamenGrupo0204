package Caso3_MEDIATOR;

public class SensorTemperatura {
	
	public boolean VerificarTemperatura(int pTemperatura)
    {
		if (pTemperatura > 0)
		{
            return true;
		}
		else
        {
            return false; // No hace falta apagar el calentador
        }
	}
}
