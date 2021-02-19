package 玩转数组习题.数组练习;

/**
 * 查找给定元素下标
 */
public class ArrayFindVal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,5,6};
        System.out.println(find(arr, 10));
    }

    public static int find(int[] arr, int toFind) {
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == toFind){
                return i;
            }
        }
        return -1;//没有找打
    }
}
