package AbstractFactory;

public class TrainingFactory implements ServiceGymFactory
{
    @Override
    public ServiceGym createService()
    {
        return new ServicePersonalTraining();
    }
}
