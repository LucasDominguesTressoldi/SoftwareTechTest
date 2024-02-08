import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[1] Suco | [2] Refrigerante\nQual bebida você deseja? ");
        if (scanner.nextLine().equals("1")) {
            Order juiceOrder = new Order("Suco");
            juiceOrder.prepareOrder();
        } else {
            Order sodaOrder = new Order("Refrigerante");
            sodaOrder.prepareOrder();
        }
        System.out.println("-".repeat(26));
        System.out.println("Obrigado!\nVolte Sempre.");
    }
}