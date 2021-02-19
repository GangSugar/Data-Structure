package 玩转数组习题.数组的使用;


public class TestDemo2 {

    /**
     * 遍历数组
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        //2.使用 for-each 遍历数组
        for (int x : arr){
            System.out.println(x);
        }
    }
}
