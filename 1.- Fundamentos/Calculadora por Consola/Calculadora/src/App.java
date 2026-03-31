import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in); 

        System.out.print("Ingrese un primer digito: ");
        double numero_1 = sc.nextDouble();

        System.out.print("Ingrese su segundo digito: ");
        double numero_2 = sc.nextDouble();


        sc.nextLine();
        
     
        boolean corriendo = true;

        while(corriendo){

            System.out.print("Que operacion desea realizar? \n 1.- Suma \n 2.- Resta \n 3. Multiplicacion \n 4. Division \n 5. Salir: \n");
            String nombre = sc.nextLine().toLowerCase();

             switch (nombre) {
                
                case "suma" :   
                    double suma = numero_1 + numero_2;
                    System.out.print("El resultado de la suma es " + suma);    
                    break;
                
                case "resta" : 
                    if (numero_2 > numero_1) {
                        System.out.print("Esta seguro de que desea obtener un numero negativo? Responda con:  \n Si \n No \n: ");
                        String confirmacion = sc.nextLine().toLowerCase();
                            
                            if(confirmacion.equals("si")){
                                double resta = numero_1 - numero_2;
                                System.out.println(resta);
                            }
                            else {
                                System.out.println("Operacion cancelada");
                            }
                        break;
                    }
                
                case "multiplicacion" : 

                    double multiplicacion = numero_1 * numero_2;
                    System.out.print("El resultado de la multiplicacion es: " + multiplicacion);
                    break;

                case "division" : 
                    if(numero_2 == 0){
                        System.err.println("No se puede dividir entre 0");
                    }
                    else{
                        double division = numero_1 / numero_2;
                        System.out.println("El resultado de la division es: " + division);
                    }
                    break;

                case "salir" : 
                    System.err.println("Saliendo...");
                    sc.close();
                    corriendo = false;
                    break;

                default:
                    break;
            }   
        }       
    }
}
