package com.company;

public class Arreglo{
    int n;
    int m;

    public Arreglo(int n, int m){
        this.n=n;
        this.m=m;
    }

    public void Mostrar(){
        int i;
        int j;
        String num [][]= new String[n][m];

        num[0][1]="pipeta            ";
        num[0][2]="gotero            ";
        num[0][3]="placa de petri    ";

        num[1][1]="Bala de plastico  ";
        num[1][2]="Pistola de genes  ";
        num[1][3]="Placa de retencion";

        num[2][1]="Agrobacter        ";
        num[2][2]="placa de petri    ";
        num[2][3]="jeringa           ";
        
        System.out.printf("\n\n");
        System.out.printf("Materiales de experimentos:\n\n");

        for(i=0;i<this.n;i++){
            for(j=0;j<this.m;j++){
                if(j==0){
                    System.out.printf("%d\t\t",i+1);
                }else{
                    System.out.printf("%s\t\t",num[i][j]);
                }               
            }
                System.out.printf("\n\n");
        }
        

    }

    
}

