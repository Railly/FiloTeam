package com.company;

@SuppressWarnings("unchecked")

public class ArbolGeneral<T> {
    public NodoArbol<T> raiz;

    public ArbolGeneral(T valor) {
        this.raiz = new NodoArbol<T>(valor);
    }

    void insertar(T padre,T hijo){
        NodoArbol<T> [] p = new NodoArbol[1];//dirección de memoria
        buscar(raiz, p, padre);
        if(p[0] != null){
            NodoArbol<T> x = new NodoArbol<T>(hijo);
            if(p[0].hijo == null){
                p[0].hijo = x;
            }
            else{
                p[0] = p[0].hijo;
                while(p[0].hermano != null){
                    p[0] = p[0].hermano;
                }
                p[0].hermano = x;
            }
        }
        else{
            NodoArbol<T> aux = raiz;
            while(aux.hermano != null)
                aux = aux.hermano;
            NodoArbol<T> pa = new NodoArbol<T>(padre);
            NodoArbol<T> hi = new NodoArbol<T>(hijo);
            pa.hijo = hi;
            aux.hermano = pa;
        }
    }


    public void buscar(NodoArbol<T> padre, NodoArbol<T>[] puntero, T n) {
        if (padre != null) {
            if (padre.info == n) {
                puntero[0] = padre;
            }
            buscar(padre.hijo, puntero, n);
            buscar(padre.hermano, puntero, n);
        }
    }

    public void postOrden(NodoArbol<PlantaCafe> n) {
        if (n != null) {
            NodoArbol<PlantaCafe> c;
            for (c = n.hijo; c != null; c = c.hermano) {
                postOrden(c);
            }
            System.out.print(n.info.nombre + " ");
        }
    }

    public void inOrden(NodoArbol<PlantaCafe> n) {
        if (n != null) {
            NodoArbol<PlantaCafe> c = n.hijo;
            if (c != null) {
                inOrden(n.hijo);
                System.out.print(n.info.nombre + " ");
                for (c = c.hermano; c != null; c = c.hermano)
                    inOrden(c);
            } else
                System.out.print(n.info.nombre + " ");
        }
    }

    public void preOrden(NodoArbol<PlantaCafe> n){
        if(n != null){
            System.out.print(n.info.nombre + " ");
            for(n = n.hijo;n != null;n = n.hermano) {
                preOrden(n);
            }
        }
    }
}