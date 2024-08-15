import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        System.out.println("Enter a 4 digit number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int a = num / 1000;
        int b = (num / 100) - 10 * a;
        int c = (num / 10) - 100 * a - 10 * b;
        int d = num - 1000 * a - 100 * b - 10 * c;
        if ((a == d) && (b == c)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
