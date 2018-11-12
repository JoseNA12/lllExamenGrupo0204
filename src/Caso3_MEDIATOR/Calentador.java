package Caso3_MEDIATOR;

public class Calentador implements LavadoraInteligente {

	private LavadoraMediator mediator;
	private int temperatura;
	
	@Override
	public void setMediator(LavadoraMediator mediator)
    {
		this.mediator = mediator;
	}

	public void Encender(int pTemperatura)
    {
        temperatura = pTemperatura;

		if(mediator.CombrobarTemperatura(temperatura))
		{
			System.out.println("Temperatura establecida: " + temperatura);
			System.out.println("* Calentador encendido *");
			mediator.ApagarCalentador();
		}
		else
        {
            System.out.println("La temperatura es igual o menor a 0 grados, no se ha calentado el componente");
            mediator.ApagarCalentador();
        }
	}
	
	public void Apagar()
    {
		System.out.println("* Calentador apagado *");
		mediator.IniciarLavado();
	}
}
