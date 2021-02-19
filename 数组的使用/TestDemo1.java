package 玩转数组习题.数组的使用;

public class TestDemo1 {
    //演示数组下标越界
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        /**返回的错误信息：
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
         * 	at 玩转数组习题.数组的使用.TestDemo1.main(TestDemo1.java:8)
         * 	ArrayIndexOutOfBoundsException：数组下标异常
         */
        System.out.println(arr[3]);
    }

    public static void main1(String[] args) {
        int[] arr = {1,2,3};
        //1.获取数组的长度
        System.out.println(arr.length);

        //2.访问数组中的元素
        System.out.println(arr[1]);//执行结果2
        System.out.println(arr[0]);//执行结果1
        arr[2] = 100;
        System.out.println(arr[2]);//执行结果是100

    }
}
