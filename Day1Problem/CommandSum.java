package Day1Problem;

public class CommandSum {
        public static void main(String[] args) {
            int sum = 0;
            int invalidCount = 0;
            for (int i = 0; i < args.length; i++) {
                try {
                    int number = Integer.parseInt(args[i]);
                    sum += number;
                } catch (NumberFormatException e) {
                    invalidCount++;
                }
            }
            System.out.println("Sum of valid integers: " + sum);
            System.out.println("Count of invalid integers: " + invalidCount);
        }
    }

