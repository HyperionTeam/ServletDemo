<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ page import="java.util.*" %>
 
<html><head><title>Cluster App Test</title></head>
 
<body>
 
Server Info:
 
<%
out.println(request.getLocalAddr() + " : " + request.getLocalPort()+"<br>");%>
 
<%
  out.println("<br> ID " + session.getId()+"<br>");
%>
 


</body>
 
</html>