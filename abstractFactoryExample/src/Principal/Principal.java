package Principal;

import AbstractFactory.*;

import java.util.Scanner;

public class Principal
{
    private static Scanner Scan = new Scanner(System.in);

            public static void  main (String[] args)
            {
                int service;
                do
                {
                    service = preguntarServicio();
                    switch (service)
                    {
                        case 1:
                            usarServicio(new RoutinesFactory());
                            break;
                        case 2:
                            usarServicio(new TrainingFactory());
                            break;
                        case 3:
                            usarServicio(new NutritionFactory());
                            break;
                        case 0:
                            System.out.println("Cancelando solicitud...");
                        default:
                            System.out.println("Esa opción no es válida!");
                    }
                    System.out.println("\n");
                }   while (service!=0);
            }
            public static void usarServicio (ServiceGymFactory factory)
            {
                ServiceGym servicio = factory.crearServicio();
                servicio.encargadoTrabajo();
                servicio.tiempoEstimado();
                servicio.pagoRecibido();
            }

            public static int preguntarServicio()
            {
                System.out.println(
                        "Por favor seleccione una de las siguientes opciones: \n"
                        + "                                        MENÚ                                          \n"
                        + "______________________________________________________________________________________\n"
                        + " 1. Solicita un profesional para que diseñe tu plan de entrenamiento.\n "
                        + "2. Solicita un entrenador personal.\n "
                        + "3. Solicita una cita para diseñar tu plan de nutrición.\n "
                        + "0. Cancelar solicitud.\n "
                );
                return Integer.parseInt( Scan.nextLine() );
            }
}
