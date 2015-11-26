package com.pingan.demo;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	
	String name ;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println(req.getSession().getId());
		// 1.0 start async
	    final AsyncContext ctx = req.startAsync();
	    name = ctx.getRequest().getParameter("name");
		System.out.println("welcome "+name+" login");

	     // 2.0 set the timeout
	    ctx.setTimeout(0);  
	     // 3.0 run a thread
	    ctx.start(new Runnable() {
	    	  
	           public void run() {
	            	
	              try {   
	                  // 模拟长时间的处理   
	            	  Thread.sleep(4000);   
	                  ctx.getResponse().getWriter().write("hello "+ctx.getRequest().getParameter("name"));
	                  
	                  // 这边才真正送出回应   
	            	   ctx.complete();   
	                } catch (Exception e) {   
	            	  e.printStackTrace();   
	                } 
	                 
	            }
	  
	       });
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
