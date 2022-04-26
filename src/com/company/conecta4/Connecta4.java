package com.company.conecta4;

public class Connecta4 {

    public void jugar (){

        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Tablero tablero = new Tablero();
        tablero.crearCaselles(tablero);
        Output output = new Output();

        int inici = (int) Math.floor(Math.random()*2);
        Jugador guanyador = new Jugador();

        while (!j1.isHasGuanyat() && !j2.isHasGuanyat()){

            if (inici == 0){
                output.indicaTorn(j1);
                j1.colocarFicha(tablero, j1);
                inici = 1;
                guanyador = j1;
            } else if (inici == 1){
                output.indicaTorn(j2);
                j2.colocarFicha(tablero, j2);
                inici = 0;
                guanyador = j2;
            }
        }
        output.youWin(guanyador);
    }
}
