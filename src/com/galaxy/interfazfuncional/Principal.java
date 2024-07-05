package com.galaxy.interfazfuncional;

public class Principal {
    public static void main(String[] args) {
        Operacion operacion =  (a, b) ->  a - b;
        System.out.println(operacion.calcular(2, 2));

        ImplementacionOperacion impl = new ImplementacionOperacion();
        System.out.println(impl.calcular(2, 2));
    }
}
