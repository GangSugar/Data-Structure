package 优先级队列;

import java.util.PriorityQueue;

class Card {
    public int rank; // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
public class TestDemo1 {
    public static void TestPriorityQueue() {
        PriorityQueue<Card> p = new PriorityQueue<>();
        p.offer(new Card(1, "♠"));
        p.offer(new Card(2, "♠"));
    }
    public static void main(String[] args) {

       /* PriorityQueue<Integer> p = new PriorityQueue<Integer>((o1,o2) -> {
           return o1-o2;
        });*/
        TestPriorityQueue();
    }
}
