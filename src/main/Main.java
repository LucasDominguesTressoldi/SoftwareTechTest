package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[1] Suco | [2] Refrigerante\nQual bebida você deseja? ");

        String response = scanner.nextLine();

        if (response.equals("1")) {
            Order juiceOrder = new Order("Suco");
            juiceOrder.prepareOrder();
        } else if (response.equals("2")) {
            Order sodaOrder = new Order("Refrigerante");
            sodaOrder.prepareOrder();
        } else {
            throw new IllegalArgumentException("Tipo de bebida inválido.");
        }

        System.out.println("-".repeat(26));
        System.out.println("Obrigado!\nVolte Sempre.");
    }
}