import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        double weight = sc.nextDouble();
        System.out.println("Enter height in metres:");
        double height = sc.nextDouble();
        sc.close();
        double bmi = weight / (Math.pow(height, 2));
        if (bmi < 18.5) {
            System.out.println("Underweight :" + Math.round(bmi));
        } else if (bmi < 25) {
            System.out.println("Normal :" + Math.round(bmi));
        } else if (bmi < 30) {
            System.out.println("Overweight :" + Math.round(bmi));
        } else {
            System.out.println("Obese :" + Math.round(bmi));
        }
    }
}
