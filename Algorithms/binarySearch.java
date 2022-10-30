package Algorithms;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] s = {23, 42, 4, 29, 11, 44, 6};
        Arrays.sort(s);
        System.out.println(binarySearch(s, 6));
    }
    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i])
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int med = (lastIndex + firstIndex) / 2;
            if (arr[med] == key)
                return med;
            else if (arr[med] <= key)// если ключ больше середины, то отбрасываем 1-ую часть массива
                firstIndex = med + 1;
            else if (arr[med] >= key)// если ключ меньше середиы, то отбрасыаем 2-ую часть
                lastIndex = med - 1;
        }
        return -1;
    }
}



