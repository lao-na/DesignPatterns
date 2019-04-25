package com.laona.designpatterns.wrapper;

/**
 * @description 装饰者角色
 */
public abstract class Wrapper implements Service{

    private Service service;
    public Wrapper(Service service){
        this.service = service;
    }

    @Override
    public void doSomething() {
        service.doSomething();
    }
}
