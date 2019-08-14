package com.liuleven.designpattern.headfirst.iterator.v2;

import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-14 21:37
 * @author: 十一
 */
public class DinerHouseIterator implements Iterator{

    String[] items;
    int pos;

    public DinerHouseIterator(String[] items) {
        this.items = items;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos >= items.length) {
            return false;
        }
        if (items[pos] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        boolean hasNext = hasNext();
        if (!hasNext) {
            throw new RuntimeException("not item!");
        }
        return items[pos++];
    }
}
