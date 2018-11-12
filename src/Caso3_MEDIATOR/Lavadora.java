package Caso3_MEDIATOR;

public class Lavadora implements LavadoraInteligente {

	private LavadoraMediator mediator;
	
	@Override
	public void setMediator(LavadoraMediator mediator)
	{
		this.mediator = mediator;
	}

	public void Conectar()
	{
	    System.out.println("Lavadora conectada");
        System.out.println("Botón de inicio presionado");
		mediator.AbrirValvula();
	}

    public void PresionarBotonIniciar()
    {
        mediator.ConectarLavadora();
    }

}
