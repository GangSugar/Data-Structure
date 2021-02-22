package TopK;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TOPK {
    public static void topK(int[] arr,int k){
        //获取前5个最小元素
        PriorityQueue<Integer> p = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0;i < arr.length;i++){
            if (p.size() < k){
                p.offer(arr[i]);
            }else {
                if (arr[i] < p.peek()){
                    p.poll();
                    p.offer(arr[i]);
                }
            }
        }
        System.out.println(p);
    }
    public static void main(String[] args) {
        int[] arr = {12,45,2,7,10,8,19,56,32};
        topK(arr,5);

    }
}
