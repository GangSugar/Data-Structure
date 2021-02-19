package 玩转数组习题.数组作为方法的参数;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        printArray(arr);
    }
    //1.专门打印数组的方法
    /**
     * 所谓的 "引用" 本质上只是存了一个地址. Java 将数组设定成引用类型, 这样的话后续进行数组参数传参, 其实
     * 只是将数组的地址传入到函数形参中. 这样可以避免对整个数组的拷贝(数组可能比较长, 那么拷贝开销就会很大)
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int x : arr){
            System.out.println(x);
        }
    }
}
