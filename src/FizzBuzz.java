/**
 * Solve the FizzBuzz challenge.
 */

class FizzBuzz {

    public static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {
            System.out.println("Fizz");

        } else if (divisibleBy5) {
            System.out.println("Buzz");

        } else {
            System.out.println(i);
        }
    }
    private static String condition = "WHILE";
    public static void main(String[] args) {
        if (condition.equals("IF")) {
            for (int i = 1; i < 100; i++) {
                // Find out which numbers divide i.
                doFizzBuzz(i);
            }
        }

        else if (condition.equals("WHILE")) {
            var i = 1;
            while (i < 100) {
                // Find out which numbers divide i.
                doFizzBuzz(i);
                i += 1;
            }
        }
    }
}