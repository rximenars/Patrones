package AbstractFactory;

public class RoutinesFactory implements ServiceGymFactory
{
    @Override
    public ServiceGym createService()
    {
        return new ServiceRoutinesDesign();
    }
}
