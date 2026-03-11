package Sort;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {

        int[] arr = {34, 23, 54, 65, 12};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {

        // i pointer sorted part ko expand karta hai
        for (int i = 0; i < arr.length - 1; i++) {

            // j pointer current element ko left side me shift karta hai
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);

                } else {
                    break; // agar correct position mil gayi to loop break kar do
                }
            }
        }
    }

    // swap function
    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}