package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String REPORTE_INFO = "INFORMACION-DE-ESPECIES-DE-CAFE.txt";
        File Freporte = new File(REPORTE_INFO);
        FileWriter fw = new FileWriter(Freporte);
        PrintWriter pw = new PrintWriter(fw);
        Tipica tipica = new Tipica();
        Borbon borbon = new Borbon();
        MundoNovo mundoNovo = new MundoNovo();
        pw.println(tipica.getInfo());
        pw.println(borbon.getInfo());
        pw.println(mundoNovo.getInfo());
        System.out.println(tipica.getInfo());
        System.out.println(borbon.getInfo());
        System.out.println(mundoNovo.getInfo());
        fw.close();
    }
}
