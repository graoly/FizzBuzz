public class Reduce {
    public static int helper(int i) {
        if (i % 2 == 0) {
            return i / 2;
        }
        else {
            return i - 1;
        }
    }
    public static int reduce(int n) {
        int steps = 0;
        while (n != 0) {
            n = helper(n);
            steps += 1;
        }
        return steps;
    }
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
}
