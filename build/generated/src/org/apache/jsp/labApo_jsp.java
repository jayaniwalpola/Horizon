package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class labApo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Book Appointment</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("               \n");
      out.write("            \n");
      out.write("            .main{\n");
      out.write("                padding: 5px;\n");
      out.write("                margin: 5px;\n");
      out.write("                border: solid 1px black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Book Appointment</h1>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <form method=\"post\" action=\"Add\">   \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Patient Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pname\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Patient ID:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pid\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Doctor ID:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"did\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Patient Contact No:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pno\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select Appointment Type:</td>\n");
      out.write("                    <td><select name=\"type\">\n");
      out.write("                    <option name=\"a\">ECG</option>\n");
      out.write("                    <option name=\"b\">Lab Test(blood or urine)</option>\n");
      out.write("                    <option name=\"c\">Container Pick Up/Specimen Drop Off</option>\n");
      out.write("                    <option name=\"d\">Lab Test & ECG</option>\n");
      out.write("                    <option name=\"e\">Lab Test Pediatric</option>\n");
      out.write("                </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select Date:</td>\n");
      out.write("                    <td><input type=\"date\" name=\"date\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select Time:</td>\n");
      out.write("                    <td><input type=\"time\"  name=\"time\"></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" value=\"Book\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("    \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
