package 构造堆;

/**
 * 构造大小根堆（俩种方式，向上调整，向下调整）
 * 建堆时间是O(n),推到出来的出来的
 * 1.向上调整：从孩子开始(childIndex)
 *
 * 2.向下调整：从双亲节点开始(partentIndex)：
 *             从整棵树看是从上到下，但是单看一棵子树是从上到下
 */


/**
 * 演示构造大根堆
 */
public class TestDemo1 {
    public int[] elem;
    public int size;

    public TestDemo1(){
        this.elem = new int[10];
    }

    //向下调整的方法
    void adjustDownHeap(int parent,int len){
        int child = (parent << 1) + 1;
        //1.开始找俩个孩子中最小的那一个
        while (child < len){
            if (child +1 < len && elem[child] < elem[child+1]){
                child++;//这样找到孩子中的最大值下标
            }

            //2.和双亲进行比较
            if (elem[child] > elem[parent]){
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = parent*2+1;
            }else{
                break;//只要不交换，直接跳出去，因为下面肯定已经是大根堆了
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

        for (int i = (size-1-1)/2;i >= 0;i--){
            adjustDownHeap(i,size);
        }
    }
}
