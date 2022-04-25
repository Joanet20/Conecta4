package com.company.conecta4;

public class Output {

    public void demanarColumna(){
        System.out.println("Tria una columna (0-6)");
    }

    public void printTablero(Tablero tablero){
        for (int i = 0; i < tablero.getCasellas().length; i++){
            for (int j = 0; j < tablero.getCasellas()[0].length; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
