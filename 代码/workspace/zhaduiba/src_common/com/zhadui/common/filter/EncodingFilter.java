package com.zhadui.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	private String encofig=null;
	
	public EncodingFilter() {
		super();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		encofig=null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(encofig!=null){
			request.setCharacterEncoding(encofig);//���ñ������ 
			response.setCharacterEncoding(encofig);//���ñ������
			chain.doFilter(request, response); 
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		encofig = filterConfig.getInitParameter("encofig");//��web.xml�ļ��л�����õ����ԣ���web.xml�ļ��б������ã�
		System.out.println("-----=====-----====-----====-----===="+encofig);
	}

	
}
