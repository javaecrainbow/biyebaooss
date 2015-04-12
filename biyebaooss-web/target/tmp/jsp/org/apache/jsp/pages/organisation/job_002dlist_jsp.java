package org.apache.jsp.pages.organisation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class job_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form id=\"jobSearchForm\" target=\"_self\" class=\"form-horizontal searchCondition\">\r\n");
      out.write("\t<div id=\"jobQueryDiv\" hidden=\"true\">\r\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t  <td>\r\n");
      out.write("\t          <div class=\"form-group\">\r\n");
      out.write("\t              <label class=\"control-label\" style=\"width:100px;float:left;\">职务编号:&nbsp;</label>\r\n");
      out.write("\t              <div style=\"margin-left:15px;float:left;\">\r\n");
      out.write("\t                  <input name=\"sn\" class=\"form-control\" type=\"text\" style=\"width:180px;\"/>\r\n");
      out.write("\t              </div>\r\n");
      out.write("\t\r\n");
      out.write("\t              <label class=\"control-label\" style=\"width:100px;float:left;\">职务名称:&nbsp;</label>\r\n");
      out.write("\t              <div style=\"margin-left:15px;float:left;\">\r\n");
      out.write("\t                  <input name=\"name\" class=\"form-control\" type=\"text\" style=\"width:180px;\"/>\r\n");
      out.write("\t              </div>\r\n");
      out.write("\t              \r\n");
      out.write("\t              <label class=\"control-label\" style=\"width:100px;float:left;\">职务描述:&nbsp;</label>\r\n");
      out.write("\t              <div style=\"margin-left:15px;float:left;\">\r\n");
      out.write("\t                  <input name=\"description\" class=\"form-control\" type=\"text\" style=\"width:180px;\"/>\r\n");
      out.write("\t              </div>\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t      </td>\r\n");
      out.write("\t      <td style=\"vertical-align: bottom;\"><button id=\"jobSearchBtn\" type=\"button\" style=\"position:relative; margin-left:35px; top: -15px\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-search\"></span>&nbsp;</button></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div id=\"jobgrid\"></div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("       var cols = [\r\n");
      out.write("            { title:'职务编号', name:'sn' , width: '250px'},\r\n");
      out.write("            { title:'职务名称', name:'name', width: '250px'},\r\n");
      out.write("            { title:'职务描述', name:'description' , width: 'auto'}\r\n");
      out.write("        ];\r\n");
      out.write("        var buttons = [\r\n");
      out.write("            {content: '");
      if (_jspx_meth_ks_hasSecurityResource_0(_jspx_page_context))
        return;
      out.write("', action: 'add'},\r\n");
      out.write("            {content: '");
      if (_jspx_meth_ks_hasSecurityResource_1(_jspx_page_context))
        return;
      out.write("', action: 'modify'},\r\n");
      out.write("            {content: '");
      if (_jspx_meth_ks_hasSecurityResource_2(_jspx_page_context))
        return;
      out.write("', action: 'delete'},\r\n");
      out.write("            {content: '");
      if (_jspx_meth_ks_hasSecurityResource_3(_jspx_page_context))
        return;
      out.write("', action: 'search'}\r\n");
      out.write("        ];\r\n");
      out.write("        $('#jobgrid').grid({\r\n");
      out.write("             identity: 'id',\r\n");
      out.write("             columns: cols,\r\n");
      out.write("             buttons: buttons,\r\n");
      out.write("             url: contextPath +'/job/pagingquery.koala'\r\n");
      out.write("        }).on({\r\n");
      out.write("            'add': function(){\r\n");
      out.write("                job().add( $(this));\r\n");
      out.write("            },\r\n");
      out.write("            'modify': function(event, data){\r\n");
      out.write("                var indexs = data.data;\r\n");
      out.write("                var $this = $(this);\r\n");
      out.write("                if(indexs.length == 0){\r\n");
      out.write("                    $this.message({\r\n");
      out.write("                        type: 'warning',\r\n");
      out.write("                        content: '请选择一条记录进行修改'\r\n");
      out.write("                    })\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("                if(indexs.length > 1){\r\n");
      out.write("                    $this.message({\r\n");
      out.write("                        type: 'warning',\r\n");
      out.write("                        content: '只能选择一条记录进行修改'\r\n");
      out.write("                    })\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("                job().modify(indexs[0], $this);\r\n");
      out.write("            },\r\n");
      out.write("            'delete': function(event, data){\r\n");
      out.write("                var indexs = data.data;\r\n");
      out.write("                var $this = $(this)\r\n");
      out.write("                if(indexs.length == 0){\r\n");
      out.write("                    $this.message({\r\n");
      out.write("                        type: 'warning',\r\n");
      out.write("                        content: '请选择要删除的记录'\r\n");
      out.write("                    })\r\n");
      out.write("                    return;\r\n");
      out.write("                }\r\n");
      out.write("                $this.confirm({\r\n");
      out.write("                    content: '确定要删除所选记录吗?',\r\n");
      out.write("                    callBack: function(){ job().del(data.item, $this);}\r\n");
      out.write("                });\r\n");
      out.write("            },\r\n");
      out.write("\t\t\t'search' : function() {\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#jobQueryDiv\").slideToggle(\"slow\");\t\t\t\t\t\t \r\n");
      out.write("\t\t\t}\r\n");
      out.write("        })\r\n");
      out.write("        var form = $(\"#jobSearchForm\");\r\n");
      out.write("        form.find('#jobSearchBtn').on('click', function(){\r\n");
      out.write("            var params = {};\r\n");
      out.write("            form.find('.form-control').each(function(){\r\n");
      out.write("                var $this = $(this);\r\n");
      out.write("                var name = $this.attr('name');\r\n");
      out.write("                 if(name){\r\n");
      out.write("                    params[name] = $this.val();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#jobgrid\").getGrid().search(params);\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/js/organisation/job.js");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_0 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_0.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_0.setParent(null);
    _jspx_th_ks_hasSecurityResource_0.setIdentifier("jobManagerCreate");
    int _jspx_eval_ks_hasSecurityResource_0 = _jspx_th_ks_hasSecurityResource_0.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-primary\" type=\"button\"><span class=\"glyphicon glyphicon-plus\"></span>&nbsp;创建</button>");
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
    _jspx_th_ks_hasSecurityResource_1.setIdentifier("jobManagerUpdate");
    int _jspx_eval_ks_hasSecurityResource_1 = _jspx_th_ks_hasSecurityResource_1.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-success\" type=\"button\"><span class=\"glyphicon glyphicon-edit\"></span>&nbsp;修改</button>");
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
    _jspx_th_ks_hasSecurityResource_2.setIdentifier("jobManagerDelete");
    int _jspx_eval_ks_hasSecurityResource_2 = _jspx_th_ks_hasSecurityResource_2.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-danger\" type=\"button\"><span class=\"glyphicon glyphicon-remove\"></span>&nbsp;撤销</button>");
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
    _jspx_th_ks_hasSecurityResource_3.setIdentifier("jobManagerQuery");
    int _jspx_eval_ks_hasSecurityResource_3 = _jspx_th_ks_hasSecurityResource_3.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-success\" type=\"button\"><span class=\"glyphicon glyphicon-search\"></span>&nbsp;高级搜索<span class=\"caret\"></span></button>");
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
}
