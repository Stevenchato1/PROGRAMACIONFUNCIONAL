package com.galaxy.interfazfuncional;

public class ImplementacionOperacion implements Operacion {

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
    
}
