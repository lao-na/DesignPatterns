package com.laona.designpatterns.composite;

/**
 * 组合模式 客户端
 */
public class Client {

    public static void main(String[] args) {

        // 文件夹B 包含 文件夹A和文件C
        // 文件夹A 包含 文件B和文件C

        // 文件A
        Component leafA = new Leaf("leafA");
        // 文件B
        Component leafB = new Leaf("leafB");

        // 文件夹A
        Component compositeA = new Composite();
        compositeA.add(leafA);
        compositeA.add(leafB);

        // 文件C
        Component leafC = new Leaf("leafC");

        // 文件夹B
        Component compositeB = new Composite();
        compositeB.add(compositeA);
        compositeB.add(leafC);

        compositeB.doSomething();

    }
}
