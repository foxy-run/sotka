public class Main {
    public static void main(String[] args) {
        int score = 375;
        int refill = 2555;
        int total = score + refill;

        if (refill > 1000) {
            int bonus = refill / 100;
            System.out.println(bonus);
            System.out.println(total + bonus);
        } else {
            System.out.println(total);
        }

    }
}
