package Sort;

import java.util.Arrays;

// when given number from range 1, N => use cyclic sort
// matlab ki suppose N = 5 diya hai, yaha tak ke number ko sort karo
// then 1 - 5 tak ke numbers ko sort karege,
// Means ki Cyclic Sort use karo
public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // current value ka correct index
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
