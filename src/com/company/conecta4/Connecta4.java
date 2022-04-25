package com.company.conecta4;

public class Connecta4 {

    public void jugar (){

        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Tablero tablero = new Tablero();

        int inici = (int) Math.floor(Math.random()*2);

        while (!j1.isHasGuanyat() && !j2.isHasGuanyat()){

            if (inici == 0){
                j1.colocarFicha(tablero, j1);
                inici = 1;
            } else if (inici == 1){
                j2.colocarFicha(tablero, j2);
                inici = 0;
            }
        }

    }
}
