public class Multiples {
    public static boolean helper(int num) {

        // Print our appropriate result.
        return (num % 3 == 0 || num % 5 == 0);
    }
    public static int multiples_below_n(int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            // Find out which numbers divide i.
            if (helper(i)) {
                total += 1;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(multiples_below_n(1000));
    }
}
