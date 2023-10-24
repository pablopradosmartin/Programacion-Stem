import java.util.Scanner;
import java.util.Random;
/*
 * Modifica la Actividad 7 para que, además de los dos números aleatorios, 
 * también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.
*/
public class Ej8JuegoSumaRestaYMultiplicacion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= (int)(Math.random()*99+1);
        int num2 = (int)(Math.random()*99+1);
        int sumaMaquina = num1 + num2;
        int sumaUsuario;
        int numeroOperacion = (int)(Math.random()*3+1);

         if(numeroOperacion == 1) {

            System.out.println("Buenas, te voy a dar dos numeros randoms entre 1 y 99, y te va a tocar sumarlos: ");
            System.out.println("Los numeros son " + num1 + " y " + num2 + " .Ponme el resultado de estos a continuación:" );
            sumaUsuario = sc.nextInt();

            if (sumaMaquina==sumaUsuario) {
                System.out.println("Está correcta tu suma, sabes sumar "+ num1 +" mas "+ num2 + " da " + sumaMaquina );
            } else {
                System.out.println("Es incorrecto, no sabes sumar. El número "+ num1 +" mas " + num2 +" da " +sumaMaquina + " pero tu suma da:" +sumaUsuario);
            }

        } else if (numeroOperacion ==2 ){
            System.out.println("Buenas, te voy a dar dos numeros randoms entre 1 y 99, y te va a tocar multiplicarlos: ");
            System.out.println("Los numeros son " + num1 + " y " + num2 + " .Ponme el resultado de estos a continuación:" );
            sumaUsuario = sc.nextInt();
            sumaMaquina=num1*num2;
            if (sumaUsuario==sumaMaquina) {
                System.out.println("Está correcta tu multiplicacion, sabes multiplicar "+ num1 +" por "+ num2 + " da " + sumaUsuario );
            } else {
                System.out.println("Es incorrecto, no sabes multiplicar. El número "+ num1 +" por " + num2 +" da " +sumaMaquina + " pero tu multiplicacion da:" +sumaUsuario);
            }

        } else {
             System.out.println("Buenas, te voy a dar dos numeros randoms entre 1 y 99, y te va a tocar restarlos: ");
            System.out.println("Los numeros son " + num1 + " y " + num2 + " .Ponme el resultado de estos a continuación:" );
            sumaUsuario = sc.nextInt();
            sumaMaquina=num1-num2;
            if (sumaUsuario==sumaMaquina) {
                System.out.println("Está correcta tu resta, sabes resta "+ num1 +" por "+ num2 + " da " + sumaUsuario );
            } else {
                System.out.println("Es incorrecto, no sabes resta. El número "+ num1 +" menos " + num2 +" da " +sumaMaquina + " pero tu resta da:" +sumaUsuario);
            }
        }
       
    }
}
