package 玩转数组习题.数组练习;

import java.util.Arrays;

/**
 * 数组转字符串
 */
public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String res = Arrays.toString(arr);
        System.out.println(res);
        toString(arr);
    }

    //实现自己版本的数组转换字符串
    public static void toString(int[] arr){
        //1.遍历数组进行字符串拼接
        String str = "[";
        for (int i = 0;i < arr.length;i++){
            str += arr[i];
            if (i != arr.length-1){
                str += ", ";
            }
        }
        str += "]";
        System.out.println("自己实现的转换字符串："+str);
    }
}
