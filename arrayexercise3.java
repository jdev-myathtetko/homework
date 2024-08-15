public class arrayexercise3 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }

        int maxNum = findMax(arr);
        int minNum = findMin(arr);
        int maxIndex = findMaxIndex(arr);
        int minIndex = findMinIndex(arr);

        System.out.println("Maximum number: " + maxNum);
        System.out.println("Minimum number: " + minNum);
        System.out.println("Index of maximum number: " + maxIndex);
        System.out.println("Index of minimum number: " + minIndex);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaxIndex(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
