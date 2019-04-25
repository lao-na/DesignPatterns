package com.laona.designpatterns.wrapper;

/**
 * @description 具体构件角色
 */
public class ServiceImpl implements Service {
    @Override
    public void doSomething() {
        System.out.println("具体功能");
    }
}
