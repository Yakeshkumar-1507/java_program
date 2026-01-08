package phase5.module4;

public class SwapTheNumber {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // op a=2 b=1;
        //using third variable

//        int temp = a;
//        a = b;
//        b = temp;


        a = a + b; // 1+2 =3
        b = a - b; //3-2 =1
        a = a - b; //3-1 =2

        System.out.println("After swap : " + a + " , " + b);


        int arr[] = {10, 8, 9, 5, 4, 11,13, 2}; // sort the array either in ascending or descending without using

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After swap : ");
        for (int op : arr) {
            System.out.println(op);
        }

        int secondLargest = arr.length - 2;
        System.out.println("Second largest : " + arr[secondLargest]);

    }
}
