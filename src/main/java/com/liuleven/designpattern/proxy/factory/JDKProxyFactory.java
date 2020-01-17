package com.liuleven.designpattern.proxy.factory;


import com.liuleven.designpattern.proxy.advice.MyInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * 主要作用就是生成代理类 使用JDK的动态代理实现 它是基于接口实现的
 * 
 * @author think
 *
 */
public class JDKProxyFactory {

	/**
	 * @return
	 */
	public Object getProxy(Object target) {

		// Proxy是JDK中的API类
		// 第一个参数：目标对象的类加载器
		// 第二个参数：目标对象的接口
		// 第二个参数：代理对象的执行处理器
		Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader()
				, target.getClass().getInterfaces()
				, new MyInvocationHandler(target));
		return proxy;
	}



}
