package AbstractFactory;

public class TrainingFactory implements ServiceGymFactory
{
    @Override
    public ServiceGym crearServicio()
    {
        return new ServicePersonalTraining();
    }
}
