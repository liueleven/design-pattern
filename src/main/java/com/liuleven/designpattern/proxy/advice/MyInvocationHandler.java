package com.liuleven.designpattern.proxy.advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: JDK动态代理使用的动态增强的类，它来处理某件事情
 * @date:        2019-09-03
 * @author:      十一
 */
public class MyInvocationHandler implements InvocationHandler {

	// 目标对象的引用
	private Object target;

	// 通过构造方法将目标对象注入到代理对象中
	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 代理对象会执行的方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("<=== 这是jdk的代理方法 ===>");
		if (null != args) {
			for (Object o : args) {
				System.out.println("<=== args: " + o );
			}
		}
		// 下面的代码，是反射中的API用法
		// 该行代码，实际调用的是[目标对象]的方法
		// 利用反射，调用[目标对象]的方法
		Object returnValue = method.invoke(target, args);
		// AopUtils.invokeJoinpointUsingReflection(this.advised, method, args);
		
		// ReflectiveMethodInvocation.proceed()进行递归增强
		
		// 增强的部分
		return returnValue;
	}
}
