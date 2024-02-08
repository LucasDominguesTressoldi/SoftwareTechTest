package main;

import java.util.Scanner;

public class Size {
    public static String chooseSize(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        if (drinkType.equals("Suco")) {
            System.out.print("300ml ou 500ml? ");
            String response = scanner.nextLine();
            if (response.equals("300") || response.equals("500")) {
                return response;
            } else {
                throw new RuntimeException("Entrada inválida.");
            }
        } else {
            System.out.print("300ml, 500ml ou 700ml? ");
            String response = scanner.nextLine();
            if (response.equals("300") || response.equals("500") || response.equals("700")) {
                return response;
            } else {
                throw new RuntimeException("Entrada inválida.");
            }
        }
    }
}
