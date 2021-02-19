package 玩转数组习题.数组练习;

/**
 * 用二分查找（二分查找的前提是数组要有序）
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 10));
    }

    public static int binarySearch(int[] arr, int toFind) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + ((end-start) >> 1);
            if (arr[mid] == toFind){
                return mid;
            }else if (arr[mid] > toFind){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;//找不到
    }
}
