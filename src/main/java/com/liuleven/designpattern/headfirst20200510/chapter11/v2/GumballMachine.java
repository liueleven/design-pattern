package com.liuleven.designpattern.headfirst20200510.chapter11.v2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:18
 * @author: 十一
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     *
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    protected GumballMachine(int count,String location) throws RemoteException {

    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public State getState() {
        return null;
    }
}
