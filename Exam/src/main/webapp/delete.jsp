<%@page import="com.sou.service.PublicationServiceImpl"%>
<%
   int id=Integer.parseInt(request.getParameter("id"));
   PublicationServiceImpl serv=new PublicationServiceImpl();
   serv.delete(id);
   response.sendRedirect("publication_add_form.jsp");
%>