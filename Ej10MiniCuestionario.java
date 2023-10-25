import java.util.Scanner;
/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 *    que se imparten en el curso. Cada pregunta acertada sumará un punto. El 
 *   programa mostrará al final la calificación obtenida. 
 *
 * 
 */
public class Ej10MiniCuestionario {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int respuesta;
     int numRespCorrectas=0;
    System.out.println("¿Qué es un lenguaje de programación?\n" + 
            "1) Un conjunto de instrucciones para una computadora.\n" + 
            "2) Un dispositivo de entrada.\n" + 
            "3) Un tipo de software antivirus.\n" + 
            "4) Un programa de diseño gráfico.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Cuál de las siguientes no es una variable en la programación?\n" + 
            "1) Entero\n" + 
            "2) Cadena de caracteres\n" + 
            "3) Rueda de bicicleta\n" + 
            "4) Flotante");
    respuesta=sc.nextInt();
    if (respuesta==3) {
        numRespCorrectas+=1;
    } 
     System.out.println("¿Qué es la programación orientada a objetos?\n" + 
             "1) Un paradigma de programación que utiliza objetos para representar datos y funcionalidad.\n" + 
             "2) Un sistema operativo.\n" + 
             "3) Una biblioteca de funciones matemáticas.\n" + 
             "4) Un tipo de virus informático.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    } 
    System.out.println("¿Cuál de las siguientes no es una estructura de control en programación?\n" + 
            "1) Bucle\n" + 
            "2) Clase\n" + 
            "3) Condicional\n" + 
            "4) Función");
    respuesta=sc.nextInt();
    if (respuesta==2) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Cuál de los siguientes lenguajes es ampliamente utilizado para el desarrollo de aplicaciones móviles?\n" + //
            "1) C++\n" + 
            "2) Java\n" + 
            "3) HTML\n" + 
            "4) Photoshop");
    respuesta=sc.nextInt();
    if (respuesta==2) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué es un IDE en programación?\n" + 
            "1) Un Entorno de Desarrollo Integrado, que proporciona herramientas para escribir y depurar código.\n" + 
            "2) Un servidor web.\n" + 
            "3) Un sistema operativo.\n" + 
            "4) Un lenguaje de programación. ");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué significa \"debuggear\" un programa?\n" + 
            "1) Encontrar y corregir errores en el código.\n" + 
            "2) Ejecutar el programa en modo de prueba.\n" + 
            "3) Compilar el programa.\n" + 
            "4) Eliminar el programa por completo.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué es un array o arreglo en programación?\n" + 
            "1) Una estructura de datos que almacena una colección de elementos del mismo tipo.\n" + 
            "2) Una instrucción de control.\n" + 
            "3) Un operador aritmético.\n" + 
            "4) Un tipo de bucle.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Cuál de los siguientes lenguajes se usa comúnmente para crear páginas web interactivas?\n" + 
            "1) Python\n" + 
            "2) JavaScript\n" + 
            "3) Ruby\n" + 
            "4) SQL");
    respuesta=sc.nextInt();
    if (respuesta==2) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué es un algoritmo?\n" + 
            "1) Un conjunto de instrucciones que resuelve un problema o realiza una tarea.\n" + 
            "2) Una herramienta de diseño gráfico.\n" + 
            "3) Un programa informático.\n" + 
            "4) Un tipo de hardware.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("Has sacado un "+ numRespCorrectas );


   }
   

}





