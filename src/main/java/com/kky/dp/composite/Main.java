package com.kky.dp.composite;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
    //打印该节点的内容
    abstract public void print();
}

//叶子节点
class LeafNode extends Node {
    //文件名
    String content;
    public LeafNode(String content) {this.content = content;}

    @Override
    public void print() {
        System.out.println(content);
    }
}

//分支节点
class BranchNode extends Node {
    //该文件夹下的列表，包括文件夹和文件
    List<Node> nodes = new ArrayList<>();

    //文件夹名
    String name;
    public BranchNode(String name) {this.name = name;}

    @Override
    public void print() {
        System.out.println(name);
    }

    //添加子节点
    public void add(Node n) {
        nodes.add(n);
    }
}


public class Main {
    public static void main(String[] args) {

        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node r1 = new LeafNode("r1");
        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        root.add(r1);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root, 0);

    }

    //遍历node下的所有内容，depth为该节点的高度
    static void tree(Node node, int depth) {
        //为了美观，打印"-"为文件分级
        for(int i=0; i<depth; i++) {
            System.out.print("-");
        }
        //打印节点
        node.print();

        //遍历节点下的子节点
        if(node instanceof BranchNode) {
            for (Node n : ((BranchNode)node).nodes) {
                tree(n, depth + 1);
            }
        }
    }
}
