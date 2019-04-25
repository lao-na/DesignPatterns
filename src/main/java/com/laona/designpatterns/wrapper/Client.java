package com.laona.designpatterns.wrapper;

/**
 * @description 客户端
 */
public class Client {

    public static void main(String[] args) {

        // 没有任何包装的调用
        Service service = new ServiceImpl();
        service.doSomething();
        System.out.println("-------------");

        // 对doSomething进行动态增加功能A
        Service serviceWrapperA = new ServiceWrapperA(new ServiceImpl());
        serviceWrapperA.doSomething();
        System.out.println("-------------");

        // 对doSomething进行动态增加功能A 再增加功能B
        Service serviceWrapperB = new ServiceWrapperB(new ServiceWrapperA(new ServiceImpl()));
        serviceWrapperB.doSomething();
        System.out.println();


    }
}
