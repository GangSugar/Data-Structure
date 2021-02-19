package 玩转数组习题.数组练习;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//Java中内置的高效排序算法
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0;j < arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
