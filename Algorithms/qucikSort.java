package Algorithms;

import java.util.Arrays;

public class qucikSort {
    public static void main(String[] args) {
        int[] list = {15, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30};
        sorting(list, 0, list.length - 1);
        System.out.println(Arrays.toString(list));
    }

        //    // выбирается опорный элемент (от него зависит скорость выполнения, в худшем случае O(n)- если 1-ый элемент в отсортированном массиве,
//    в лучшем O(n*log*n), если это элемент из середины),
//    затем он сравнивается с правым и левым подмассивом
//  слева значения меньше опорного, справа-больше. Если в левом подмассиве элемент бо деление массива на подмассивы, пока в них не останется 1 элемент

    public static void sorting(int[] arr, int less, int greater) {
        if (less<greater) {
            int dividedIndex = partition(arr, less, greater);
            sorting(arr, less, dividedIndex - 1);
            sorting(arr, dividedIndex, greater);
        }
    }
    public static int partition(int [] arr, int less,int greater) {
        int leftIndex= less;
        int rightIndex= greater;
        int pivot=arr[less];

        while (leftIndex<=rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    public static void swap(int [] arr,int index1,int index2){
        int tmp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tmp;
    }
}

