package com.company.conecta4;

public class Jugador {

    private int id;
    private boolean hasGuanyat;

    public Jugador (int id){
        this.id = id;
        this.hasGuanyat = false;
    }

    public int getId() {
        return id;
    }

    public void setHasGuanyat() {
        this.hasGuanyat = true;
    }

    public void colocarFicha(Tablero tablero, Jugador jugador){
        Input input = new Input();
        Casella[][] casellas = tablero.getCasellas();
        int columnaTriada = input.triarColumna();

        for (int i = tablero.getCasellas().length; i > 0; i++){
            if (!casellas[i][columnaTriada].isOcupada()){
                casellas[i][columnaTriada].marcarCasella(jugador);
            }
        }

    }
}
