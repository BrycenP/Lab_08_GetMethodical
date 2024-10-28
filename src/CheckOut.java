import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        boolean cont;
        double totalCost = 0;

        do {
            itemCost = SafeInput.getRangedDouble(in, "Enter your Item price here $0.50 - $10", 0.5, 10);
            totalCost = itemCost + totalCost;
            cont = SafeInput.getYNConfirm(in,"Would you like to enter another item? (Y for yes and N for no)");
        }while (cont);
        System.out.print("Your total cost is");
        System.out.printf("'%5.2f'%n", +totalCost);
    }
}