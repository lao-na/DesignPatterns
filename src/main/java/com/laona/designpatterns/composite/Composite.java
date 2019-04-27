package com.laona.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 */
public class Composite implements Component {

    /**
     * 持有该接口的容器
     */
    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public List<Component> getAll(Component component) {
        return componentList;
    }

    /**
     * 递归调用
     */
    public void doSomething() {
        componentList.forEach(
                composite -> {
                    composite.doSomething();
                }
        );

    }
}
