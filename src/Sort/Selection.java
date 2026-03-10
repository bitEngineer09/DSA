package Sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {34, 23, 54, 65, 12};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; // unsorted part ka last index nikaalo
            int maxIndex = getMaxIndex(arr, 0, last); // us unsorted part ka max element ka index find karo
            swap(arr, maxIndex, last); // last position me swap kar do
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
