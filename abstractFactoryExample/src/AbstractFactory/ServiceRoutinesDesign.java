package AbstractFactory;

public class ServiceRoutinesDesign implements ServiceGym
{
    @Override
    public void jobManager()
    {
        System.out.println("El encargado de realizar el diseño de tu plan de entrenamiento ya fué notificado. ");

    }

    @Override
    public void estimatedTime() {
        System.out.println("El tiempo estimado para diseñar su plan de entrenamiento es de 2 días. ");
    }

    @Override
    public void paymentReceived() {
        System.out.println("El valor total del diseño de su plan de entrenamiento es de 10000 pesos. ");
    }
}
