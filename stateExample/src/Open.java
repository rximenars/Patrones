public class Open implements State
{
    @Override
    public void executeAction()
    {
        System.out.println("Gimnasio abierto, bienvenido!");
        System.out.println("Enviando correo a clientes... ");
    }
}