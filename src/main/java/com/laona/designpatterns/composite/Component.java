package com.laona.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象构件接口
 */
public interface Component {

    //定义default方法
    default void add(Component component){
        System.out.println(component.getClass());
    }
    default void remove(Component component){
        System.out.println(component.getClass());
    }
    default List<Component> getAll(Component component){
        System.out.println(component.getClass());
        return new ArrayList<>();
    }

    default void doSomething(){}


}
