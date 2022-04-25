package com.company.buscaminas;

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

    public void marcarCasella (Jugador jugador){
        this.ocupada = true;
        this.idJugador = jugador.getId();
    }
}
