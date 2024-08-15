import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();
        System.out.println("Enter month number :");
        int month = sc.nextInt();
        sc.close();
        if (month == 2) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + "/2 had 29 days.");
                    } else {
                        System.out.println(year + "/2 had 28 days.");
                    }
                } else {
                    System.out.println(year + "/2 had 29 days.");
                }
            } else {
                System.out.println(year + "/2 had 28 days.");
            }
        } else {
            System.out.println(year + "/" + month + " had " + days[month - 1] + " days.");
        }

    }
}
