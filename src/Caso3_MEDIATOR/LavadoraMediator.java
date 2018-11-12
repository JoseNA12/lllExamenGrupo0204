package Caso3_MEDIATOR;

public interface LavadoraMediator {
	
	void ConectarLavadora();
	void AbrirValvula();
	void CerrarValvula();
	void IniciarLavado();
	void EncenderCalentador();
	void ApagarCalentador();
	boolean CombrobarTemperatura(int pTemperatura); // por ejemplo fahrenheit

}
