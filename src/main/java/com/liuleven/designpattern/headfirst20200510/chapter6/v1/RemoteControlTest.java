package com.liuleven.designpattern.headfirst20200510.chapter6.v1;

import com.google.errorprone.annotations.Var;

/**
 * @description: 命令模式客户端
 * @date: 2020-06-04 23:42
 * @author: 十一
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        // 调用者，用于发起请求
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 请求接收者
        Light light = new Light();
        // 创建一个命令，将接收者传给它
        LightOnCommand loc = new LightOnCommand(light);
        // 将命令传给调用者
        remote.setSolt(loc);
        // 按下按钮
        remote.buttonWasPressed();
    }



}
