package com.pingan.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handle HttpGet request");
		//通过request对象获取客户端传入参数
		String name = req.getParameter("name");
		//通过response获取writer对象向客户端输出信息
		PrintWriter writer =  resp.getWriter();
		writer.write("welcome "+name+" vist TestServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("handle HttpPost request");
		//通过request对象获取客户端传入参数
		String name = req.getParameter("name");
		//通过response获取writer对象向客户端输出信息
		PrintWriter writer =  resp.getWriter();
		writer.write("welcome "+name+" vist TestServlet");

	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void destroy() {
	}

}
