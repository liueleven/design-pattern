package com.liuleven.designpattern.headfirst.iterator.v2;



/**
 * @description: 一定要写注释啊
 * @date: 2019-08-14 21:19
 * @author: 十一
 */
public class TestV2 {

    public static void main(String[] args) {
        DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
        dinerHouseMenu.addItem("红烧鱼");
        dinerHouseMenu.addItem("红烧肉");
        dinerHouseMenu.addItem("小龙虾");

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.addItem("白菜");
        pancakeHouseMenu.addItem("萝卜");
        pancakeHouseMenu.addItem("大豆");

        TestV2 testV2 = new TestV2();
        testV2.print(dinerHouseMenu.getItems());
        testV2.print(pancakeHouseMenu.getItems());

    }

    public void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
