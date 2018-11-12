package Caso3_MEDIATOR.MediadoresConcretos;


import Caso3_MEDIATOR.*;
import Caso3_MEDIATOR.ColleaguesConcretos.*;

public class AlgodonMediator implements LavadoraMediator {
	
	private Lavadora lavadora;
    private Motor motor;
    private Calentador calentador;
    private Valvula valvula;
    private SensorTemperatura sensorTemperatura;
    private RemovedorSuciedad removedorSuciedad;

	public AlgodonMediator(Lavadora lavadora, Calentador calentador, Motor motor, SensorTemperatura sensorTemperatura, RemovedorSuciedad removedorSuciedad, Valvula valvula){
		this.lavadora = lavadora;
		this.calentador = calentador;
		this.motor = motor;
		this.sensorTemperatura = sensorTemperatura;
		this.removedorSuciedad = removedorSuciedad;
		this.valvula = valvula;
	}

	@Override
	public void ConectarLavadora()
    {
		lavadora.Conectar();
	}

	@Override
	public void IniciarLavado()
    {
		motor.Encender();
        motor.PonerEnMarcha(354);
		System.out.println("Agregando detergente");
        System.out.println("Agregando suavizante");
        removedorSuciedad.Encender();
        removedorSuciedad.Apagar();
        motor.Apagar();
	}

	@Override
	public void AbrirValvula()
	{
		valvula.Abrir();
	}

	@Override
	public void CerrarValvula()
	{
		valvula.Cerrar();
	}

	@Override
	public void EncenderCalentador()
	{
		calentador.Encender(23);
	}

	@Override
	public void ApagarCalentador()
	{
		calentador.Apagar();
	}

	@Override
	public boolean CombrobarTemperatura(int pTemperatura)
	{
		return sensorTemperatura.VerificarTemperatura(pTemperatura);
	}

}
