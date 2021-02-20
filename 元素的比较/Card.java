package 元素的比较;

import java.lang.Comparable;
class Card1 implements Comparable<Card1> {

    public int rank; // 数值
    public String suit; // 花色
    public Card1(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card1 o) {
        if (o == null) {
            return 1;
        }
        return rank - o.rank;
    }

    public static void main(String[] args) {
        Card1 p = new Card1(1, "♠");
        Card1 q = new Card1(2, "♠");
        Card1 o = new Card1(1, "♠");
        System.out.println(p.compareTo(o)); // == 0，表示牌相等
        System.out.println(p.compareTo(q));// < 0，表示 p 比较小
        System.out.println(q.compareTo(p));// > 0，表示 q 比较大
    }

}
