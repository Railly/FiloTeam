package com.company;

public class NodoLista {
    PlantaCafe especieCafe;
    NodoLista siguiente;
    public NodoLista(PlantaCafe especieCafe) {
        this.especieCafe = especieCafe;
        this.siguiente = null;
    }
}
