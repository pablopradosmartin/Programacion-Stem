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
    }
    System.out.println("¿Cuál de las siguientes no es una variable en la programación?\n" + 
            "a) Entero\n" + 
            "b) Cadena de caracteres\n" + 
            "c) Rueda de bicicleta\n" + 
            "d) Flotante");
    respuesta=sc.nextInt();
    if (respuesta==3) {
        numRespCorrectas+=1;
    } 
     System.out.println("¿Qué es la programación orientada a objetos?\n" + 
             "a) Un paradigma de programación que utiliza objetos para representar datos y funcionalidad.\n" + 
             "b) Un sistema operativo.\n" + 
             "c) Una biblioteca de funciones matemáticas.\n" + 
             "d) Un tipo de virus informático.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    } 
    System.out.println("¿Cuál de las siguientes no es una estructura de control en programación?\n" + 
            "a) Bucle\n" + 
            "b) Clase\n" + 
            "c) Condicional\n" + 
            "d) Función");
    respuesta=sc.nextInt();
    if (respuesta==2) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Cuál de los siguientes lenguajes es ampliamente utilizado para el desarrollo de aplicaciones móviles?\n" + //
            "a) C++\n" + 
            "b) Java\n" + 
            "c) HTML\n" + 
            "d) Photoshop");
    respuesta=sc.nextInt();
    if (respuesta==2) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué es un IDE en programación?\n" + 
            "a) Un Entorno de Desarrollo Integrado, que proporciona herramientas para escribir y depurar código.\n" + 
            "b) Un servidor web.\n" + 
            "c) Un sistema operativo.\n" + 
            "d) Un lenguaje de programación. ");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué significa \"debuggear\" un programa?\n" + 
            "a) Encontrar y corregir errores en el código.\n" + 
            "b) Ejecutar el programa en modo de prueba.\n" + 
            "c) Compilar el programa.\n" + 
            "d) Eliminar el programa por completo.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué es un array o arreglo en programación?\n" + 
            "a) Una estructura de datos que almacena una colección de elementos del mismo tipo.\n" + 
            "b) Una instrucción de control.\n" + 
            "c) Un operador aritmético.\n" + 
            "d) Un tipo de bucle.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Cuál de los siguientes lenguajes se usa comúnmente para crear páginas web interactivas?\n" + 
            "a) Python\n" + 
            "b) JavaScript\n" + 
            "c) Ruby\n" + 
            "d) SQL");
    respuesta=sc.nextInt();
    if (respuesta==2) {
        numRespCorrectas+=1;
    }
    System.out.println("¿Qué es un algoritmo?\n" + 
            "a) Un conjunto de instrucciones que resuelve un problema o realiza una tarea.\n" + 
            "b) Una herramienta de diseño gráfico.\n" + 
            "c) Un programa informático.\n" + 
            "d) Un tipo de hardware.");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    }
    System.out.println("Has sacado un "+ numRespCorrectas );


   }
   

}




