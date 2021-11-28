public class Main {
    public static void main(String[] args) {
        int amountticket = 100;
        int onemile = 20;
        boolean isboughtaticket = true;

        int mile;
        if (isboughtaticket) {
            mile = 1;
        } else {
            mile = 0;
        }

        int bonus = amountticket / onemile * mile;

        System.out.println("Начисленные мили за купленный билет: " + bonus);
    }
}
