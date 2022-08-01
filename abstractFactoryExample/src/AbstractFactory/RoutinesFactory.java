package AbstractFactory;

public class RoutinesFactory implements ServiceGymFactory
{
    @Override
    public ServiceGym crearServicio()
    {
        return new ServiceRoutinesDesign();
    }
}
