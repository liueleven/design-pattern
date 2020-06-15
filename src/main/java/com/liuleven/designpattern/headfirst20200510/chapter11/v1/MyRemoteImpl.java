package com.liuleven.designpattern.headfirst20200510.chapter11.v1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @description: 一定要写注释啊
 * @date: 2020-06-15 23:09
 * @author: 十一
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() {
        return "hello";
    }

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
    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) throws Exception{
        MyRemote myRemote = new MyRemoteImpl();
        Naming.bind("RemoteHello",myRemote);
    }
}
