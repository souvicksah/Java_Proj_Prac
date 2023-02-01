<%@page import="com.sou.service.PublicationServiceImpl"%>
<jsp:useBean id="publication" class="com.sou.model.Publication"></jsp:useBean>
<jsp:setProperty property="*" name="publication"/>
<%
   PublicationServiceImpl serv=new PublicationServiceImpl();
   serv.update(publication);
   response.sendRedirect("publication_add_form.jsp");
%>