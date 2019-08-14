package com.liuleven.designpattern.headfirst.iterator.v2;

import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2019-08-14 21:37
 * @author: 十一
 */
public class PancakeHouseIterator implements Iterator{

    List<String> list;
    int pos;

    public PancakeHouseIterator(List<String> list) {
        this.list = list;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        if (pos >= list.size()) {
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
        return list.get(pos++);
    }
}
