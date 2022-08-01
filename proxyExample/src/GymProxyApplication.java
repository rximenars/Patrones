import java.util.Scanner;

public class GymProxyApplication
{
    public static void main (String[] args )throws  Exception
    {
        String user;
        String password;
        Scanner newUser = new Scanner(System.in);

        System.out.println("Nombre de usuario: ");
        user = newUser.next();


        Scanner newPassword = new Scanner(System.in);

        System.out.println("Contraseña: ");
        password =newPassword.next();

        GymExecuterDB userExecuter = new GymExecuterProxy("Admin","12Admin");
        userExecuter.executeGymDB("Subir imagen");
    }
}

