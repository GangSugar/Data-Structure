package 树的表示形式;

/*
孩子兄弟表示法
 */
public class NodeTest {
    int value;//树中存储的数据
    NodeTest firstChild;//第一个孩子的引用
    NodeTest nextBrother;//下一个兄弟的引用
}

/**
 * 孩子表示法
 */
class Node1{
    int value;
    Node1 left;
    Node1 right;
}

/**
 * 孩子双亲表示法
 */
class Node2{
    int value;
    Node1 left;
    Node1 right;
    Node2 partent;
}
