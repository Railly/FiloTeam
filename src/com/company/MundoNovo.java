package com.company;

public class MundoNovo extends PlantaCafe {
    public MundoNovo() {
        super("alto", "media", "bronce o verde", "intermedia",
                "mediana", 3.0f, false, false);
        this.ascendienteDirecto = "Tipica y Borbón";
        this.nombre = "Mundo Novo";
        this.esPuro = false;
    }

    public PlantaCafe cruzar(PlantaCafe especie) {
        if(especie.nombre.equals("Caturra")) {
            System.out.println("Cruce exitoso");
            System.out.println("Se ha creado un híbrido: Catuai");
            return new Catuai();
        }
        System.out.println("No se permite ese cruce :(");
        return especie;
    }
}
