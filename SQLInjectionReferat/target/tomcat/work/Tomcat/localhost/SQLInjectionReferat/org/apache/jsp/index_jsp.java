/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-03 11:30:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>This is SQLInjection Example!</h1>\n");
      out.write("\n");
      out.write("<!-- \t<form action=\"userCheck\">\n");
      out.write("\t\t<input type=\"text\" name=\"user\" value=\"\" /> <input type=\"submit\"\n");
      out.write("\t\t\tvalue=\"Submit\" />\n");
      out.write("\t</form>\n");
      out.write(" -->\n");
      out.write("\t<h2>Example query 1: \"SELECT * FROM User where userid='\"+user+\"' and password='\"+password+\"'\";</h2>\n");
      out.write("\t<form action=\"userCheck\">\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Username\" name=\"username\"> \n");
      out.write("\t\t<input type=\"text\" placeholder=\"Password\" name=\"password\">\n");
      out.write("\t\t<button type=\"submit\">Login</button>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t<h2> Example query 2: \"SELECT email, password, userId, firstName FROM User where email='\"+email+\"'\"</h2>\t\n");
      out.write("\t<form action=\"example2\">\n");
      out.write("\t\t<input type=\"text\" placeholder=\"Email\" name=\"email\"> \n");
      out.write("\t\t<button type=\"submit\">Submit</button>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
