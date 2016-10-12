package com.annotation.test;

import java.lang.reflect.Field;

import com.annotation.annotation.FruitColor;
import com.annotation.annotation.FruitName;
import com.annotation.annotation.FruitProvider;
import com.annotation.bean.Fruit;

public class Test {

	@org.junit.Test
	public void test() {
		
		//Class<?>��ʾͨ�䷺�ͣ�?���Դ����κ�����
	    //����Fruit���Class����
	    Class<?> clazz = Fruit.class;
	    //����Class���������е��ֶ�
	    Field[] fields = clazz.getDeclaredFields();
	    for(Field field :fields){
	        //isAnnotationPresent�����ַ���ָ��ע�����͵�ע������ڴ�Ԫ���ϣ��򷵻�true�����򷵻�false
	        if(field.isAnnotationPresent(FruitName.class)){
	            //getAnnotation������ָ�����͵�ע�⣬���������ע�ⲻ���ڣ��򷵻�null
	            FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
	            System.out.println(fruitName.value());
	        }
	        else if(field.isAnnotationPresent(FruitColor.class)){
	          FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
	          System.out.println(fruitColor.fruitColor().toString());
	        }
	        else if(field.isAnnotationPresent(FruitProvider.class)){
	            FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
	            System.out.println(fruitProvider.id()+"��"+fruitProvider.name()+"��"+fruitProvider.address());
	        }
	    }
	}
}
