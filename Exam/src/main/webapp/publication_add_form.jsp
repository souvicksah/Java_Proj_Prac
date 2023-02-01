<%@page import="com.sou.model.Publication"%>
<%@page import="java.util.List"%>
<%@page import="com.sou.service.PublicationServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
   PublicationServiceImpl serv=new PublicationServiceImpl();
   List<Publication> list=serv.select();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Publication</title>
</head>
<body>
<div style="text-align: center;">
<form action="insert.jsp" method="post">
   <h1>Create New Publication</h1>
   <h4 style="color: green;"><%=request.getParameter("msg")!=null?request.getParameter("msg"):"" %></h4>
   <div style="margin-bottom: 15px;">
      <label>Publication ID</label>
      <input type="text" name="id" required>
   </div>
   <div style="margin-bottom: 15px;">
      <label>Publication title</label>
      <input type="text" name="ptitle" required>
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
      <textarea  name="content"></textarea>
   </div>
   <div style="margin-bottom: 15px;">
       <button type="submit">Save</button>
   </div>
   
</form>
</div>
<div style="text-align: center; margin-left: 100px;">
<Table style="border: 1px solid black; width: 70rem">
    <thead>
          <tr>
              <th style="border: 1px solid black;">ID</th>
              <th style="border: 1px solid black;">Title</th>
              <th style="border: 1px solid black;">Type</th>
              <th style="border: 1px solid black;">Content</th>
              <th style="border: 1px solid black;" colspan="2">Options</th>
          </tr>
    </thead>
    <tbody>
         <%for(Publication p:list) {%>
         <tr>
             <td style="border: 1px solid black;"><%=p.getId() %></td>
             <td style="border: 1px solid black;"><%=p.getPtitle() %></td>
             <td style="border: 1px solid black;"><%=p.getPtype() %></td>
             <td style="border: 1px solid black;"><%=p.getContent() %></td>
             <td style="border: 1px solid black;"><a href="delete.jsp?id=<%=p.getId()%>">Delete</a></td>
             <td style="border: 1px solid black;"><a href="update.jsp?id=<%=p.getId()%>">Update</a></td>
         </tr>
         <%} %>
    </tbody>
</Table>
</div>
<div style="margin-top: 100px;margin-left: 35rem;">
  <h1> <a href="publication_add_form.jsp">Adding Category</a></h1>
</div>
</body>
</html>