package com.wanho.aop.arithmeticcalculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cglib.proxy.Proxy;

/**
 * ��̬����
 * @author Frank
 *
 */
public class ArithmeticCalculatorLoggingProxy  {
	
	//Ҫ����Ķ���
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
		    * proxy: ������� һ�㲻ʹ�øö���
            * method: ���ڱ����õķ���
            * args: ���÷�������Ĳ���
		    */
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			String methodName = method.getName();
			//��ӡ��־
			System.out.println("[before] The method" + methodName + "begins with"+Arrays.asList(args));
			//����Ŀ�귽��
			Object result = method.invoke(target, args);
			return result;
		}
	};
	
	ArithmeticCalculator proxy =(ArithmeticCalculator)Proxy.newProxyInstance(classLoader, interfaces, handler);
	   return proxy;
   }


}
