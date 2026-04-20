package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data; 
import lombok.NoArgsConstructor;

// public record Persona(String nombre, double altura, String correo) {}


// Una clase record es una clase especial en Java que se utiliza para representar datos inmutables.
// Los records son una forma concisa de definir clases que solo contienen datos, sin necesidad de
// escribir código adicional para constructores, getters, equals, hashCode, etc. En este caso, la clase
// Persona es un record que tiene dos campos: nombre (de tipo String) y altura (de tipo double). 
// Al ser un record, se generan automáticamente los métodos necesarios para acceder a estos campos y
// para comparar objetos de tipo Persona.

// @Builder public record Persona(String nombre, double altura, String correo) {}


//en este caso se debe importar Data para trabajar con Strings
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder 
public class Persona {
    private String nombre;
    private double altura;
    private String correo;
}

