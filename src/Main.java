import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double account_balance = 2000000000;

        System.out.println("Введите сумму перевода:");
        Scanner scanner = new Scanner(System.in);
        double transfer_from = (double) scanner.nextDouble();

        System.out.println("Сумма перевода: " + transfer_from);

        double current_balance = account_balance - transfer_from;

        System.out.println("Остаток средств на счете составлет: " + current_balance);
    }
}