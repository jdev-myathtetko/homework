import java.util.Scanner;

public class arrayexercise2 {
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
        index = binarySearch(arr, x);

        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("-1");
        }
    }

    public static int binarySearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == num) {
                return mid;
            } else if (array[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
