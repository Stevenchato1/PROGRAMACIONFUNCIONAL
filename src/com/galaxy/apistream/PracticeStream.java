package com.galaxy.apistream;

import java.util.Arrays;
import java.util.List;

public class PracticeStream {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Steven","Jose","Jahir");
        nombres.stream()
            .filter(nombre -> nombre.contains("e"))
            .map(String::toUpperCase)
            .forEach(System.out::println);

        nombres.stream().forEach(nombre -> System.out.println(nombre));
    }
}
