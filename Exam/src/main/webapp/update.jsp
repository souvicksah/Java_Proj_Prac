<%@page import="com.sou.model.Publication"%>
<%@page import="com.sou.service.PublicationServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
   int id=Integer.parseInt(request.getParameter("id"));
   PublicationServiceImpl serv=new PublicationServiceImpl();
   Publication p=serv.selectById(id);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
<form action="update_check.jsp" method="post">
   <h1>Update Publication</h1>
   <div style="margin-bottom: 15px;">
      <label>Publication ID</label>
      <input type="text" name="id" value="<%= p.getId()%>" required>
   </div>
   <div style="margin-bottom: 15px;">
      <label>Publication title</label>
      <input type="text" name="ptitle" value="<%= p.getPtitle()%>" required>
   </div>
   <div style="margin-bottom: 15px;">
      <label>Publication Type</label>
      <select name="ptype" required>
          <option value="">Choose Option</option>
          <option value="gaming">Gaming</option>
          <option value="science">Science</option>
          <option value="technology">Technology</option>
          <option value="programming">Programming</option>
          <option value="sex">Sex</option>
          <option value="other">others</option>
      </select>
   </div>
   <div style="margin-bottom: 15px;">
      <label>Publication Content</label>
      <input type="text" name="content" value="<%= p.getContent()%>" required>
   </div>
   <button type="submit">Update</button>
</form>
</div>
</body>
</html>