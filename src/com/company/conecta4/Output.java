package com.company.conecta4;

public class Output {

    public void demanarColumna(){
        System.out.println("Tria una columna (0-7)");
    }

    public void printTablero(Tablero tablero){
        for (int i = 0; i < tablero.getCasellas().length; i++){
            for (int j = 0; j < tablero.getCasellas()[1].length; j++){

                if (j < tablero.getCasellas()[1].length - 1){
                    if (tablero.getCasellas()[i][j].isOcupada()){
                        System.out.print("[" + tablero.getCasellas()[i][j].getIdJugador() + "]");
                    } else {
                        System.out.print("[" + "N" + "]");
                    }
                } else if (j >= tablero.getCasellas()[1].length - 1){
                    if (tablero.getCasellas()[i][j].isOcupada()){
                        System.out.println("[" + tablero.getCasellas()[i][j].getIdJugador() + "]");
                    } else {
                        System.out.println("[" + "N" + "]");
                    }
                }


            }
        }
    }

    public void indicaTorn(Jugador jugador){
        System.out.println();
        System.out.println("Es el torn del jugador " + jugador.getId());
    }
}
