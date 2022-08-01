package AbstractFactory;

public class NutritionFactory implements ServiceGymFactory
{
    @Override
    public ServiceGym crearServicio()
    {
        return new ServiceNutritionPlan();
    }
}
