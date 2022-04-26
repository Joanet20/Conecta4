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

    public boolean isHasGuanyat() {
        return hasGuanyat;
    }

    public void setHasGuanyat() {
        this.hasGuanyat = true;
    }

    public void colocarFicha(Tablero tablero, Jugador jugador){
        Input input = new Input();
        Output output = new Output();
        Casella[][] casellas = tablero.getCasellas();
        int columnaTriada = input.triarColumna();

        for (int i = 0; i < casellas.length; i++){
            if (i+1 < casellas.length){
                if (!casellas[i][columnaTriada].isOcupada() && casellas[i+1][columnaTriada].isOcupada()){
                    casellas[i][columnaTriada].marcarCasella(jugador);
                }
            }
        }

        output.printTablero(tablero);
        tablero.comprovaAlineament(tablero, jugador);

    }
}
