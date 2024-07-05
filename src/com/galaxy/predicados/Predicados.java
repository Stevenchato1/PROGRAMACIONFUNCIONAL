package com.galaxy.predicados;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        List<String> listaPalabras = Arrays.asList("java", "C" , "Ruby", "Angular");
        Predicate<String> contieneA = palabra -> palabra.contains("a");
        listaPalabras.stream().filter(contieneA).forEach(p-> System.out.println(p));
        
    }
}
