public class Main {
    public static void main(String[] args) {
        int amountTicket = 100;
        int oneMile = 20;
        boolean isBoughtaTicket = true;

        int miles;
        if (isBoughtaTicket) {
            miles =  amountTicket / oneMile;
        } else {
            miles = 0;
        }

        System.out.println("Начисленные мили за купленный билет: " + miles);
    }
}
