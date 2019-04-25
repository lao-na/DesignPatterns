package com.laona.designpatterns.wrapper;

/**
 * @description service包装类A
 */
public class ServiceWrapperA extends Wrapper {
    public ServiceWrapperA(Service service) {
        super(service);
    }

    @Override
    public void doSomething(){
        super.doSomething();
        System.out.println("增强功能A");
    }
}
