import java.util.Scanner;

public class Size {
    public String chooseSize(String drinkType) {
        Scanner scanner = new Scanner(System.in);
        if (drinkType.equals("suco")) {
            System.out.print("300ml ou 500ml? ");
        } else {
            System.out.print("300ml, 500ml ou 700ml? ");
        }
        return scanner.nextLine();
    }
}
