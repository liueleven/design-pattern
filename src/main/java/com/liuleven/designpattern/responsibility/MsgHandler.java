package com.liuleven.designpattern.responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2020-01-15 17:44
 * @author: 十一
 */
public class MsgHandler {

    private List<Process> list = new ArrayList<>(16);

    public MsgHandler addProcess(Process process) {

        list.add(process);
        return this;

    }

    public void handle() {
        for (Process process : list) {
            process.doProcess();
        }
    }
}
