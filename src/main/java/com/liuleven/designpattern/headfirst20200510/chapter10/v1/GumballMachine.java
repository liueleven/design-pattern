package com.liuleven.designpattern.headfirst20200510.chapter10.v1;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-14 13:43
 * @author: 十一
 */
public class GumballMachine {

    // 卖完了
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投入25美分
     */
    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT: System.out.println("you can't insert a quarter, the machine is sold out");break;
            case NO_QUARTER: System.out.println("you inserted a quarter");break;
            case HAS_QUARTER: System.out.println("you can't insert another quarter");break;
            case SOLD: System.out.println("please wait, we're already giving you a gumball");break;
            default:;

        }
    }

    /**
     * 退出25美分
     */
    public void ejectQuarter() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("you can't eject, you haven't inserted a quarter yet");break;
            case NO_QUARTER:
                System.out.println("you haven't inserted a quarter");break;
            case HAS_QUARTER:
                state = NO_QUARTER;
                System.out.println("quarter returned");break;
            case SOLD:
                System.out.println("sorry, you already turned the crank");break;
            default:;

        }
    }

    /**
     * 转动摇杆
     */
    public void turCrak() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("you turned, but there are no gumballs");break;
            case NO_QUARTER:
                System.out.println("you turned but there's no quarter");break;
            case HAS_QUARTER:
                state = SOLD;
                dispense();
                System.out.println("you turned...");break;
            case SOLD:
                System.out.println("turninng twice does't get you another gumball");break;
            default:;

        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        switch (state) {
            case SOLD_OUT:
                System.out.println("no gumball dispensed");break;
            case NO_QUARTER:
                System.out.println("you need to pay first");break;
            case HAS_QUARTER:
                System.out.println("no gumball dispensed");break;
            case SOLD:
                count = count -1;
                System.out.println("a gumball comes rolling out the slot");
                if (count == 0) {
                    state = SOLD_OUT;
                    System.out.println("oops, out oof gumballs");
                }else {
                    state = NO_QUARTER;
                }
                break;
            default:;

        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
























