package Day1Problem;

import java.util.Scanner;


public class LeapYear {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            if (year < 1582) {
                System.out.println("Invalid year. Please enter a year greater than or equal to 1582.");
            } else {

                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

                if (isLeapYear) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }

            scanner.close();
        }
    }



