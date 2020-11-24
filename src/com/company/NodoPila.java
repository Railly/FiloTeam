package com.company;

import java.io.File;

public class NodoPila {
    File archivo;
    NodoPila siguiente;

    public NodoPila(File archivo) {
        this.archivo = archivo;
        this.siguiente = null;
    }
}
