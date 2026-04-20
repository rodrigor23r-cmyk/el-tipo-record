package com.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
   
       /* Persona instanciapersona = new Persona(); esto estaría mal si Persona fuese abstracta, no se puede instanciar
         Una clase final no puede ser abstracta, por lo tanto no se puede instanciar, pero si se pueden crear objetos 
         de esa clase, es decir, se pueden crear objetos de una clase final, pero no se pueden crear objetos de una clase abstracta.
         Además, una clase final no puede ser heredada, por lo tanto no se pueden crear subclases de una clase final, pero si se pueden
         crear subclases de una clase abstracta.
         */

        Persona persona1 = new Persona(
            "Juan",
            1.75,
            "juan@example.com"
        );
        /*
        * No necesito Lombok para crear una clase record, ya que el compilador de Java se encarga de generar automáticamente 
        los métodos necesarios para acceder a los campos y para comparar objetos de tipo Persona.
        @Builder es una anotación de Lombok que se utiliza para generar un patrón de diseño Builder, que permite crear objetos
        de una clase de manera más flexible y legible. Sin embargo, en el caso de una clase record, no es necesario utilizar
        @Builder, ya que el constructor generado automáticamente por el compilador de Java ya proporciona una forma sencilla
        de crear objetos de la clase record.
        */
        Persona persona2 = new Persona("Maria", 1.65, "maria@example.com");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la altura de la persona: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese el correo de la persona: ");
        String correo = scanner.nextLine(); 
        Persona persona3 = new Persona(nombre, altura, correo);
        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);
        System.out.println("Persona 3: " + persona3);
     }
}
