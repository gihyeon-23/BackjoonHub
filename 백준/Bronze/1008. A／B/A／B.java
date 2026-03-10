import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        if (A > 0 && B < 10 ) {
            double result = A / B;
                System.out.println(result);
            }

    }
}