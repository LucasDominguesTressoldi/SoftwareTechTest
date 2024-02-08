package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[1] Suco | [2] Refrigerante\nQual bebida você deseja? ");

        String response = scanner.nextLine();
        JuiceOrSoda.chooseJuiceOrSoda(response);

        System.out.println("-".repeat(26));
        System.out.println("Obrigado!\nVolte Sempre.");
    }
}