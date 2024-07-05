package com.galaxy.lambda;

public class Principal {
    public static void main(String[] args) {
        /* 
        Runnable runnable = public void run(){
            System.out.println("esto es un error no compila");
        }*/
        Runnable runnable  = () ->{ System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola denuevo");

        };

        runnable.run();
    
    }
}
