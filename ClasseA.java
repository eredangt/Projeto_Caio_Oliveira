# -*- coding: utf-8 -*-
/*
Trabalho Prático de Gestão de Versões - Engenharia de Software - GCC188 - 2020/01
Nome:
    Caio de Oliveira Lopes, 10A, 201820267.
*/
public class ClasseA{
    ClasseA(){
        private int A1;
        private float A2;
    }
    
    public void setA1(int A1){
        this.A1 = A1;
    }

    public void setA2(float A2){
        this.A2 = A2;
    }

    public int getA1(){
        return A1;
    }

    public float getA2(){
        return A2;
    }

    public String MA1(){
        return "MA1";
    }

    public String MA2(){
        return "MA2";
    }

    public String MA3(){
        return "Alteração a classe A partir do clone";
    }
}