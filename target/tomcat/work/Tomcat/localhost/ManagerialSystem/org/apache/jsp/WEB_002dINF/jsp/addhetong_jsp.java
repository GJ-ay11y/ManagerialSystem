/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-12 06:09:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addhetong_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>房屋租赁系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/common.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/main.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/libs/modernizr.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-ui-datepicker.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.validate.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui.css\"/>\r\n");
      out.write("    <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .error {\r\n");
      out.write("\r\n");
      out.write("            font-size:13px;\r\n");
      out.write("            color: red;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $().ready(function() {\r\n");
      out.write("            // 在键盘按下并释放及提交后验证提交表单\r\n");
      out.write("            $(\"#fromdate\").datepicker();\r\n");
      out.write("            $(\"#todate\").datepicker();\r\n");
      out.write("            $(\"#myform\").validate({\r\n");
      out.write("\r\n");
      out.write("                rules : {\r\n");
      out.write("                    house_id : {\r\n");
      out.write("                        required : true,\r\n");
      out.write("                    },\r\n");
      out.write("\r\n");
      out.write("                    address : {\r\n");
      out.write("                        required : true,\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    chuzu : {\r\n");
      out.write("                        required : true,\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    price: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("                        min: 1\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    chuzu_idcard: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    zuke: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    zuke_idcard: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    fromdate: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("                    },\r\n");
      out.write("                    todate: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("                    },\r\n");
      out.write("                    payday: {\r\n");
      out.write("                        required : true,\r\n");
      out.write("                        min:0,\r\n");
      out.write("                        max:31,\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                messages : {\r\n");
      out.write("                    house_id : {\r\n");
      out.write("                        required : \"房屋id不能为空\",\r\n");
      out.write("                    },\r\n");
      out.write("\r\n");
      out.write("                    address : {\r\n");
      out.write("                        required : \"房屋地址不能为空\",\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    chuzu : {\r\n");
      out.write("                        required : \"出租方不能为空\",\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    price: {\r\n");
      out.write("                        required : \"租金不能为空\",\r\n");
      out.write("                        min: \"请输入正确的租金\"\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    chuzu_idcard: {\r\n");
      out.write("                        required : \"出租方证件号不能为空\",\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    zuke: {\r\n");
      out.write("                        required : \"承租方不能为空\",\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    zuke_idcard: {\r\n");
      out.write("                        required : \"承租方证件号不能为空\",\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    fromdate: {\r\n");
      out.write("                        required : \"起租时间不能为空\",\r\n");
      out.write("                    },\r\n");
      out.write("                    todate: {\r\n");
      out.write("                        required : \"退租时间不能为空\",\r\n");
      out.write("                    },\r\n");
      out.write("                    payday: {\r\n");
      out.write("                        required : \"每月交租日不能为空\",\r\n");
      out.write("                        min:\"每月交租日必须大于0\",\r\n");
      out.write("                        max:\"每月交租日必须小于31\",\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"result-title\" style=\"text-align: center\">\r\n");
      out.write("    <h1>添加合同信息，请确定合同信息正确无误再提交！</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"result-content\">\r\n");
      out.write("    <div class=\"sidebar-title\">\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page/addhetong\" method=\"post\" >\r\n");
      out.write("            <table class=\"insert-tab\" width=\"100%\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                <th><i class=\"require-red\">*</i>房屋id：</th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input class=\"common-text \" placeholder=\"房屋id\" id=\"house_id\" name=\"house_id\" size=\"50\" type=\"text\">\r\n");
      out.write("                </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>地址：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"address\" placeholder=\"地址\" id=\"address\" size=\"50\" type=\"text\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>出租方（甲方）：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"chuzu\" placeholder=\"出租方（甲方）\" id=\"chuzu\" size=\"50\" type=\"text\" ></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>出租方（甲方）证件号码：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"chuzu_idcard\" placeholder=\"出租方（甲方）证件号码\" id=\"chuzu_idcard\" size=\"50\" type=\"text\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>承租方（乙方）：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"zuke\" placeholder=\"承租方（乙方）\" id=\"zuke\" size=\"50\" type=\"text\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>承租方（乙方）证件号码：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"zuke_idcard\" placeholder=\"承租方（乙方）证件号码\" id=\"zuke_idcard\" size=\"50\" type=\"text\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>起租时间：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"fromdate\" id=\"fromdate\" placeholder=\"起租时间\" size=\"50\"  type=\"text\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>退租时间：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"todate\" id=\"todate\" placeholder=\"退租时间\" size=\"50\"  type=\"text\" ></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>每月租金：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"price\" id=\"price\" placeholder=\"每月租金\" size=\"50\"  type=\"text\" ></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><i class=\"require-red\">*</i>每月交租日（数字）：</th>\r\n");
      out.write("                    <td><input class=\"common-text\" name=\"payday\" id=\"payday\" placeholder=\"每月交租日（数字）\" size=\"50\"  type=\"text\" ></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th></th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input class=\"btn btn-primary btn6 mr10\" value=\"提交\" type=\"submit\">\r\n");
      out.write("                        <input class=\"btn btn6\" onclick=\"history.go(-1)\" value=\"返回\" type=\"button\">\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody></table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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