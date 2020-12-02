package com.company;

public class Cola {
    public NodoLista primero;
    public NodoLista ultimo;
    public int tamanio = 0;

    public Cola() {
        primero = null;
        ultimo = null;
    }

    public boolean estaVacia() {
        return (tamanio == 0);
    }

    public int getTamanio() {
        return tamanio;
    }

    public void encolar(PlantaCafe especie) {
        NodoLista nuevo = new NodoLista(especie);
        if(estaVacia()) {
            primero = nuevo;
        } else {
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        tamanio++;
    }

    public PlantaCafe desencolar() {
        PlantaCafe especie = primero.especieCafe;
        if(!estaVacia()) {
            if(primero == ultimo) {
                primero = null;
                ultimo = null;
            } else{
                primero = primero.siguiente;
            }
            tamanio--;
        } else {
            System.out.println("Cola vacía");
            especie.nombre = "";
            especie.ascendienteDirecto = "";
            especie.altura = 0.0f;
        }
        return  especie;
    }

    public void imprimir() {
        NodoLista aux = primero;
        System.out.println("Listado de la cola: ");
        while (aux != null) {
            System.out.print(aux.especieCafe.getNombre() + " <- ");
            aux = aux.siguiente;
        }
        System.out.println();
    }
}
