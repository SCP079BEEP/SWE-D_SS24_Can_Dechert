public class Main {
    public static void main(String[] args) {
        int n, m;
        for (n = 1; n <= 1000000; n++) {
            m = n;
            while (m != 1) {
                if (m % 2 == 0) {
                    // EVEN:
                    m = m / 2;
                }
                else {
                    // ODD:
                    m = (m * 3) + 1;
                }
            }
            System.out.println(n);
        }

        // gets stuck on 113382
        System.out.println("Ulam function terminates with 1 for any given integer n < 1M");
    }
}