package Caso3_MEDIATOR;


import Caso3_MEDIATOR.ColleaguesConcretos.*;
import Caso3_MEDIATOR.MediadoresConcretos.AlgodonMediator;
import Caso3_MEDIATOR.MediadoresConcretos.JeansMediator;
import Caso3_MEDIATOR.MediadoresConcretos.SedaMediator;

public class DemoMediator {

	public static void main(String[] args)
	{
		LavadoraMediator mediator = null;

		Motor motor = new Motor();
		Lavadora lavadora = new Lavadora();
        Valvula valvula = new Valvula();
        Calentador calentador = new Calentador();
        SensorTemperatura sensorTemperatura = new SensorTemperatura();
        RemovedorSuciedad removedorSuciedad = new RemovedorSuciedad();

        System.out.println("/ ---------------------- Algodón ---------------------- \\");
		mediator = new AlgodonMediator(lavadora, calentador, motor, sensorTemperatura, removedorSuciedad, valvula);
		motor.setMediator(mediator);
		lavadora.setMediator(mediator);
		calentador.setMediator(mediator);
		valvula.setMediator(mediator);
		removedorSuciedad.setMediator(mediator);

        lavadora.PresionarBotonIniciar(); // TODO: Comenzar el procedimiento
        System.out.println("/ -------------------------------------------------- \\");

        System.out.println("/ ---------------------- Ceda ---------------------- \\");
        mediator = new SedaMediator(lavadora, calentador, motor, sensorTemperatura, removedorSuciedad, valvula);
        motor.setMediator(mediator);
        lavadora.setMediator(mediator);
        calentador.setMediator(mediator);
        valvula.setMediator(mediator);
        removedorSuciedad.setMediator(mediator);

        lavadora.PresionarBotonIniciar();
        System.out.println("/ -------------------------------------------------- \\");

        System.out.println("/ ---------------------- Jeans ---------------------- \\");
		mediator = new JeansMediator(lavadora, calentador, motor, sensorTemperatura, removedorSuciedad, valvula);
        motor.setMediator(mediator);
		lavadora.setMediator(mediator);
		calentador.setMediator(mediator);
		valvula.setMediator(mediator);
        removedorSuciedad.setMediator(mediator);

        lavadora.PresionarBotonIniciar();
        System.out.println("/ -------------------------------------------------- \\");
	}

}
