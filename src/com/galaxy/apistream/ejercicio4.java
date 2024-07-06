package com.galaxy.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Optional<Integer> suma = numeros.stream().reduce((a, b)->a +b);
        System.out.println(suma.get());
    }
}
