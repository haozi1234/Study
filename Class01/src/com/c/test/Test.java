package com.c.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.c.bean.User;

public class Test {

	@org.junit.Test
	public void test() throws Exception {
		
		System.out.println("1��Class��");  
        Class<?> clazz = Class.forName("com.c.bean.User");//����ָ��������Class����  
        System.out.println(clazz);  
        System.out.println(User.class);  
          
        System.out.println("2���������");  
        Field[] fields = clazz.getDeclaredFields();//��ȡ���е�����  
        for (Field field : fields) {  
            String modifier = Modifier.toString(field.getModifiers());//���Ե����η�  
            String type = field.getType().getSimpleName();//���Ե����͵�����  
            String name = field.getName();//���Ե�����  
            System.out.println(modifier + " " + type + " " + name);  
        }  
          
        System.out.println("3����Ĺ��췽��");  
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();//��ȡ���еĹ��췽��  
        for (Constructor<?> constructor : constructors) {  
            StringBuffer sb = new StringBuffer();  
            String modifier = Modifier.toString(constructor.getModifiers());//���췽�������η�  
            String name = constructor.getName();//���췽��������  
            sb.append(modifier + " " + name + "(");  
            Class<?>[] parameters = constructor.getParameterTypes();//��ȡ���췽�������в���������  
            for (int i = 0; i < parameters.length; ++i) {  
                String parameterName = parameters[i].getName();  
                sb.append(parameterName);  
                if (i != parameters.length - 1) {  
                    sb.append(", ");  
                }  
            }  
            sb.append(")");  
            System.out.println(sb);  
        }  
          
        System.out.println("4����ķ���");  
        Method[] methods = clazz.getDeclaredMethods();//��ȡ���е���ķ���  
        for (Method method : methods) {  
            StringBuffer sb = new StringBuffer();  
            String modifier = Modifier.toString(method.getModifiers());//��ķ��������η�  
            String name = method.getName();//��ķ���������  
            sb.append(modifier + " " + name + "(");  
            Class<?>[] parameters = method.getParameterTypes();//��ȡ��ķ��������в���������  
            for (int i = 0; i < parameters.length; ++i) {  
                String parameterName = parameters[i].getName();  
                sb.append(parameterName);  
                if (i != parameters.length - 1) {  
                    sb.append(", ");  
                }  
            }  
            sb.append(")");  
            System.out.println(sb);  
        }  
	}
}
