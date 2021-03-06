package com.company.conecta4;

public class Tablero {

    private Casella[][] casellas;

    public Tablero (){
        this.casellas = new Casella[7][8];
    }

    public Casella[][] getCasellas() {
        return casellas;
    }

    public void crearCaselles (Tablero tablero){
        for (int i = 0; i < tablero.getCasellas().length; i++){
            for (int j = 0; j < tablero.getCasellas()[1].length; j++){
                tablero.getCasellas()[i][j] = new Casella(i, j);
            }
        }
    }

    public void comprovaAlineament(Tablero tablero, Jugador jugador){
        for (int i = 0; i < tablero.getCasellas()[1].length; i++){
            for (int j = 0; j < tablero.getCasellas().length; j++){

                comprobaEsquerra(i, j, tablero, jugador);

                comprobarEsquerraAdalt(i, j, tablero, jugador);

                comprobaEsquerraAbaix(i, j, tablero, jugador);

                comprobaAdalt(i, j, tablero, jugador);

                comprobaAbaix(i, j, tablero, jugador);

                comprobaDreta(i, j, tablero, jugador);

                comprobaDretaAdalt(i, j, tablero, jugador);

                comprobaDretaAbaix(i, j, tablero, jugador);
            }
        }
    }

    public void comprobaEsquerra (int i, int j, Tablero tablero, Jugador jugador){
        if (i >= 3){
            if ((tablero.getCasellas()[j][i-1].isOcupada() &&
                    tablero.getCasellas()[j][i-2].isOcupada() &&
                    tablero.getCasellas()[j][i-3].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada()) &&

                    (tablero.getCasellas()[j][i-1].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i-2].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i-3].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobarEsquerraAdalt (int i, int j, Tablero tablero, Jugador jugador){
        if (i >= 3 && j >= 3){
            if (tablero.getCasellas()[j-1][i-1].isOcupada() &&
                    tablero.getCasellas()[j-2][i-2].isOcupada() &&
                    tablero.getCasellas()[j-3][i-3].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j-1][i-1].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j-2][i-2].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j-3][i-3].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobaEsquerraAbaix (int i, int j, Tablero tablero, Jugador jugador){
        if (i >= 3 && (j+3) < tablero.getCasellas().length){
            if (tablero.getCasellas()[j+1][i-1].isOcupada() &&
                    tablero.getCasellas()[j+2][i-2].isOcupada() &&
                    tablero.getCasellas()[j+3][i-3].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j+1][i-1].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j+2][i-2].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j+3][i-3].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobaAdalt (int i, int j, Tablero tablero, Jugador jugador){
        if (j >= 3){
            if (tablero.getCasellas()[j-1][i].isOcupada() &&
                    tablero.getCasellas()[j-2][i].isOcupada() &&
                    tablero.getCasellas()[j-3][i].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j-1][i].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j-2][i].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j-3][i].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobaAbaix (int i, int j, Tablero tablero, Jugador jugador){
        if ((j+3) < tablero.getCasellas().length){
            if (tablero.getCasellas()[j+1][i].isOcupada() &&
                    tablero.getCasellas()[j+2][i].isOcupada() &&
                    tablero.getCasellas()[j+3][i].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j+1][i].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j+2][i].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j+3][i].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobaDreta (int i, int j, Tablero tablero, Jugador jugador){
        if ((i+3) < tablero.getCasellas()[1].length){
            if (tablero.getCasellas()[j][i+1].isOcupada() &&
                    tablero.getCasellas()[j][i+2].isOcupada() &&
                    tablero.getCasellas()[j][i+3].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j][i+1].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i+2].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i+3].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobaDretaAdalt (int i, int j, Tablero tablero, Jugador jugador){
        if ((i+3) < tablero.getCasellas()[1].length && j >= 3){
            if (tablero.getCasellas()[j-1][i+1].isOcupada() &&
                    tablero.getCasellas()[j-2][i+2].isOcupada() &&
                    tablero.getCasellas()[j-3][i+3].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j-1][i+1].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j-2][i+2].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j-3][i+3].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

    public void comprobaDretaAbaix (int i, int j, Tablero tablero, Jugador jugador){
        if ((i+3) < tablero.getCasellas()[1].length && (j+3) < tablero.getCasellas().length){
            if (tablero.getCasellas()[j+1][i+1].isOcupada() &&
                    tablero.getCasellas()[j+2][i+2].isOcupada() &&
                    tablero.getCasellas()[j+3][i+3].isOcupada() &&
                    tablero.getCasellas()[j][i].isOcupada() &&

                    (tablero.getCasellas()[j+1][i+1].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j+1][i+2].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j+1][i+3].getIdJugador() == jugador.getId() &&
                            tablero.getCasellas()[j][i].getIdJugador() == jugador.getId())){
                jugador.setHasGuanyat();
            }
        }
    }

}
