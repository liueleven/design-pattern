package com.liuleven.designpattern.headfirst.iterator.v1;

import java.lang.management.MemoryUsage;
import java.nio.channels.MulticastChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-14 21:11
 * @author: 十一
 */
public class PancakeHouseMenu {

    private List<String> menuList;

    public PancakeHouseMenu() {
        menuList = new ArrayList<String>();
    }

    public void addItem(String name) {
        menuList.add(name);
    }

    public List getMenu() {
        return menuList;
    }
}
