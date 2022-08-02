package AbstractFactory;

public class NutritionFactory implements ServiceGymFactory
{
    @Override
    public ServiceGym createService()
    {
        return new ServiceNutritionPlan();
    }
}
