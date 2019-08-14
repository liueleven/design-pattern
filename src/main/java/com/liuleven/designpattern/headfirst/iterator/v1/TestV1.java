package com.liuleven.designpattern.headfirst.iterator.v1;

import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-14 21:19
 * @author: 十一
 */
public class TestV1 {

    public static void main(String[] args) {
        DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
        dinerHouseMenu.addItem("红烧鱼");
        dinerHouseMenu.addItem("红烧肉");
        dinerHouseMenu.addItem("小龙虾");

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.addItem("白菜");
        pancakeHouseMenu.addItem("萝卜");
        pancakeHouseMenu.addItem("大豆");

        TestV1 testV1 = new TestV1();
        testV1.printDinerHouseMenu(pancakeHouseMenu.getMenu());
        testV1.printPancakeHouseMenu(dinerHouseMenu.getMenu());

    }

    public void printDinerHouseMenu(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void printPancakeHouseMenu(String[] items) {
        for (String item : items) {
            if (item == null) {
                break;
            }
            System.out.println(item);
        }
    }
}
