import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        boolean running = true;

        Scanner sc = new Scanner(System.in);

        while(running){

            System.out.println("Bienvenido al juego de adivinar un numero!!!");
            System.out.print("Pulsa 1 para continuar, pulsa 0 para salir: ");
            int confirmacion = sc.nextInt();

            if( confirmacion == 0) {
                System.out.println("Saliendo...");
                running = false;
                sc.close();
            }
            else if(confirmacion == 1)
            {

                int vidas = 3;
                System.out.println("Continuemos");

                System.out.print("Vas a tener que adivinar un numero entre el 0 y el 10 \n");
                int numero = random.nextInt(1);

                

                while (vidas > 0) {

                    System.out.print("Ingrese el numero: ");
                    int numero_jugador = sc.nextInt();

                    if(numero == numero_jugador)
                    {
                        System.out.print("Felicidades, adivinaste el numero");
                        System.out.print("Numero del jugador: " + numero_jugador);
                        System.err.print("Numero generado: " + numero);
                        break;
                    }
                    else {
                        vidas --;
                        System.out.println("Vidas restantes: " + vidas);                            
                        System.out.print("Numero equivocado, prueba otra vez: ");
                    }
                }

                if(vidas == 0)
                {
                    System.out.print("Perdiste, saliendo de la app...");
                    running = false;
                    sc.close();
                }
                else
                {
                    System.out.println("Respuesta no reconocida, saliendo de la app...");
                    running = false;
                    sc.close();
                }
            }
        }
    }
}
