package class5;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }

        /* Limitations:
        - we can only use byte, short. int, char, String for variable 'day'
        - we can;t use relational operators in case statements
         */


        String days = "Friday";
        switch (days) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            default:
                System.out.println("Wrong day");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Gender  m f");
        char gender = scanner.next().charAt(0);
        switch (gender) {
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("Not specified");
        }


    }
}
