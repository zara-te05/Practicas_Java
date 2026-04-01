import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean running = true;
        System.out.println("Bienvenido a la conversora de unidades!!!");

        Scanner sc = new Scanner(System.in);
        List<String> elementos = Arrays.asList("celsius", "fahrenheit", "kelvin", "salir");

        System.out.print("Ingrese la unidad de medida que va a convertir (Celsius, Fahrenheit, Kelvin, Salir): ");
        String medida_inicial = sc.nextLine().toLowerCase();

        System.out.print("Ingrese la unidad a la que desea convertir (Celsius, Fahrenheit, Kelvin): ");
        String medida_final = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el valor del elemento actual a convertir: ");
        double valor = sc.nextDouble();

        if(!elementos.contains(medida_inicial)){
            System.out.println("Elemento no encontrado"); 
        }

        if(!elementos.contains(medida_final)){
            System.out.println("Elemento no encontrado");
        }

        while (running) {
            
            switch (medida_inicial) {

                case "celsius":
                    switch (medida_final) {
                        case "fahrenheit":
                            Celsius_Fahrenheit(valor);
                            break;

                        case "kelvin":
                            Celsius_Kelvin(valor);
                            break;

                        default:
                            break;
                    }
                    break;
            
                case "fahrenheit" :
                    switch (medida_final) {
                        case "celsius":
                            Fahrenheit_Celsius(valor);
                            break;

                        case "kelvin":
                            Fahrenheit_Kelvin(valor);
                            break;

                        default:
                            break;
                    }
                    break;
            
                case "kelvin" :
                    switch (medida_final) {
                        case "celsius":
                            Kelvin_Celsius(valor);
                            break;

                        case "fahrenheit":
                            Kelvin_Fahrenheit(valor);
                            break;
                            
                        default:
                            break;
                    }
                    break;

                case "salir" : 
                    
                    System.err.println("Saliendo...");
                    sc.close();
                    running = false;
                    break;
                    
                default:
                    break;

            }
        }
    }

    public static double Celsius_Fahrenheit(double valor){

        double resultado = (valor * 1.8) + 32;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double Celsius_Kelvin(double valor){

        double resultado = valor + 273.15;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double Fahrenheit_Celsius(double valor){

        double resultado = (valor - 32) / 1.8;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double Fahrenheit_Kelvin(double valor){

        double resultado = (valor + 459.67) / 1.8;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double Kelvin_Celsius(double valor){

        double resultado = (valor - 273.15);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double Kelvin_Fahrenheit(double valor){

        double resultado = ((valor - 273.15) * 1.8) + 32;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }
}
