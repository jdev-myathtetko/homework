import java.util.Scanner;

public class loopexercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int counter = num;
        sc.close();
        int total = 1;
        System.out.print(num + "! : ");
        for (int i = num; i > 0; i--) {
            total *= i;
            System.out.print(i);
            if (counter != 1) {
                System.out.print(" * ");
            }
            counter--;
        }
        System.out.print(" = " + total);
    }
}
