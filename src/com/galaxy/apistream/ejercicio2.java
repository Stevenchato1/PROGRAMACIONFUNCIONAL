package com.galaxy.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio2{
    //Uso de stream para convertir la collection en Mayuscula
    public static void main(String[] args) {
        List<String> names = Arrays.asList("juan","pepe","carlos");
        List<String> nombresMayusculas =  names.stream().map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println(nombresMayusculas);


        //Otra forma de usar el map()
        List<String> nameMayus= names.stream().map(p -> p.toUpperCase())
            .collect(Collectors.toList());
        System.out.println(nameMayus); 
    }
}