package 探究Map中的Key和Value是否为空;

import java.util.*;

public class TestDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Set<Integer> set = new HashSet<>();
        set.add(null);
        System.out.println(set.remove(null));
    }

    public static void main2(String[] args) {
        Map<Object,Object> map = new Hashtable<>();
        /*map.put(null,null);
        System.out.println(map.get(null));*/
        /*map.put(null,3);
        System.out.println(map.get(null));*/
        map.put(3,null);
        System.out.println(map.get(3));
    }

    public static void main1(String[] args) {
        Map<Object,Object> map = new HashMap<>();
        /*map.put(null,null);
        String str = (String)map.get(null);
        System.out.println(str);*/
        map.put(null,3);
        System.out.println(map.get(null));
        //map.put("好",null);
        //System.out.println(map.get("好"));
    }
}
