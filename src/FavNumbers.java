import java.util.Scanner;
public class FavNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int favInt;
            double favDouble;

            favInt = SafeInput.getInt(in,"Enter your favorite integer here");
            favDouble = SafeInput.getDouble(in,"Enter your favorite decimal here");
            System.out.println("Your favorite integer is: " +favInt);
            System.out.println("Your favorite decimal is: " +favDouble);
        }
}
