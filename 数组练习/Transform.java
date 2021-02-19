package 玩转数组习题.数组练习;

import java.util.Arrays;



/**
 * 数组数字排列：给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
 */
public class Transform {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            //该循环结束，left就指向了一个奇数
            while (left < right && arr[left] % 2 ==0){
                left++;
            }
            while (left < right && arr[right] % 2 !=0){
                right--;
            }
            //交换俩个元素的位置
            arr[left] = arr[left]+arr[right];
            arr[right] = arr[left]-arr[right];
            arr[left] = arr[left]-arr[right];

        }
    }
}
