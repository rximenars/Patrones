import java.util.Scanner;

public class PrincipalState
{
    public static void main (String... args)
    {
        Gym gym = new Gym();
        Open open = new Open();
        Manteinance manteinance = new Manteinance();
        int option =0;
        Scanner scan = new Scanner(System.in);

        do
        {
            menuOptions();
            option = scan.nextInt();
            switch (option)
            {
                case 1:
                    gym.setState(open);
                    break;
                case 2:
                    gym.setState(manteinance);
                    break;
                case 0:
                    System.out.println("Cancelando solicitud...");
                default:
                    System.out.println("Esa opción no es válida!");
            }
            gym.executeAction();
        }   while (option!=0);
    }
    private static void menuOptions()
    {
        StringBuffer menu = new StringBuffer();
        System.out.println(
                "Por favor seleccione una de las siguientes opciones: \n"
                        + "                                        MENÚ                                          \n"
                        + "______________________________________________________________________________________\n"
                        + " 1. El gimnasio está abierto.\n "
                        + "2. Se está realizando mantenimiento a las máquinas.\n "
                        + "0. Cancelar solicitud.\n "
        );
        System.out.println(menu.toString());
    }
}