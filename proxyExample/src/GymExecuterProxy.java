import java.util.Scanner;

public class GymExecuterProxy implements  GymExecuterDB
{
    boolean isAdministrator;
    GymExecuterCredential dbExecuter;

    public GymExecuterProxy(String name, String password)
    {
        if (name.equals("Admin")  && password.equals("12Admin."))
        {
            isAdministrator =true;
            dbExecuter = new GymExecuterCredential();
        }
    }

    @Override
    public void executeGymDB(String modification) throws Exception
    {
        if (isAdministrator)
        {
            dbExecuter.executeGymDB(modification);
        }else
        {
            throw new Exception("Si no eres administrador, no puedes hacer modificaciones en la página web!");
        }
    }
}

