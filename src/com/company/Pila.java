package com.company;

import java.io.File;
import java.io.IOException;

public class Pila {
    public NodoPila top;

    public void apilar(File archivo) {
        if (null == top) {
            top = new NodoPila(archivo);
        } else {
            NodoPila temp = new NodoPila(archivo);
            temp.siguiente = top;
            top = temp;
        }
    }
    public File desapilar() {
        File data = top.archivo;
        top = top.siguiente;
        return data;
    }

    public File cima() throws IOException {
        if(top == null) {
            System.out.println("Pila vacía");
        } else {
            System.out.println("Cima: " + top.archivo.getCanonicalPath());
        }
        return top.archivo;
    }

    public boolean estaVacio() {
        return top == null;
    }

    public void mostrar() throws IOException {
        NodoPila aux = top;
        if(aux != null) {
            System.out.println("\\--------------------------  CIMA  --------------------------/");
            while (aux != null) {
                System.out.println(" | " + aux.archivo.getCanonicalPath() + " |");
                System.out.println(" | -------------------------------------------------------- |");
                aux = aux.siguiente;
            }
            System.out.println();
        } else {
            System.out.println("\\--------------------------  CIMA  --------------------------/");
            System.out.println(" | -------------------------------------------------------- |");
            System.out.println("Pila vacía :(");
        }
    }
}
