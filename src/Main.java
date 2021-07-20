public class Main {
    public static void main(String[] args) {
        int account_balance = 2_000_000_000;
        int transfer_from = 500_000_000;
        int current_balance = account_balance - transfer_from;
        System.out.println(current_balance);
    }
}