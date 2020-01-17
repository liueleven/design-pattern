package com.liuleven.designpattern.responsibility;

/**
 * @description: 责任链模式，处理组类似的子元素，元素的增加，减少是对于服务端（处理者）来说是无感知的
 * @date: 2020-01-15 17:29
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        MsgHandler msgHandler = new MsgHandler();
        // 添加一系列类似的元素
        msgHandler.addProcess(new CopyRightProcess())
                .addProcess(new SensitiveWordProcess());
        // 处理
        msgHandler.handle();
    }
}
