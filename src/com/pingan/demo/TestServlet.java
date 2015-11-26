package com.pingan.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServlet implements Servlet {

	public void service(ServletRequest paramServletRequest, ServletResponse paramServletResponse)
			throws ServletException, IOException {
		System.out.println("TestServlet do sercive");
		//打印当前线程名称
		System.out.println("TreadName:"+Thread.currentThread().getName());
		//打印当前Servlet实例
		System.out.println("TestServlet Instance:"+this);
		//通过request对象获取客户端传入参数
		String name = paramServletRequest.getParameter("name");
		//通过response获取writer对象向客户端输出信息
		PrintWriter writer =  paramServletResponse.getWriter();
		writer.write("welcome "+name+" vist TestServlet");

	}
	public void init(ServletConfig paramServletConfig) throws ServletException {
		System.out.println("TestServlet init");
	}
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("TestServlet destroy");


	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}



}
