import java.util.Scanner;

public class arrayexecise1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search:");
        int x = sc.nextInt();
        sc.close();

        int index = -1;
        index = linearsearch(arr, index, x);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("-1");
        }
    }

    public static int linearsearch(int[] array, int ind, int num) {
        for (int i = 0; i < 10; i++) {
            if (array[i] == num) {
                ind = i;
                break;
            }
        }
        return ind;
    }
}
