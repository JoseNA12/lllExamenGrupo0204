package Caso3_MEDIATOR;


public class JeansMediator implements LavadoraMediator {

	private Lavadora lavadora;
    private Motor motor;
    private Valvula valvula;
    private Calentador calentador;
    private RemovedorSuciedad removedorSuciedad;
    private SensorTemperatura sensorTemperatura;

	public JeansMediator(Lavadora lavadora, Calentador calentador, Motor motor, SensorTemperatura sensorTemperatura, RemovedorSuciedad removedorSuciedad, Valvula valvula){
		this.lavadora = lavadora;
        this.motor = motor;
        this.valvula = valvula;
        this.calentador = calentador;
        this.removedorSuciedad = removedorSuciedad;
        this.sensorTemperatura = sensorTemperatura;
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
        motor.PonerEnMarcha(760);
        System.out.println("Agregando detergente");
        System.out.println("Sin suavizante");
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
		calentador.Encender(0); // 18 grados
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
