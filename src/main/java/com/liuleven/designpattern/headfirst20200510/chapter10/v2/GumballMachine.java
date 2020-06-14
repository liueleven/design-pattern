package com.liuleven.designpattern.headfirst20200510.chapter10.v2;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-14 15:19
 * @author: 十一
 */
public class GumballMachine {

    State hasQuarterState;
    State noQuarterState;
    State soldOutState;
    State soldState;


    State state = soldOutState;

    int count = 0;

    public GumballMachine(int count) {
        this.count = count;

        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        if (count > 0) {
            state = noQuarterState;
        }
    }


    /**
     * 投入25美分
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退出25美分
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 转动摇杆
     */
    public void turCrak() {
        state.turnCrank();
    }

    public void releaseBall() {
        if (count != 0) {
            count = count - 1;
        }
    }
}
