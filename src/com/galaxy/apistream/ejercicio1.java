package com.galaxy.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio1 {
    //Ejercicio usando stream() para numeros pares
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numeroPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(numeroPares);


    }
}
