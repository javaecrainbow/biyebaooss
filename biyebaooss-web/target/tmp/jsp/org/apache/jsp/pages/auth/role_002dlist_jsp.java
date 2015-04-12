package org.apache.jsp.pages.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class role_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/commons/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ks_hasSecurityResource_identifier;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ks_hasSecurityResource_identifier = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!-- strat form -->\r\n");
      out.write("<form name=\"roleListForm\" id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${formId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" target=\"_self\" class=\"form-horizontal searchCondition\">\r\n");
      out.write("<div  id=\"roleManagerQueryDivId\" hidden=\"true\" >\r\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("              <label class=\"control-label\" style=\"width:100px;float:left;\">角色名称:&nbsp;</label>\r\n");
      out.write("              <div style=\"margin-left:15px;float:left;\">\r\n");
      out.write("                  <input name=\"name\" class=\"form-control\" type=\"text\" style=\"width:180px;\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <label class=\"control-label\" style=\"width:100px;float:left;\">角色描述:&nbsp;</label>\r\n");
      out.write("              <div style=\"margin-left:15px;float:left;\">\r\n");
      out.write("                  <input name=\"description\" class=\"form-control\" type=\"text\" style=\"width:180px;\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td style=\"vertical-align: bottom;\"><button id=\"roleManagerSearch\" type=\"button\" style=\"position:relative; margin-left:35px; top: -15px\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-search\"></span>&nbsp;</button></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\t\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<!-- end form -->\r\n");
      out.write("<div data-role=\"roleGrid\"></div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar columns = [{\r\n");
      out.write("\t\t\ttitle : \"角色名称\",\r\n");
      out.write("\t\t\tname : \"name\",\r\n");
      out.write("\t\t\twidth : 250\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\ttitle : \"角色描述\",\r\n");
      out.write("\t\t\tname : \"description\",\r\n");
      out.write("\t\t\twidth : 250\r\n");
      out.write("\t\t}\r\n");
      out.write("        ];\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar buttons = (function() {\r\n");
      out.write("            return [{\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_0(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'add'\r\n");
      out.write("            }, {\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_1(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'modify'\r\n");
      out.write("            }, {\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_2(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'delete'\r\n");
      out.write("            }, {\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_3(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'urlAssign'\r\n");
      out.write("            }, {\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_4(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'menuAssign'\r\n");
      out.write("            },{\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_5(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'pageAssign'\r\n");
      out.write("            },{\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_6(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'permissionAssign'\r\n");
      out.write("            },{\r\n");
      out.write("                content : '");
      if (_jspx_meth_ks_hasSecurityResource_7(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("                action : 'roleManagerQuery'\r\n");
      out.write("            }];\r\n");
      out.write("\t\t})();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar url = contextPath + '/auth/role/pagingQuery.koala';\r\n");
      out.write("\r\n");
      out.write("\t\t$('[data-role=\"roleGrid\"]').grid({\r\n");
      out.write("\t\t\tidentity : 'id',\r\n");
      out.write("\t\t\tcolumns : columns,\r\n");
      out.write("\t\t\tbuttons : buttons,\r\n");
      out.write("\t\t\turl \t: url\r\n");
      out.write("\t\t}).on({\r\n");
      out.write("\t\t\t'add' \t: function() {\r\n");
      out.write("\t\t\t\troleManager().add($(this));\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'modify' : function(event, data) {\r\n");
      out.write("\t\t\t\tvar indexs = data.data;\r\n");
      out.write("\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\tif (indexs.length == 0) {       \r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '请选择一条记录进行修改'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (indexs.length > 1) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '只能选择一条记录进行修改'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\troleManager().modify(data.item[0], $(this));\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'delete' : function(event, data) {\r\n");
      out.write("\t\t\t\tvar indexs = data.data;\r\n");
      out.write("\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\tif (indexs.length == 0) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '请选择要撤销的记录'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$this.confirm({\r\n");
      out.write("\t\t\t\t\tcontent : '确定要撤销所选记录吗?',\r\n");
      out.write("\t\t\t\t\tcallBack : function() {\r\n");
      out.write("\t\t\t\t\t\troleManager().deleteRole(data.item, $this);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'roleManagerQuery' : function() {\r\n");
      out.write("\t\t\t\t$(\"#roleManagerQueryDivId\").slideToggle(\"slow\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"urlAssign\" : function(event, data){\r\n");
      out.write("\t\t\t\tvar items \t= data.item;\r\n");
      out.write("\t\t\t\tvar thiz\t= $(this);\r\n");
      out.write("\t\t\t\tif(items.length == 0){\r\n");
      out.write("\t\t\t\t\tthiz.message({type : 'warning',content : '请选择一条记录进行操作'});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t} else if(items.length > 1){\r\n");
      out.write("\t\t\t\t\tthiz.message({type : 'warning',content : '只能选择一条记录进行操作'});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar role = items[0];\r\n");
      out.write("                console.log(role);\r\n");
      out.write("\t\t\t\t/*打开url表格*/\r\n");
      out.write("\t\t\t\topenTab('/pages/auth/role-grant-url.jsp', role.name+'的URL访问资源管理', 'roleGrantUrlManager_' + role.id, role.id, {roleId : role.id});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"menuAssign\" : function(event, data) {\r\n");
      out.write("\t\t\t\tvar items = data.item;\r\n");
      out.write("\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\tif (items.length == 0) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '请选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (items.length > 1) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '只能选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\troleManager().assignResource($this, items[0].id);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'pageAssign' : function(event, data) {\r\n");
      out.write("\t\t\t\tvar items = data.item;\r\n");
      out.write("\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\tif (items.length == 0) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '请选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (items.length > 1) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '只能选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar page = items[0];\r\n");
      out.write("\t\t\t\topenTab('/pages/auth/role-grant-page.jsp', page.name+'的页面元素资源管理', 'roleGrantPageManager_' + page.id, page.id, {pageId : page.id});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'permissionAssign' : function(event, data) {\r\n");
      out.write("\t\t\t\tvar items = data.item;\r\n");
      out.write("\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\tif (items.length == 0) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '请选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (items.length > 1) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '只能选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar permission = items[0];\r\n");
      out.write("\t\t\t\topenTab('/pages/auth/role-grant-permission.jsp', permission.name+'的权限管理', 'roleGrantPermissionManager_' + permission.id, permission.id, {permissionId : permission.id});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'assignResource' : function(event, data) {\r\n");
      out.write("\t\t\t\tvar indexs = data.data;\r\n");
      out.write("\t\t\t\tvar $this = $(this);\r\n");
      out.write("\t\t\t\tif (indexs.length == 0) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '请选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (indexs.length > 1) {\r\n");
      out.write("\t\t\t\t\t$this.message({\r\n");
      out.write("\t\t\t\t\t\ttype : 'warning',\r\n");
      out.write("\t\t\t\t\t\tcontent : '只能选择一条记录进行操作'\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\troleManager().assignResource($(this), data.data[0]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("        var form = $('#'+'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${formId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\t\tform.find('#roleManagerSearch').on('click', function(){\r\n");
      out.write("\t            var params = {};\r\n");
      out.write("\t            form.find('.form-control').each(function(){\r\n");
      out.write("\t                var $this = $(this);\r\n");
      out.write("\t                var name = $this.attr('name');\r\n");
      out.write("\t                 if(name){\r\n");
      out.write("\t                    params[name] = $this.val();\r\n");
      out.write("\t                }\r\n");
      out.write("\t            });\r\n");
      out.write("\t           $('[data-role=\"roleGrid\"]').getGrid().search(params);\r\n");
      out.write("\t        });\r\n");
      out.write("\t});\r\n");
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

  private boolean _jspx_meth_ks_hasSecurityResource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_0 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_0.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_0.setParent(null);
    _jspx_th_ks_hasSecurityResource_0.setIdentifier("roleManagerAdd");
    int _jspx_eval_ks_hasSecurityResource_0 = _jspx_th_ks_hasSecurityResource_0.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-primary\" type=\"button\"><span class=\"glyphicon glyphicon-plus\"><span>添加</button>");
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
    _jspx_th_ks_hasSecurityResource_1.setIdentifier("roleManagerUpdate");
    int _jspx_eval_ks_hasSecurityResource_1 = _jspx_th_ks_hasSecurityResource_1.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-primary\" type=\"button\"><span class=\"glyphicon glyphicon-edit\"><span>修改</button>");
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
    _jspx_th_ks_hasSecurityResource_2.setIdentifier("roleManagerTerminate");
    int _jspx_eval_ks_hasSecurityResource_2 = _jspx_th_ks_hasSecurityResource_2.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-danger\" type=\"button\"><span class=\"glyphicon glyphicon-remove\"><span>撤销</button>");
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
    _jspx_th_ks_hasSecurityResource_3.setIdentifier("roleManagerGrantUrlAccessResource");
    int _jspx_eval_ks_hasSecurityResource_3 = _jspx_th_ks_hasSecurityResource_3.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-info\" type=\"button\"><span class=\"glyphicon glyphicon-th-large\"></span>&nbsp;分配URL访问资源</button>");
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
    _jspx_th_ks_hasSecurityResource_4.setIdentifier("roleManagerGrantMenuResource");
    int _jspx_eval_ks_hasSecurityResource_4 = _jspx_th_ks_hasSecurityResource_4.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-info\" type=\"button\"><span class=\"glyphicon glyphicon-th-large\"></span>&nbsp;分配菜单资源</button>");
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
    _jspx_th_ks_hasSecurityResource_5.setIdentifier("roleManagerGrantPageElementResource");
    int _jspx_eval_ks_hasSecurityResource_5 = _jspx_th_ks_hasSecurityResource_5.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-info\" type=\"button\"><span class=\"glyphicon glyphicon-th-large\"></span>&nbsp;分配页面元素资源</button>");
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

  private boolean _jspx_meth_ks_hasSecurityResource_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_6 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_6.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_6.setParent(null);
    _jspx_th_ks_hasSecurityResource_6.setIdentifier("roleManagerGrantPermission");
    int _jspx_eval_ks_hasSecurityResource_6 = _jspx_th_ks_hasSecurityResource_6.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-info\" type=\"button\"><span class=\"glyphicon glyphicon-th-large\"></span>&nbsp;分配权限</button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_6);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_6);
    return false;
  }

  private boolean _jspx_meth_ks_hasSecurityResource_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ks:hasSecurityResource
    org.openkoala.security.taglibs.SecurityResourceTag _jspx_th_ks_hasSecurityResource_7 = (org.openkoala.security.taglibs.SecurityResourceTag) _jspx_tagPool_ks_hasSecurityResource_identifier.get(org.openkoala.security.taglibs.SecurityResourceTag.class);
    _jspx_th_ks_hasSecurityResource_7.setPageContext(_jspx_page_context);
    _jspx_th_ks_hasSecurityResource_7.setParent(null);
    _jspx_th_ks_hasSecurityResource_7.setIdentifier("roleManagerQuery");
    int _jspx_eval_ks_hasSecurityResource_7 = _jspx_th_ks_hasSecurityResource_7.doStartTag();
    if (_jspx_eval_ks_hasSecurityResource_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<button class=\"btn btn-success\" type=\"button\"><span class=\"glyphicon glyphicon-search\"></span>&nbsp;高级搜索&nbsp; <span class=\"caret\"></span> </button>");
        int evalDoAfterBody = _jspx_th_ks_hasSecurityResource_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ks_hasSecurityResource_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_7);
      return true;
    }
    _jspx_tagPool_ks_hasSecurityResource_identifier.reuse(_jspx_th_ks_hasSecurityResource_7);
    return false;
  }
}
