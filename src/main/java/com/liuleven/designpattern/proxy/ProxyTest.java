package com.liuleven.designpattern.proxy;

import com.liuleven.designpattern.proxy.factory.JDKProxyFactory;
import com.liuleven.designpattern.proxy.target.UserService;
import com.liuleven.designpattern.proxy.target.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-03 19:53
 * @author: 十一
 */
public class ProxyTest {

    @Test
    public void testJDKProxy() {

        // 1、创建目标对象
        UserService service = new UserServiceImpl();
        // 2、生成代理对象
        JDKProxyFactory proxyFactory = new JDKProxyFactory();
        // 得到代理对象
        UserService proxy = (UserService) proxyFactory.getProxy(service);
        int id = 100;

        // 3、调用目标对象的方法
//        service.delUser(id);
        System.out.println("===============");
        // 4、调用代理对象的方法
        proxy.delUser(id);


    }
}
