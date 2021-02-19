package 玩转数组习题.数组作为方法的返回值;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        /*transform(arr);
        printArray(arr);*/
        int[] output = transform2(arr);
        printArray(output);
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //下面这种情况直接改变了原来的数组，但是我们有时候并不希望破坏原来的数组
    //将数组中的每个元素都 * 2
    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    //这样在方法内部创建一个新数组，并且由于方法返回
    public static int[] transform2(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }
}
