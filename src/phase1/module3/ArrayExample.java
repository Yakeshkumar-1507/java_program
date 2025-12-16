package phase1.module3;

import java.util.Arrays;

public class ArrayExample {

    static int sumOfArrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static double findAverage(int[] arr) {
        int sum = sumOfArrays(arr);
        return (double) sum / arr.length;
    }


    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};
        System.out.println(sumOfArrays(arr));
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        System.out.println(findAverage(arr));

    }
}
