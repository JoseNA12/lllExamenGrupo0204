package Caso3_MEDIATOR;


public class SedaMediator implements LavadoraMediator {

    private Lavadora lavadora;
    private Calentador calentador;
    private Motor motor;
    private Valvula valvula;
    private SensorTemperatura sensorTemperatura;
    private RemovedorSuciedad removedorSuciedad;

    public SedaMediator(Lavadora lavadora, Calentador calentador, Motor motor, SensorTemperatura sensorTemperatura, RemovedorSuciedad removedorSuciedad, Valvula valvula){
        this.lavadora = lavadora;
        this.calentador = calentador;
        this.motor = motor;
        this.valvula = valvula;
        this.sensorTemperatura = sensorTemperatura;
        this.removedorSuciedad = removedorSuciedad;
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
        motor.PonerEnMarcha(590);
        System.out.println("Sin detergente");
        System.out.println("Sin suavizante");
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
        calentador.Encender(90);
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
