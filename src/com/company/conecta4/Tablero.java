package com.company.conecta4;

public class Tablero {

    private Casella[][] casellas;

    public Tablero (){
        this.casellas = new Casella[8][7];
    }

    public Casella[][] getCasellas() {
        return casellas;
    }

    public void crearCaselles (Tablero tablero){
        for (int i = 0; i < tablero.getCasellas().length; i++){
            for (int j = 0; j < tablero.getCasellas()[0].length; j++){
                tablero.getCasellas()[i][j] = new Casella(i, j);
            }
        }
    }

}
