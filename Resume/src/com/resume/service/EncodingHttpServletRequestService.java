package com.resume.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingHttpServletRequestService extends HttpServletRequestWrapper {

	private HttpServletRequest request;
	private String encoding;

	public EncodingHttpServletRequestService(HttpServletRequest request, String encoding) {
		
		super(request);
		this.request = request;
		this.encoding = encoding;
	}
	
	public String getParameter(String name) {
		
		String value = request.getParameter(name);
		if (value != null) {
			try {
				//����ָ���ı��뷵��ĳ�ַ����ڸñ����µ��ֽ�����
				byte[] bytes = value.getBytes("iso-8859-1");
				//ʹ��ָ���ı��������ֽ�����������ַ���
				value = new String(bytes, encoding);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
		}
		return value;
	}
}
