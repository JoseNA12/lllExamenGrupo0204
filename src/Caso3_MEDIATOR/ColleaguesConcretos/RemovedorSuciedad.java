package Caso3_MEDIATOR.ColleaguesConcretos;


import Caso3_MEDIATOR.LavadoraInteligente;
import Caso3_MEDIATOR.LavadoraMediator;

public class RemovedorSuciedad implements LavadoraInteligente {

    private boolean encendido;
    private LavadoraMediator mediator;


    @Override
    public void setMediator(LavadoraMediator mediator)
    {
        this.mediator = mediator;
    }

	public void Encender()
    {
        encendido = true;
		System.out.println("* Removedor de suciedad encendido *");
        System.out.println("Eliminando desechos");
	}
	
	public void Apagar()
    {
        if (encendido)
        {
            System.out.println("* Removedor de suciedad apagado *");
            encendido = false;
        }

	}

}
