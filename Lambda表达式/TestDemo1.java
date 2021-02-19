package Lambda表达式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class TestDemo1 {

    public static void main3(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "bit");
        map.put(3, "hello");
        map.put(4, "lambda");
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer+" "+s);
            }
        });

        System.out.println("Lambda表达式=========");
        map.forEach((k,v) -> {
            System.out.println(k+" "+v);
        });
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bit");
        list.add("word");
        list.add("lambda");
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();//按照长度进行升序排序
            }
        });
        System.out.println(list);*/
        list.sort((o1,o2) -> o1.length()-o2.length());
        System.out.println(list);
    }

    public static void main1(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bit");
        list.add("word");
        list.add("lambda");

        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
