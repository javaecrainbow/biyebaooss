package org.apache.jsp.pages.organisation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class job_002dtemplate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_k_token_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_k_token_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_k_token_nobody.release();
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
      out.write("<div class=\"modal fade\" id=\"jobEditor\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .modal-dialog  input {\r\n");
      out.write("            width: 300px;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .modal-body {\r\n");
      out.write("            padding-top: 20px;\r\n");
      out.write("            padding-left: 40px;\r\n");
      out.write("            padding-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .modal-body .help-block {\r\n");
      out.write("            display: none;\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .modal-footer {\r\n");
      out.write("            margin-top: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .col-lg-9 > input, .col-lg-9 > span {\r\n");
      out.write("            display: inline;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .col-lg-9 .form-control {\r\n");
      out.write("            width: 85%;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog .col-lg-9 > span {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            top: 3px;\r\n");
      out.write("            margin-left: 5px;\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("        .modal-dialog  .checker {\r\n");
      out.write("            padding-top: 5px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <div class=\"modal-dialog\" >\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">添加职位</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                \t");
      if (_jspx_meth_k_token_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"jobSn\" class=\"col-lg-3 control-label\">职位编号:</label>\r\n");
      out.write("                        <div class=\"col-lg-9\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"jobSn\"><span>*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"jobName\" class=\"col-lg-3 control-label\">职位名称:</label>\r\n");
      out.write("                        <div class=\"col-lg-9\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"jobName\"><span>*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"jobDescription\" class=\"col-lg-3 control-label\">职位描述:</label>\r\n");
      out.write("                        <div class=\"col-lg-9\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"jobDescription\">\r\n");
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
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_k_token_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  k:token
    org.openkoala.koala.token.tags.KoalaTokenTag _jspx_th_k_token_0 = (org.openkoala.koala.token.tags.KoalaTokenTag) _jspx_tagPool_k_token_nobody.get(org.openkoala.koala.token.tags.KoalaTokenTag.class);
    _jspx_th_k_token_0.setPageContext(_jspx_page_context);
    _jspx_th_k_token_0.setParent(null);
    int _jspx_eval_k_token_0 = _jspx_th_k_token_0.doStartTag();
    if (_jspx_th_k_token_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_k_token_nobody.reuse(_jspx_th_k_token_0);
      return true;
    }
    _jspx_tagPool_k_token_nobody.reuse(_jspx_th_k_token_0);
    return false;
  }
}
