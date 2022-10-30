package Algorithms;

public class operationsWithArray {
    public static void main(String[] args) {
        int[] list = {15, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30};
        System.out.println(findMin(list));
    }
    public static int findMin(int[] array) {
        int minEl = array[0];
        for (int num : array) {
            if (num < minEl)
                minEl = num;
        }
        return minEl;
    }
    public static int returnSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//+=i сумма всех индексов
            System.out.println(i);
            sum += arr[i];
        }
        return sum;
    }
}
