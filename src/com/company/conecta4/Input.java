package com.company.conecta4;

import java.util.Scanner;

public class Input {

    public int triarColumna(){
        Output output = new Output();
        int columna;
        Scanner scanner = new Scanner(System.in);

        output.demanarColumna();
        columna = scanner.nextInt();

        return columna;
    }
}
