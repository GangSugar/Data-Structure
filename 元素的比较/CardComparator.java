package 元素的比较;

import java.util.Comparator;

class Card {
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}

/**
 * 这是一个比较器类
 */
public class CardComparator implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.rank - o2.rank;
    }

    public static void main(String[] args) {
        Card p = new Card(1, "♠");
        Card q = new Card(2, "♠");
        Card o = new Card(1, "♠");

        CardComparator cmptor = new CardComparator();
        // 使用比较器对象进行比较
        System.out.println(cmptor.compare(p, o)); // == 0，表示牌相等
        System.out.println(cmptor.compare(p, q)); // < 0，表示 p 比较小
        System.out.println(cmptor.compare(q, p)); // > 0，表示 q 比较大
    }
}

