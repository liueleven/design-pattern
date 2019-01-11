package com.liuleven.designpattern.headfirst.decorate.lower;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @description: jdk中的InputStream就用到了大量的装饰者模式
 * 这里仿照stream，新增一个装饰者 LowerCaseInputStream 转换成小写字母
 * @date: 2019-01-10 17:40
 * @author: 十一
 */
public class LowerTest {

    public static void main(String[] args) throws Exception {
        // 这里用到了装饰者模式
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("/temp/test.txt")
                )
        );
        int c = -1;
        while ((c = in.read()) >= 0) {
            System.out.print((char) c);
        }
    }
}
