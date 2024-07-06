package com.galaxy.apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio5 {
    public static void main(String[] args) {
        List<List<Integer>> lista = Arrays.asList(
                                        Arrays.asList(1,2,3),
                                        Arrays.asList(4,5,6),
                                        Arrays.asList(7,8,9)
        );  
        
        List<Integer> flattenedList  = lista.stream().flatMap(List::stream)
                                                     .collect(Collectors.toList());
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(flattenedList);
    }
}
