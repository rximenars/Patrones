package AbstractFactory;

public class ServicePersonalTraining implements ServiceGym
{
    @Override
    public void encargadoTrabajo()
    {
        System.out.println("Ya le fue asignado un entrenador personal. ");

    }

    @Override
    public void tiempoEstimado() {
        System.out.println("Puede comenzar a trabajar con su entrenador a partir de mañana.. ");
    }

    @Override
    public void pagoRecibido() {
        System.out.println("El valor adicional que debe cancelar es de 20000 pesos mensuales. ");
    }
}
