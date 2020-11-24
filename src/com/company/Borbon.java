package com.company;

public class Borbon extends  PlantaCafe{
    public Borbon() {
        super("alto", "media", "verde",
                "precoz", "mediana", 3.0f, false, false);
        this.ascendienteDirecto = "Arabica";
        this.nombre = "Borbon";
        this.esPuro = true;
    }

    public PlantaCafe cruzar(PlantaCafe especie) {
        if(especie.nombre.equals("Tipica")) {
            System.out.println("Cruce exitoso");
            System.out.println("Se ha creado un híbrido: Mundo Novo");
            return new MundoNovo();
        }
        System.out.println("No se permite ese cruce :(");
        return especie;
    }
}
