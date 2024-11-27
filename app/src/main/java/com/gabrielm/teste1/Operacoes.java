package com.gabrielm.teste1;

public class Operacoes {
    private float a;
    private float b;

    public Operacoes(float a, float b){
        this.a = a;
        this.b = b;
    }
    public float soma(){
        return a+b;
    }
    public float subtracao(){
        return a-b;
    }
    public float mutiplicacao(){
        return a*b;
    }
    public float divisao(){
        return a/b;
    }
}
