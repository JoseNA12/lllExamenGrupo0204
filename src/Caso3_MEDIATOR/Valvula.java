package Caso3_MEDIATOR;

public class Valvula implements LavadoraInteligente {

	private LavadoraMediator mediator;
	
	@Override
	public void setMediator(LavadoraMediator mediator)
	{
		this.mediator = mediator;
	}
	
	public void Abrir()
	{
		System.out.println("* Valvula abierta *");
        System.out.println("Llenando agua en el tambor"); // para todos por igual

		mediator.CerrarValvula();
	}
	
	public void Cerrar()
	{
		System.out.println("* Valvula cerrada *");
		mediator.EncenderCalentador();
	}
}
