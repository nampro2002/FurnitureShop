package org.apache.jsp.components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbarComponent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--::header part start::-->\n");
      out.write("<header class=\"main_menu home_menu\" style=\"position: fixed;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"> <img src=\"img/logo.png\" alt=\"logo\"> </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"menu_icon\"><i class=\"fas fa-bars\"></i></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"index.html\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"blog.html\" id=\"navbarDropdown_1\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    Shop\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_1\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"category.html\"> shop category</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"single-product.html\">product details</a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"blog.html\" id=\"navbarDropdown_3\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    pages\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_2\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"login.html\"> login</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"tracking.html\">tracking</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"checkout.html\">product checkout</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"cart.html\">shopping cart</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"confirmation.html\">confirmation</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"elements.html\">elements</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"blog.html\" id=\"navbarDropdown_2\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    blog\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_2\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"blog.html\"> blog</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"single-blog.html\">Single blog</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"contact.html\">Contact</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hearer_icon d-flex\">\n");
      out.write("                        <a id=\"search_1\" href=\"javascript:void(0)\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fas fa-heart\"></i></a>\n");
      out.write("                        <div class=\"dropdown cart\">\n");
      out.write("                            <a href=\"cart\">\n");
      out.write("                                <i class=\"fas fa-shopping-cart\"></i> \n");
      out.write("                                <span class=\"badge badge-danger\" style=\"font-size: 10px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <div class=\"dropdown-cart\">\n");
      out.write("                                    <div class=\"dropdown-cart-prod\">\n");
      out.write("                                       <div class=\"single_product\">\n");
      out.write("                                                <div class=\"cart-css-div\">\n");
      out.write("                                                    <img src=\"./img/b1.jpg\" alt=\"\" class=\"cart-css\">\n");
      out.write("                                                    <span>San pham 1<br>Gia san pham</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"single_product\">\n");
      out.write("                                                <div class=\"cart-css-div\">\n");
      out.write("                                                    <img src=\"./img/b1.jpg\" alt=\"\" class=\"cart-css\">\n");
      out.write("                                                    <span>San pham 1<br>Gia san pham</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"single_product\">\n");
      out.write("                                                <div class=\"cart-css-div\">\n");
      out.write("                                                    <img src=\"./img/b1.jpg\" alt=\"\" class=\"cart-css\">\n");
      out.write("                                                    <span>San pham 1<br>Gia san pham</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"view-cart-btn\">\n");
      out.write("                                        <a href=\"#\" class=\"genric-btn success large\">View Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"log-sgin\">\n");
      out.write("                    <a href=\"#\" class=\"genric-btn info\">Login</a>\n");
      out.write("                    <a href=\"#\" class=\"genric-btn success\">Sign-Up</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"search_input\" id=\"search_input_box\">\n");
      out.write("        <div class=\"container \">\n");
      out.write("            <form class=\"d-flex justify-content-between search-inner\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"search_input\" placeholder=\"Search Here\">\n");
      out.write("                <button type=\"submit\" class=\"btn\"></button>\n");
      out.write("                <span class=\"ti-close\" id=\"close_search\" title=\"Close Search\"></span>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("<!-- Header part end-->");
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
