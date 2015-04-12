package org.apache.jsp.pages.organisation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class department_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/commons/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ks_hasSecurityResource_identifier;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ks_hasSecurityResource_identifier = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_ks_hasSecurityResource_identifier.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
pageContext.setAttribute("contextPath", request.getContextPath());
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
pageContext.setAttribute("formId", "formId_" + new Date().getTime());
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .department-detail .row > .form-group{\r\n");
      out.write("        margin-left: 0;\r\n");
      out.write("        margin-right: 0;\r\n");
      out.write("        border: 1px solid #DDDDDD;\r\n");
      out.write("    }\r\n");
      out.write("    .department-detail .control-label {\r\n");
      out.write("        text-align: right;\r\n");
      out.write("    }\r\n");
      out.write("    .department-detail .base-info {\r\n");
      out.write("        border-width: 1px 0 0 1px;\r\n");
      out.write("        border-collapse: separate;\r\n");
      out.write("        margin-bottom: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    .department-detail .grid-table-body{\r\n");
      out.write("        height: 210px;\r\n");
      out.write("    }\r\n");
      out.write("     .base-info {\r\n");
      out.write("     \tborder-collapse: separate;\r\n");
      out.write("     }\r\n");
      out.write("    .base-info td {\r\n");
      out.write("    \tborder-width: 0 1px 1px 0!important;\r\n");
      out.write("    \tborder-color: transparent #DDDDDD #DDDDDD transparent!important;\r\n");
      out.write("    \tborder-style: solid\r\n");
      out.write("    }\r\n");
      out.write("    .department-detail .buttons {\r\n");
      out.write("     \tmargin-top: 38%;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"department-detail\" id=\"departmentDetail\">\r\n");
      out.write("    <ul class=\"u-tree tree\" id=\"departmentTree\"  oncontextmenu=\"return false\"></ul>\r\n");
      out.write("    <div class=\"right-content\">\r\n");
      out.write("        <table class=\"table table-bordered table-hover base-info\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <label class=\"col-lg-5 control-label\">编号:</label>\r\n");
      out.write("                    <div class=\"col-lg-7\">\r\n");
      out.write("                        <span data-role=\"number\"></span>\r\n");
      out.write("                        <input type=\"hidden\" data-role=\"id\">\r\n");
      out.write("                        <input type=\"hidden\" data-role=\"organizationType\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <label class=\"col-lg-5 control-label\">名称:</label>\r\n");
      out.write("                    <div class=\"col-lg-7\">\r\n");
      out.write("                        <span data-role=\"name\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <label class=\"col-lg-5 control-label\">机构负责人:</label>\r\n");
      out.write("                    <div class=\"col-lg-7\">\r\n");
      out.write("                        <span data-role=\"principalName\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <label class=\"col-lg-5 control-label\">描述:</label>\r\n");
      out.write("                    <div class=\"col-lg-7\">\r\n");
      out.write("                        <span data-role=\"description\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"btn-group buttons pull-right\">\r\n");
      out.write("           \t");
      if (_jspx_meth_ks_hasSecurityResource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_ks_hasSecurityResource_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_ks_hasSecurityResource_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           \t");
      if (_jspx_meth_ks_hasSecurityResource_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_ks_hasSecurityResource_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_ks_hasSecurityResource_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"clear:both;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("    \tdepartment().getTree();\r\n");
      out.write("        $('#employeeListBtn').on('click', function(){\r\n");
      out.write("            department().showEmployeeList($('.right-content').find('[data-role=\"id\"]').val(), $('#department-employee-list'));\r\n");
      out.write("        });\r\n");
      out.write("       $('#addDepartment').on('click', function(){\r\n");
      out.write("           department().addDepartment($('.right-content').find('[data-role=\"id\"]').val(),\r\n");
      out.write("                   $('.right-content').find('[data-role=\"organizationType\"]').val());\r\n");
      out.write("        });\r\n");
      out.write("        $('#addCompany').on('click', function(){\r\n");
      out.write("            department().addCompany($('.right-content').find('[data-role=\"id\"]').val());\r\n");
      out.write("        });\r\n");
      out.write("        $('#updateDepartment').on('click', function(){\r\n");
      out.write("            var id = $('.right-content').find('[data-role=\"id\"]').val();\r\n");
      out.write("            department().updateDepartment(id, $('#departmentTree').find('#'+id))\r\n");
      out.write("        });\r\n");
      out.write("        $('#updateCompany').on('click', function(){\r\n");
      out.write("            var id = $('.right-content').find('[data-role=\"id\"]').val();\r\n");
      out.write("            department().updateCompany(id, $('#departmentTree').find('#'+id))\r\n");
      out.write("        });\r\n");
      out.write("       $('#delete').on('click', function(event, data){\r\n");
      out.write("            $(this).confirm({\r\n");
      out.write("                content: '确定要撤销该机构吗?',\r\n");
      out.write("                callBack: function(){\r\n");
      out.write("                \tvar id = $('.right-content').find('[data-role=\"id\"]').val();\r\n");
      out.write("                \t$.get( contextPath + '/organization/get.koala?id='+id).done(function(data){\r\n");
      out.write("            \t\t\tvar org = data;\r\n");
      out.write("                        var type = org.organizationType;\r\n");
      out.write("            \t\t\tdelete org.children;\r\n");
      out.write("                        delete org.organizationType;\r\n");
      out.write("                        var $element = $('#departmentTree').find('#'+org.id);\r\n");
      out.write("                        if($element.hasClass('tree-folder')){\r\n");
      out.write("                        \t$element = $element.find('.tree-folder-header');\r\n");
      out.write("                        }\r\n");
      out.write("                        department().del(org, type, $element);\r\n");
      out.write("                \t})\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_ks_hasSecurityResource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_0 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_0.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_0.setParent(null);
    _jspx_th_ks_hasSecurityResource_0.setIdentifier("organizationManagerAddCompany");
    int _jspx_eval_ks_hasSecurityResource_0 = _jspx_th_ks_hasSecurityResource_0.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button id=\"addCompany\"type=\"button\" class=\"btn btn-primary\" ><span class=\"glyphicon glyphicon-plus\"></span>&nbsp;创建分公司</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_0);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_0);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_1 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_1.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_1.setParent(null);
    _jspx_th_ks_hasSecurityResource_1.setIdentifier("organizationManagerAddDepartment");
    int _jspx_eval_ks_hasSecurityResource_1 = _jspx_th_ks_hasSecurityResource_1.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button id=\"addDepartment\"type=\"button\" class=\"btn btn-primary\" ><span class=\"glyphicon glyphicon-plus\"></span>&nbsp;创建下级部门</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_1);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_1);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_2 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_2.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_2.setParent(null);
    _jspx_th_ks_hasSecurityResource_2.setIdentifier("organizationManagerEmployeeListBtn");
    int _jspx_eval_ks_hasSecurityResource_2 = _jspx_th_ks_hasSecurityResource_2.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button id=\"employeeListBtn\" class=\"btn btn-info\" type=\"button\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;员工列表</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_2);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_2);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_3 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_3.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_3.setParent(null);
    _jspx_th_ks_hasSecurityResource_3.setIdentifier("organizationManagerUpdateDepartment");
    int _jspx_eval_ks_hasSecurityResource_3 = _jspx_th_ks_hasSecurityResource_3.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button id=\"updateDepartment\" type=\"button\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-wrench\"></span>&nbsp;修改</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_3);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_3);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_4 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_4.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_4.setParent(null);
    _jspx_th_ks_hasSecurityResource_4.setIdentifier("organizationManagerUpdateCompany");
    int _jspx_eval_ks_hasSecurityResource_4 = _jspx_th_ks_hasSecurityResource_4.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button id=\"updateCompany\" type=\"button\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-wrench\"></span>&nbsp;修改</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_4);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_4);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_5 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_5.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_5.setParent(null);
    _jspx_th_ks_hasSecurityResource_5.setIdentifier("organizationManagerDelete");
    int _jspx_eval_ks_hasSecurityResource_5 = _jspx_th_ks_hasSecurityResource_5.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button id=\"delete\" class=\"btn btn-danger\" type=\"button\"><span class=\"glyphicon glyphicon-remove\"></span>&nbsp;撤销</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_5);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_5);
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/js/organisation/department.js");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/js/organisation/select-employee.js");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }
}
