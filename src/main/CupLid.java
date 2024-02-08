package main;

import java.util.Scanner;

public class CupLid {
    public String takeOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[1] Sim | [2] Não\nGostaria de levar para viagem? ");
        int takeOut = scanner.nextInt();

        if (takeOut != 1 && takeOut != 2) {
            throw new IllegalArgumentException("Entrada inválida.");
        }

        if (takeOut == 1) {
            return "Não";
        } else {
            return "Sim";
        }
    }
}
