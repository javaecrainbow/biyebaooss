package org.apache.jsp.pages.organisation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class position_002dtemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"departmentAdd\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .modal-dialog .col-lg-8 > input, .col-lg-8 > span {\r\n");
      out.write("            display: inline;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .col-lg-8 .form-control {\r\n");
      out.write("            width: 85%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <div class=\"modal-dialog\" >\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">岗位</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-4 control-label\">岗位编号:</label>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"positionSn\"><span class=\"required\">*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-4 control-label\">岗位名称:</label>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"positionName\"><span class=\"required\">*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-4 control-label\">选择机构:</label>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <div class=\"btn-group select\" id=\"positionDepartment\">\r\n");
      out.write("                                <button data-toggle=\"item\" class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                   选择机构\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <button data-toggle=\"dropdown\" class=\"btn btn-default dropdown-toggle\" type=\"button\">\r\n");
      out.write("                                    <span class=\"caret\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <input type=\"hidden\" data-toggle=\"value\">\r\n");
      out.write("                            </div><span class=\"required\">*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-4 control-label\">选择职务:</label>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <div class=\"btn-group select\" id=\"positionJob\"></div><span class=\"required\">*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-4 control-label\">是否机构负责岗位:</label>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                                <div class=\"radio\"><span ><input value=true type=\"radio\" name=\"organizationPrincipal\"  style=\"opacity: 0;\"></span></div><span style=\"position: relative; top: 5px;\">是</span>\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;<div class=\"radio\"><span class=\"checked\"><input type=\"radio\" checked=\"checked\" value=false name=\"organizationPrincipal\" style=\"opacity: 0;\"></span></div><span style=\"position: relative; top: 5px;\">否</span>\r\n");
      out.write("                       </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-lg-4 control-label\">描述:</label>\r\n");
      out.write("                        <div class=\"col-lg-8\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"positionDescription\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-success\" id=\"save\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
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
