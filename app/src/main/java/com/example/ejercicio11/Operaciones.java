package com.example.ejercicio11;

public class Operaciones {
    private Integer num1, num2;

    public Operaciones(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Suma(){
        return num1+num2;
    }

    public int Resta(){
        return num1-num2;
    }

    public int Multiplicacion(){
        return num1*num2;
    }

    public int Division() {
        return num1 / num2;
    }
}
