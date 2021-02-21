package 构造堆;

/**
 * 演示构造大根堆
 */
public class TestDemo2 {
    public int[] elem;
    public int size;

    public TestDemo2(){
        this.elem = new int[10];
    }

    //向上调整的方法（适合插入元素）
    void adjustUpHeap(int child){
        int parent = (child-1)/2;
        while (parent >= 0){
            if (elem[child] > elem[parent]){
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }

        }
    }

    /**
     * 初始化堆
     * @param arr
     */
    public void initHeap(int[] arr){
        for (int i = 0;i < arr.length;i++){
            elem[i] = arr[i];
            size++;
        }
        adjustUpHeap(size-1);
    }
}
