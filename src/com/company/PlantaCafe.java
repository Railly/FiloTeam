package com.company;

public abstract class PlantaCafe {
    protected String familia;
    protected String nombre;
    protected String porte;
    protected String productividad;
    protected String colorBrote;
    protected String maduracion;
    protected String tamanioGrano;
    protected int altura;
    protected boolean esResistente;
    protected boolean produccionBienal;

    public PlantaCafe(String porte, String productividad, String colorBrote, String maduracion,
                      String tamanioGrano, int altura, boolean esResistente, boolean produccionBienal) {
        this.porte = porte;
        this.productividad = productividad;
        this.colorBrote = colorBrote;
        this.maduracion = maduracion;
        this.tamanioGrano = tamanioGrano;
        this.altura = altura;
        this.esResistente = esResistente;
        this.produccionBienal = produccionBienal;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getProductividad() {
        return productividad;
    }

    public void setProductividad(String productividad) {
        this.productividad = productividad;
    }

    public String getColorBrote() {
        return colorBrote;
    }

    public void setColorBrote(String colorBrote) {
        this.colorBrote = colorBrote;
    }

    public String getMaduracion() {
        return maduracion;
    }

    public void setMaduracion(String maduracion) {
        this.maduracion = maduracion;
    }

    public String getTamanioGrano() {
        return tamanioGrano;
    }

    public void setTamanioGrano(String tamanioGrano) {
        this.tamanioGrano = tamanioGrano;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isEsResistente() {
        return esResistente;
    }

    public void setEsResistente(boolean esResistente) {
        this.esResistente = esResistente;
    }

    public boolean isProduccionBienal() {
        return produccionBienal;
    }

    public void setProduccionBienal(boolean produccionBienal) {
        this.produccionBienal = produccionBienal;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBienalidad() {
        if(produccionBienal) {
            return "tiene comportamiento bienal";
        } else {
            return "no tiene comportamiento bienal";
        }
    }

    public String getResistencia() {
        if(esResistente) {
            return "Afortundamente, ha desarrollado una resistencia a la plaga de la roya.";
        } else {
            return "Sin embargo, no posee resistencia a la plaga de la roya.";

        }
    }

    public String getInfo() {
        return "\n" + getNombre() +" es una variedad de café de la familia " + getFamilia() + ". Esta posee una productividad " +
                getProductividad() + ",\n" + "tiene un proceso de maduración " + getMaduracion() +", "+ getBienalidad() + ", tiene una semilla " + getTamanioGrano() + ",\ncrece " +
                "aproximadamente unos " + getAltura() + " metros. " + getResistencia();
    }
}