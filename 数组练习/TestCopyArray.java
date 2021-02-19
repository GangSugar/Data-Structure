package 玩转数组习题.数组练习;

import java.util.Arrays;

/**
 * 数组拷贝
 */
public class TestCopyArray {
    public static void main(String[] args) {
        /**
         * 由下面的演示copyOf是将数组进行的深拷贝，
         * 深拷贝：就是修改原数组arr的值并不会影响到拷贝数组newArr的值
         */
        int[] arr = {1,2,3,4,5};
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("newArr:"+Arrays.toString(newArr));

        arr[0] = 10;
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("newArr:"+Arrays.toString(newArr));

        //拷贝某一个范围
        int[] newArr1 = Arrays.copyOfRange(arr,1,4);//左闭右开
        System.out.println("newArr1"+Arrays.toString(newArr1));
    }
}
