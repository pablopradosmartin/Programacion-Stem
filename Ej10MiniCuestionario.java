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
    System.out.println("De que color es el cielo:\n1 azul, \n2 rojo, \n3 negro, \n4 rosa");
    respuesta=sc.nextInt();
    if (respuesta==1) {
        numRespCorrectas+=1;
    } 
    System.out.println("a que hora empieza el instituto: 1 8:45, 2 9:00, 3 8:15, 4 8:30");
    respuesta=sc.nextInt();
    if (respuesta==3) {
        numRespCorrectas+=1;
    } 
     System.out.println("a que hora es el descanso: 1 11:30, 2 11:00, 3 11:45, 4 11:15");
    respuesta=sc.nextInt();
    if (respuesta==4) {
        numRespCorrectas+=1;
    } 
    System.out.println("Has sacado un "+ numRespCorrectas );


   }
   

}


/*¿Qué es un lenguaje de programación?
a) Un conjunto de instrucciones para una computadora.
b) Un dispositivo de entrada.
c) Un tipo de software antivirus.
d) Un programa de diseño gráfico.

¿Cuál de las siguientes no es una variable en la programación?
a) Entero
b) Cadena de caracteres
c) Rueda de bicicleta
d) Flotante

¿Qué es la programación orientada a objetos?
a) Un paradigma de programación que utiliza objetos para representar datos y funcionalidad.
b) Un sistema operativo.
c) Una biblioteca de funciones matemáticas.
d) Un tipo de virus informático.

¿Cuál de las siguientes no es una estructura de control en programación?
a) Bucle
b) Clase
c) Condicional
d) Función

¿Cuál de los siguientes lenguajes es ampliamente utilizado para el desarrollo de aplicaciones móviles?
a) C++
b) Java
c) HTML
d) Photoshop

¿Qué es un IDE en programación?
a) Un Entorno de Desarrollo Integrado, que proporciona herramientas para escribir y depurar código.
b) Un servidor web.
c) Un sistema operativo.
d) Un lenguaje de programación.

¿Qué significa "debuggear" un programa?
a) Encontrar y corregir errores en el código.
b) Ejecutar el programa en modo de prueba.
c) Compilar el programa.
d) Eliminar el programa por completo.

¿Qué es un array o arreglo en programación?
a) Una estructura de datos que almacena una colección de elementos del mismo tipo.
b) Una instrucción de control.
c) Un operador aritmético.
d) Un tipo de bucle.

¿Cuál de los siguientes lenguajes se usa comúnmente para crear páginas web interactivas?
a) Python
b) JavaScript
c) Ruby
d) SQL

¿Qué es un algoritmo?
a) Un conjunto de instrucciones que resuelve un problema o realiza una tarea.
b) Una herramienta de diseño gráfico.
c) Un programa informático.
d) Un tipo de hardware.

Espero que estas preguntas te sean útiles para repasar programación. Si tienes alguna duda sobre alguna de las respuestas, no dudes en preguntar.




User
responde a las preguntas del texto anterior
ChatGPT
Por supuesto, aquí tienes las respuestas a las preguntas del texto anterior:

a) Un conjunto de instrucciones para una computadora.

c) Rueda de bicicleta.

a) Un paradigma de programación que utiliza objetos para representar datos y funcionalidad.

b) Clase.

b) Java.

a) Un Entorno de Desarrollo Integrado, que proporciona herramientas para escribir y depurar código.

a) Encontrar y corregir errores en el código.

a) Una estructura de datos que almacena una colección de elementos del mismo tipo.

b) JavaScript.

a) Un conjunto de instrucciones que resuelve un problema o realiza una tarea.

Espero que estas respuestas te sean de ayuda. Si tienes más preguntas o necesitas aclaraciones adicionales, no dudes en preguntar.




User
gracias te quiero */
