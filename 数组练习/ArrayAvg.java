package 玩转数组习题.数组练习;

/**
 * 求数组元素的平均值
 */
public class ArrayAvg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(avg(arr));
    }
    public static double avg(int[] arr){
        int sum = 0;
        for (int x : arr){
            sum += x;
        }
        return 1.0*sum/arr.length;
    }
}
