package com.company;

public class Tipica extends PlantaCafe{
    public Tipica(){
        super("alto", "baja", "bronce",
                "tardía", "grande", 4.0f, false, true);
        this.ascendienteDirecto = "Arabica";
        this.nombre = "Tipica";
        this.esPuro = true;
    }

    public PlantaCafe cruzar(PlantaCafe especie) {
        if(especie.nombre.equals("Borbon")) {
            System.out.println("Cruce exitoso");
            System.out.println("Se ha creado un híbrido: Mundo Novo");
            return new MundoNovo();
        }
        System.out.println("No se permite ese cruce :(");
        return especie;
    }
}
