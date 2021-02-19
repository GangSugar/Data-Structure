package 玩转数组习题.数组练习;

/**
 * 寻找数组中的最大元素
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(max(arr));
    }
    //求最大值
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
