package com.company.buscaminas;

public class Casella {

    private boolean ocupada;
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

    public void marcarCasella (boolean ocupada){
        this.ocupada = true;
    }
}
