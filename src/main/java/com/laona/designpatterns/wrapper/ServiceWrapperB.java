package com.laona.designpatterns.wrapper;

/**
 * @description service 包装类B
 */
public class ServiceWrapperB extends Wrapper{


    public ServiceWrapperB(Service service) {
        super(service);
    }

    @Override
    public void doSomething(){
        super.doSomething();
        System.out.println("增强功能B");
    }
}
