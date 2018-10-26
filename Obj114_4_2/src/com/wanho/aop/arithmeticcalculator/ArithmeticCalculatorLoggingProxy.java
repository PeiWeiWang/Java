package com.wanho.aop.arithmeticcalculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cglib.proxy.Proxy;

/**
 * 动态代理
 * @author Frank
 *
 */
public class ArithmeticCalculatorLoggingProxy  {
	
	//要代理的对象
   private ArithmeticCalculator target;

public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
	super();
	this.target = target;
}
   
   public ArithmeticCalculator getLoggingProxy() {
	   ClassLoader classLoader = target.getClass().getClassLoader();
	   Class[] interfaces = new Class[] {ArithmeticCalculator.class};
	   InvocationHandler handler = new InvocationHandler() {
		   /**
		    * proxy: 代理对象。 一般不使用该对象
            * method: 正在被调用的方法
            * args: 调用方法传入的参数
		    */
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			String methodName = method.getName();
			//打印日志
			System.out.println("[before] The method" + methodName + "begins with"+Arrays.asList(args));
			//调用目标方法
			Object result = method.invoke(target, args);
			return result;
		}
	};
	
	ArithmeticCalculator proxy =(ArithmeticCalculator)Proxy.newProxyInstance(classLoader, interfaces, handler);
	   return proxy;
   }


}
