/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-01-05 20:39:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>About us</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link\r\n");
      out.write("  href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"\r\n");
      out.write("  rel=\"stylesheet\"\r\n");
      out.write("/>\r\n");
      out.write("<link\r\n");
      out.write("  href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\r\n");
      out.write("  rel=\"stylesheet\"\r\n");
      out.write("/>\r\n");
      out.write("<link\r\n");
      out.write("  href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.css\"\r\n");
      out.write("  rel=\"stylesheet\"\r\n");
      out.write("/>\r\n");
      out.write("<script\r\n");
      out.write("  type=\"text/javascript\"\r\n");
      out.write("  src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.1/mdb.min.js\"\r\n");
      out.write("></script>\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body\r\n");
      out.write("	style=\"background-image: url('https://thumbs.dreamstime.com/b/caravan-trucks-cargo-transportation-concept-23576201.jpg'); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	<section class=\"py-5\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<!-- FOR DEMO PURPOSE -->\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("					<header class=\"text-center pb-5\">\r\n");
      out.write("						<h1 class=\"h2\">About Us </h1>\r\n");
      out.write("						<br>\r\n");
      out.write("						<p class=\"mb-0 mt-2 font-italic\"\r\n");
      out.write("							style=\"font-size: 18px; font-weight: 500;\"><span class=\"para\"></span> </p>\r\n");
      out.write("					</header>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("\r\n");
      out.write("					<!-- CUSTOM BLOCKQUOTE -->\r\n");
      out.write("					<blockquote\r\n");
      out.write("						class=\"blockquote blockquote-custom bg-white p-5 shadow rounded\">\r\n");
      out.write("						<div class=\"blockquote-custom-icon bg-info shadow-sm\">\r\n");
      out.write("							<i class=\"fa fa-quote-left text-white\"></i>\r\n");
      out.write("						</div>\r\n");
      out.write("						<img\r\n");
      out.write("							src=\"https://bookboon.com/blog/wp-content/uploads/sites/5/2016/04/leadership-models-ebook-bookboon-bl.jpg\"\r\n");
      out.write("							class=\"img-fluid\" alt=\"...\" style=\"height: 250px; width: 100%\"><br>\r\n");
      out.write("						<br>\r\n");
      out.write("						<h3>Our commitment</h3>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"mb-0 mt-2 font-italic\">\"We are a dedicated group of\r\n");
      out.write("							professionals, committed to delivering value for you. You will\r\n");
      out.write("							get what we have promised you. We don't make false promises and\r\n");
      out.write("							don't hide anything from you. When we make the commitment, you\r\n");
      out.write("							will get the delivery no excuses.\"</p>\r\n");
      out.write("\r\n");
      out.write("					</blockquote>\r\n");
      out.write("					<!-- END -->\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("\r\n");
      out.write("					<!-- CUSTOM BLOCKQUOTE -->\r\n");
      out.write("					<blockquote\r\n");
      out.write("						class=\"blockquote blockquote-custom bg-white p-5 shadow rounded\">\r\n");
      out.write("						<div class=\"blockquote-custom-icon bg-info shadow-sm\">\r\n");
      out.write("							<i class=\"fa fa-quote-left text-white\"></i>\r\n");
      out.write("						</div>\r\n");
      out.write("						<img src=\"https://careernursing.org/uploads/vision.jpg\"\r\n");
      out.write("							class=\"img-fluid\" alt=\"...\" style=\"height: 250px; width: 100%\"><br>\r\n");
      out.write("						<br>\r\n");
      out.write("						<h3>Our Vision</h3>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"mb-0 mt-2 font-italic\">\"To stay ahead among our\r\n");
      out.write("							rivals in the transport and logistics industry by providing\r\n");
      out.write("							world-class and innovative moving solutions to our clients. We\r\n");
      out.write("							wish to become the top choice of our customers when they are\r\n");
      out.write("							looking for a reliable, affordable and professional transporter.\"\r\n");
      out.write("						</p>\r\n");
      out.write("\r\n");
      out.write("					</blockquote>\r\n");
      out.write("					<!-- END -->\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("\r\n");
      out.write("					<!-- CUSTOM BLOCKQUOTE -->\r\n");
      out.write("					<blockquote\r\n");
      out.write("						class=\"blockquote blockquote-custom bg-white p-5 shadow rounded\">\r\n");
      out.write("						<div class=\"blockquote-custom-icon bg-info shadow-sm\">\r\n");
      out.write("							<i class=\"fa fa-quote-left text-white\"></i>\r\n");
      out.write("						</div>\r\n");
      out.write("						<img\r\n");
      out.write("							src=\"https://www.bajajmachines.com/wp-content/uploads/2021/07/mission.jpg\"\r\n");
      out.write("							class=\"img-fluid\" alt=\"...\" style=\"height: 250px; width: 100%\"><br>\r\n");
      out.write("						<br>\r\n");
      out.write("						<h3>Our Mission</h3>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"mb-0 mt-2 font-italic\">\"Stay responsive to\r\n");
      out.write("							consumers' requirement, find innovative and flexible solutions\r\n");
      out.write("							and strive to achieve customer satisfaction with our performance,\r\n");
      out.write("							honesty, and integrity. We aim to achieve our esteemed patrons'\r\n");
      out.write("							trust and develop a lasting relationship with them.\"</p>\r\n");
      out.write("\r\n");
      out.write("					</blockquote>\r\n");
      out.write("					<!-- END -->\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("\r\n");
      out.write("					<!-- CUSTOM BLOCKQUOTE -->\r\n");
      out.write("					<blockquote\r\n");
      out.write("						class=\"blockquote blockquote-custom bg-white p-5 shadow rounded\">\r\n");
      out.write("						<div class=\"blockquote-custom-icon bg-info shadow-sm\">\r\n");
      out.write("							<i class=\"fa fa-quote-left text-white\"></i>\r\n");
      out.write("						</div>\r\n");
      out.write("						<img\r\n");
      out.write("							src=\"https://www.salesforce.com/blog/wp-content/uploads/sites/2/2021/03/improve-team-efficiency-productivity-header.jpg\"\r\n");
      out.write("							class=\"img-fluid\" alt=\"...\" style=\"height: 250px; width: 100%\"><br>\r\n");
      out.write("						<br>\r\n");
      out.write("						<h3>Our Team</h3>\r\n");
      out.write("\r\n");
      out.write("						<p class=\"mb-0 mt-2 font-italic\">\"Our team is made up of\r\n");
      out.write("							highly skilled and experienced professionals who are passionate\r\n");
      out.write("							about what they do. We work together as a team to deliver the\r\n");
      out.write("							best results for our customers. \"</p>\r\n");
      out.write("						<br> <br>\r\n");
      out.write("\r\n");
      out.write("					</blockquote>\r\n");
      out.write("					<!-- END -->\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/typed.js@2.0.12\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    var typed=new Typed(\".para\",{\r\n");
      out.write("        strings:[\"Welcome to our website! We are a company that specializes in providing high-quality products and services to our customers. Our team is dedicated to delivering the best experience possible, and we are always looking for ways to improve and innovate.\"],\r\n");
      out.write("	\r\n");
      out.write("        typeSpeed:70,\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        })\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
