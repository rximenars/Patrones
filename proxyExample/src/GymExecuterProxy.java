import java.util.Scanner;

public class GymExecuterProxy implements  GymExecuterDB
{
    boolean esAdministrador;
    GymExecuterCredential dbExecuter;

    public GymExecuterProxy(String name, String password)
    {
        if (name == "Admin" && password =="12Admin.")
        {
            esAdministrador =true;
            dbExecuter = new GymExecuterCredential();
        }
    }

    @Override
    public void executeGymDB(String modificacion) throws Exception
    {
        if (esAdministrador)
        {
            dbExecuter.executeGymDB(modificacion);
        }else
        {
            throw new Exception("Si no eres administrador, no puedes hacer modificaciones en la página web!");
        }
    }
}

