package com.company.conecta4;

public class Main {

    public static void main(String[] args) {

        Tablero tablero = new Tablero();
        tablero.crearCaselles(tablero);
        Output output = new Output();
        output.printTablero(tablero);
    }
}
