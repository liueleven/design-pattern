package com.liuleven.designpattern.headfirst.iterator.v1;

import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-14 21:11
 * @author: 十一
 */
public class DinerHouseMenu {

    private String[] menuItems;
    private static final int MAX_ITEMS = 10;
    private int len;
    public DinerHouseMenu() {
        menuItems = new String[MAX_ITEMS];
        len = 0;
    }

    public void addItem(String name) {
        if (len >= MAX_ITEMS) {
            return;
        }
        menuItems[len++] = name;
    }

    public  String[] getMenu() {
        return menuItems;
    }
}
