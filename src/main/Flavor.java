package main;

import java.util.Scanner;

public class Flavor {
    public static String chooseFlavor(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        if (drinkType.equals("Suco")) {
            System.out.print("Uva ou Laranja? ");
            String response = scanner.nextLine();
            if (response.equals("Uva") || response.equals("Laranja")) {
                return response;
            } else {
                throw new RuntimeException("Entrada inválida.");
            }
        } else {
            System.out.print("Coca ou Guaraná? ");
            String response = scanner.nextLine();
            if (response.equals("Coca") || response.equals("Guaraná")) {
                return response;
            } else {
                throw new RuntimeException("Entrada inválida.");
            }
        }
    }
}
