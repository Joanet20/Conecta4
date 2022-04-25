package com.company.conecta4;

public class Casella {

    private boolean ocupada;
    private int idJugador;
    private int casellaX;
    private int casellaY;

    public Casella (int casellaX, int casellaY){
        this.ocupada = false;
        this.casellaX = casellaX;
        this.casellaY = casellaY;
    }

    public boolean isOcupada(){
        return ocupada;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void marcarCasella (Jugador jugador){
        this.ocupada = true;
        this.idJugador = jugador.getId();
    }
}
