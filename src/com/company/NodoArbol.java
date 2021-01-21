package com.company;

public class NodoArbol<T> {
    T info;
    NodoArbol<T> hijo;
    NodoArbol<T> hermano;

    public NodoArbol(T valor) {
        this.info = valor;
        this.hijo = null;
        this.hermano = null;
    }
}