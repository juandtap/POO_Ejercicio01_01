/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio0101;

/**
 *
 * @author diego
 */
public class Ejercicio0101 {

    public static void main(String[] args) {
        
        // Clase Gato
        Gato cat1 = new Gato();
        cat1.nombre = "pelusa";
        cat1.edad = 4;
        cat1.color = "gris";
        cat1.peso = 10;
        System.out.println("El gato se llama "+cat1.nombre+" es de color "+cat1.color+" tiene "+cat1.edad+" anios "+" y pesa "+cat1.peso);
        
        Gato cat2 = new Gato();
        cat2.nombre = "coockie";
        cat2.edad = 6;
        cat2.color = "blanco";
        cat2.peso = 15;
        System.out.println("El gato se llama "+cat2.nombre+" es de color "+cat2.color+" tiene "+cat2.edad+" anios "+" y pesa "+cat2.peso);
        
        // Clase Auto
        Auto car1 = new Auto();
        car1.placa = "PCB-2344";
        car1.anio = 2020;
        car1.color = "rojo";
        car1.modelo = "honda";
        System.out.println("Auto : Placa: "+car1.placa+" modelo: "+car1.modelo+" anio fabricacion: "+car1.anio+" color: "+car1.color);
         
        Auto car2 = new Auto();
        car2.placa = "ARB-7896";
        car2.anio = 2010;
        car2.color = "blanco";
        car2.modelo = "hyundai";
        System.out.println("Auto : Placa: "+car2.placa+" modelo: "+car2.modelo+" anio fabricacion: "+car2.anio+" color: "+car2.color);
    
        // Clase Persona
        Persona persona1 = new Persona();
        persona1.nombre = "diego tapia";
        persona1.cedula = "0105922587";
        persona1.telefono = "0984239035";
        persona1.anioNacimiento = 1888;
        System.out.println("Nombre "+persona1.nombre+" cedula: "+persona1.cedula+" telefono: "+persona1.telefono+" anio nacimiento: "+persona1.anioNacimiento);
    
        Persona persona2 = new Persona();
        persona2.nombre = "juan vasquez";
        persona2.cedula = "0105922777";
        persona2.telefono = "0984569035";
        persona2.anioNacimiento = 1890;
        System.out.println("Nombre "+persona2.nombre+" cedula: "+persona2.cedula+" telefono: "+persona2.telefono+" anio nacimiento: "+persona2.anioNacimiento);
        
        // Libro
        Libro book1 = new Libro();
        book1.isbn = "12po456";
        book1.titulo = "el hobbit";
        book1.nombreAutor = "JRR Tolkien";
        book1.anioPublicacion = 1920;
        System.out.println("Libro: "+book1.titulo+" autor: "+book1.nombreAutor+" anio publicacion: "+book1.anioPublicacion+" ISBN: "+book1.isbn);
        
        Libro book2 = new Libro();
        book2.isbn = "1277b56";
        book2.titulo = "game of thrones";
        book2.nombreAutor = "G R R martin";
        book2.anioPublicacion = 2015;
        System.out.println("Libro: "+book2.titulo+" autor: "+book2.nombreAutor+" anio publicacion: "+book2.anioPublicacion+" ISBN: "+book2.isbn);
        
        // SmartPhone
        SmartPhone phone1 = new SmartPhone();
        phone1.modelo = "A10";
        phone1.marca = "Samsumg";
        phone1.imei ="74389274982";
        phone1.anio = 2019;
        System.out.println("Smartphone: "+phone1.marca+" "+phone1.modelo+" anio: "+phone1.anio+" IMEI: "+phone1.imei);
        
        SmartPhone phone2 = new SmartPhone();
        phone2.modelo = "SM 210";
        phone2.marca = "Samsumg";
        phone2.imei ="88895274982";
        phone2.anio = 2012;
        System.out.println("Smartphone: "+phone2.marca+" "+phone2.modelo+" anio: "+phone2.anio+" IMEI: "+phone2.imei);
    }
    
    
}
