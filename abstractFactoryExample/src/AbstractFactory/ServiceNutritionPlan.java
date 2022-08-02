package AbstractFactory;

public class ServiceNutritionPlan implements ServiceGym
{
    @Override
    public void jobManager()
    {
        System.out.println("Ya le fue asignado un profesional en nutrición. ");

    }

    @Override
    public void estimatedTime() {
        System.out.println("Puede solicitar una cita para cualquier día de esta semana. La cita tardará 40 minutos. ");
    }

    @Override
    public void paymentReceived() {
        System.out.println("El valor que debe cancelar por su cita con el nutriólogo es de 15000 pesos. ");
    }
}
