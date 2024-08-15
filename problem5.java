import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product type :");
        String type = sc.next();
        System.out.println("Enter price :");
        int price = sc.nextInt();
        if (type.equals("Clothe")) {
            if (price < 20) {
                System.out.println("Profit : 10%");
            } else if (price <= 50) {
                System.out.println("Profit : 15%");
            } else {
                System.out.println("Profit : 20%");
            }
        } else {
            if ((price < 5) || (price > 30)) {
                System.out.println("Profit : 5%");
            } else {
                System.out.println("Profit : 10%");
            }
        }
    }
}
