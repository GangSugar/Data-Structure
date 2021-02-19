package 枚举;

public class TestEnum {
    public enum Test{
        RED,COUNT,WHITE;
    }

    public static void main(String[] args) {
        for (Enum i : Test.values()){
            System.out.println(i);
        }
        System.out.println(Test.RED);
        System.out.println(Test.RED.ordinal());

        System.out.println(Test.RED.compareTo(Test.COUNT));
        System.out.println(Test.valueOf("RED"));
    }
}
