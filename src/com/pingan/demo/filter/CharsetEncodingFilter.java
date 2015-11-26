package com.pingan.demo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class CharsetEncodingFilter implements Filter {


    public CharsetEncodingFilter() {
    }
	public void destroy() {
		System.out.println("CharsetEncodingFilter destroy");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("CharsetEncodingFilter doFilter handle request");
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
		
		System.out.println("CharsetEncodingFilter doFilter handle response");

	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("CharsetEncodingFilter init");
	}

}
