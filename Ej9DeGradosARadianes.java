import java.util.Scanner;
/*
 *  Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo
 *  y muestre el equivalente en radianes. Si el ángulo introducido por el usuario no
 *  se encuentra en el rango de 0º a 360º, hay que transformarlo a dicho rango.
 * 
 */
public class Ej9DeGradosARadianes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grados;
        double radianes;
        //1 ° × π / 180 
        System.out.println("Dame los grados que tenga el angulo que quieras pasar a radianes:");
        grados = sc.nextInt();
        
        int numeroDeVueltas;
        
       
        if (grados>360) {
        System.out.println("Tu angulo es mayor de 360 grados");
        numeroDeVueltas=grados/360;
        grados = grados%360;
        System.out.println("Has dado "+ numeroDeVueltas + " vueltas mas " + grados + " grados");
        radianes = grados * Math.PI / 180;
        System.out.println("Tus radianes son " + radianes);
        } else {
             radianes = grados * Math.PI / 180;
             System.out.println( "Un ángulo de " +grados + " grados son: " + radianes + " radianes");
        }



    }
}
