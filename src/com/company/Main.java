package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String REPORTE_BORBON = "Reporte_Borbon.txt";
        String REPORTE_TIPICA = "Reporte_Tipica.txt";
        String REPORTE_CATURRA = "Reporte_Caturra.txt";
        String REPORTE_CRUCES = "Reporte_Cruces.txt";

        File Fborbon = new File(REPORTE_BORBON);
        File Ftipica = new File(REPORTE_TIPICA);
        File Fcaturra = new File(REPORTE_CATURRA);
        File Fcruces = new File(REPORTE_CRUCES);
        PrintWriter pw_borbon = new PrintWriter(new FileWriter(Fborbon));
        PrintWriter pw_tipica = new PrintWriter(new FileWriter(Ftipica));
        PrintWriter pw_caturra = new PrintWriter(new FileWriter(Fcaturra));
        PrintWriter pw_cruces = new PrintWriter(new FileWriter(Fcruces));
        //Creacion de Array Unidimensional de Listas
        ListaEnlazada[] especies = new ListaEnlazada[3];
        //Creacion de Array Bidimensional 
        Arreglo bid= new Arreglo(3,4);
        //Mostrar experimentos
        bid.Mostrar();
        //Creación de Plantas
        Tipica tipica = new Tipica();
        Borbon borbon = new Borbon();
        MundoNovo mundoNovo = new MundoNovo();
        Caturra caturra = new Caturra();
        Catuai catuai = new Catuai();
        //Cruce de plantas
        PlantaCafe hibrido1 = borbon.cruzar(tipica);
        PlantaCafe hibrido2 = hibrido1.cruzar(caturra);
        //Asignación de plantas puras al array
        especies[0] = new ListaEnlazada();
        especies[1] = new ListaEnlazada();
        especies[2] = new ListaEnlazada();
        especies[0].agregarAlFinal(tipica);
        especies[0].agregarAlFinal(hibrido1);
        especies[0].agregarAlFinal(hibrido2);
        especies[1].agregarAlFinal(borbon);
        especies[1].agregarAlFinal(hibrido1);
        especies[1].agregarAlFinal(hibrido2);
        especies[2].agregarAlFinal(caturra);
        especies[2].agregarAlFinal(hibrido2);
        //Mostrar listas de especies
        especies[0].listar();
        especies[1].listar();
        especies[2].listar();
        //Filas Secuenciales Puras
        pw_borbon.println(borbon.getInfo());
        pw_tipica.println(tipica.getInfo());
        pw_caturra.println(caturra.getInfo());
        //Filas Secuenciales Puras
        pw_cruces.println(hibrido1.getInfo());
        pw_cruces.println(hibrido2.getInfo());
        //Creación de Pila
        Pila expedientes = new Pila();
        expedientes.apilar(Fborbon);
        expedientes.apilar(Ftipica);
        expedientes.apilar(Fcaturra);
        expedientes.apilar(Fcruces);
        expedientes.cima();
        expedientes.mostrar();
        expedientes.desapilar();
        expedientes.desapilar();
        expedientes.mostrar();
        //Creacion de Cola
        Cola colaCruce = new Cola();
        colaCruce.encolar(mundoNovo);
        colaCruce.encolar(catuai);
        colaCruce.encolar(caturra);
        colaCruce.imprimir();
        System.out.println("\nLuego de desencolar");
        colaCruce.desencolar();
        colaCruce.imprimir();
        System.out.println("\nCima: ");
        System.out.println(colaCruce.cima().getNombre());
        //Cerrando buffers de escritura
        pw_borbon.close();
        pw_tipica.close();
        pw_caturra.close();
        pw_cruces.close();
    }
}
