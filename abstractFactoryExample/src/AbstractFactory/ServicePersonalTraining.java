package AbstractFactory;

public class ServicePersonalTraining implements ServiceGym
{
    @Override
    public void jobManager()
    {
        System.out.println("Ya le fue asignado un entrenador personal. ");

    }

    @Override
    public void estimatedTime() {
        System.out.println("Puede comenzar a trabajar con su entrenador a partir de mañana.. ");
    }

    @Override
    public void paymentReceived() {
        System.out.println("El valor adicional que debe cancelar es de 20000 pesos mensuales. ");
    }
}
