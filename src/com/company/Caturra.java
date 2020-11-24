package com.company;

public class Caturra extends PlantaCafe{
    public Caturra() {
        super("bajo", "media", "verde", "precoz", "mediana",
                1.8f , false, false);
        this.ascendienteDirecto = "Borbón";
        this.nombre = "Caturra";
        this.esPuro = true;
    }

    public PlantaCafe cruzar(PlantaCafe especie) {
        if(especie.nombre.equals("Mundo Novo")) {
            System.out.println("Cruce exitoso");
            System.out.println("Se ha creado un híbrido: Catuai");
            return new Catuai();
        }
        System.out.println("No se permite ese cruce :(");
        return especie;
    }
}
