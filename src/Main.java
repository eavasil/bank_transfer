import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int account_balance = 2000000000;
        while (account_balance<0) {
            System.out.println("Введите сумму перевода:");
            Scanner scanner = new Scanner(System.in);
            int transfer_from = (int) scanner.nextDouble();
            System.out.println("Сумма перевода составляет : " + transfer_from);
            int current_balance = account_balance - transfer_from;
            if (current_balance<0) {
                System.out.println("Недостачно средств на счете. Повторите попытку:");
            }
            else {
                System.out.println("Перевод осуществлен успешно. Остаток средств на счету составляет: " + current_balance);
                int accont_balance = current_balance;
        }
    }
}