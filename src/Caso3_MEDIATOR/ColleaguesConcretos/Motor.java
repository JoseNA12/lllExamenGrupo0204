package Caso3_MEDIATOR.ColleaguesConcretos;


import Caso3_MEDIATOR.LavadoraInteligente;
import Caso3_MEDIATOR.LavadoraMediator;

public class Motor implements LavadoraInteligente {

	private Boolean encendido;
	private LavadoraMediator mediator;


	@Override
	public void setMediator(LavadoraMediator mediator)
	{
		this.mediator = mediator;
	}

	public void Encender()
	{
		encendido = true;
		System.out.println("* Motor encendido *");
	}

	public void Apagar()
	{
		encendido = false;
		System.out.println("* Motor apagado *");
	}

	public void PonerEnMarcha(int pPotencia)
	{
		System.out.println("El tambor esta girando a una potencia de " + pPotencia + " revoluciones por minuto");
	}

}
