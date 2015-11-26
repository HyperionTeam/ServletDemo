package com.pingan.demo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class LoginFilter implements Filter {

    public LoginFilter() {
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.println("LoginFilter doFilter handle request");

		chain.doFilter(request, response);
		
		System.out.println("LoginFilter doFilter handle response");

	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("LoginFilter init");

	}
	
	public void destroy() {
		System.out.println("LoginFilter destroy");
	}

}
