package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Banco {

    public List<Integer> cuentas_guardadas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Cuenta cuenta;
    
    public int CrearNIP(Integer candidato_nip){

        System.out.print("Solo cuenta con 3 oportunidades para responder");
        System.out.print("Los NIPS solo deben contener 4 digitos, NO mas");
        System.out.print("Desea crear su propio NIP o que el banco se lo asigne? \n (1 para crearlo usted, 2 para que se lo asigne el banco): ");
        Integer respuesta = sc.nextInt();
        int oportunidades = 3;

        

        try {
            
            while (oportunidades > 0) {

                if(respuesta.equals(1)){

                    while (oportunidades > 0) {
                    
                        if(candidato_nip != null){
                            System.out.println("Procesando numero de cuenta...: " + candidato_nip);

                            int prueba_nip = String.valueOf(candidato_nip).length();

                            if(prueba_nip != 4){
                                System.out.println("Numero rechazado, el nip solo debe contener 4 digitos");
                                oportunidades --;
                            }
                            else{
                                cuentas_guardadas.add(candidato_nip);
                            }

                        }
                    }

                }
                else if(respuesta.equals(2)){

                    int[] elemento = new int[3];
                    
                    Random random = new Random();
                    
                    for(int i = 0; i < elemento.length; i++){

                        elemento[i] = random.nextInt(11);
                    }
                    
                    int creacion_nip = 0;

                    for(int numero : elemento){

                        creacion_nip = creacion_nip * 10 + numero;
                    }

                    return cuenta.nip = creacion_nip;
                }
                else{
                    System.out.print("Sera penalizado con un intento menos por colocar un numero diferente a los indicados: " + oportunidades);
                }
            }
                
        } 
            catch (Exception e) {
                System.out.println("Error: " + e);
            }

        return candidato_nip;
    }

    public boolean ValidarInicioSesion(Integer numero_cuenta){
        
        if(numero_cuenta != null){
            for(Integer cuenta_buscar : cuentas_guardadas){
                if(cuenta_buscar.equals(numero_cuenta)){
                    return true;
                }   
            }
        }
        return false;
    }
}
