package com.s.test;

import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {
		
		Scanner reader = new Scanner(System.in);
		/**
		 * ִ��nextLine�ȷ���ʱ��������ȴ��û������������������ݻس�ȷ��
		 */
		String str = reader.nextLine();
		System.out.println(str);
		while (reader.hasNextInt()) {
			int i = reader.nextInt();
			System.out.println(i);
		}
		/**
		 * ���룺12.34���س���
		 * ��ôreader�������hasNextDouble���ص�ֵ��true��������hasNextInt���ص�ֵ��false
		 */
		while (reader.hasNextDouble()) {
			double i = reader.nextDouble();
			System.out.println(i);
		}
	}
}
