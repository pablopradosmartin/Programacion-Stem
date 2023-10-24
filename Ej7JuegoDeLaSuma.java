/*
    Realiza el «Juego de la suma», que consiste en que aparezcan dos números aleatorios 
    (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe indicar
    si el resultado de la operación es correcto o incorrecto.
*/


import java.util.Random;
import java.util.Scanner;

public class Ej7JuegoDeLaSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= (int)(Math.random()*99+1);
        int num2 = (int)(Math.random()*99+1);
        int sumaMaquina = num1 + num2;
        int sumaUsuario;

        System.out.println("Buenas, te voy a dar dos numeros randoms entre 1 y 99, y te va a tocar sumarlos: ");
        System.out.println("Los numeros son " + num1 + " y " + num2 + " .Ponme el resultado de estos a continuación:" );
        sumaUsuario = sc.nextInt();

        if (sumaMaquina==sumaUsuario) {
            System.out.println("Está correcta tu suma, sabes sumar "+ num1 +" mas"+ num2 + " da" + sumaMaquina );
        } else {
            System.out.println("Es incorrecto, no sabes sumar. El número "+ num1 +" mas" + num2 +" da:" +sumaMaquina + " pero tu suma da:" +sumaUsuario);
        }

    }
}
