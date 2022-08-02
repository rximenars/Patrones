public class Manteinance implements State
{
    @Override
    public void executeAction()
    {
        System.out.println("Máquinas en mantenimiento; vuelva más tarde porfavor!");
        System.out.println("Enviando correo a clientes con reserva... ");
    }

}
