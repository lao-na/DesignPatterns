package com.laona.designpatterns.composite;

/**
 * 叶子节点
 */
public class Leaf implements Component {

    private String leafName;

    public Leaf(String leafName) {
        this.leafName = leafName;
    }

    public void doSomething() {
        System.out.println(leafName);
    }
}
