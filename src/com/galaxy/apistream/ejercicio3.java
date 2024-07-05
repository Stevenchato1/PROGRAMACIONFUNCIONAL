package com.galaxy.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio3 {
    public static void main(String[] args) {
        List<String> listadoNombres = Arrays.asList("juan","pedro","luis","jose");
        List<String> listaNombresOrdenado  =listadoNombres.stream().sorted()
                                            .collect(Collectors.toList());
        System.out.println(listaNombresOrdenado);

        System.out.println("Listado de nombres descendentes");
        List<String> listaNombresOrdenadoInversa  =listadoNombres.stream().sorted((a,b)-> b.compareTo(a))
                                            .collect(Collectors.toList());
        System.out.println(listaNombresOrdenadoInversa);
    }
}
