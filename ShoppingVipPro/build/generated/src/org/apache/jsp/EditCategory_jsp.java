package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/components/navBarProfile.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Bootstrap CRUD Data Table for Database with Modal Form</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"icon\" href=\"img/favicon.png\">\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <!-- animate CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <!-- owl carousel CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("        <!-- font awesome CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.css\">\r\n");
      out.write("        <!-- flaticon CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("        <!-- font awesome CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("        <!-- swiper CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slick.css\">\r\n");
      out.write("        <!-- style CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                color: #566787;\r\n");
      out.write("                background: #f5f5f5;\r\n");
      out.write("                font-family: 'Varela Round', sans-serif;\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("            }\r\n");
      out.write("            .table-responsive {\r\n");
      out.write("                margin: 30px 0;\r\n");
      out.write("            }\r\n");
      out.write("            .table-wrapper {\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                padding: 20px 25px;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("                min-width: 1000px;\r\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\r\n");
      out.write("            }\r\n");
      out.write("            .table-title {\r\n");
      out.write("                padding-bottom: 15px;\r\n");
      out.write("                background: #435d7d;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                padding: 16px 30px;\r\n");
      out.write("                min-width: 100%;\r\n");
      out.write("                margin: -20px -25px 10px;\r\n");
      out.write("                border-radius: 3px 3px 0 0;\r\n");
      out.write("            }\r\n");
      out.write("            .table-title h2 {\r\n");
      out.write("                margin: 5px 0 0;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("            }\r\n");
      out.write("            .table-title .btn-group {\r\n");
      out.write("                float: right;\r\n");
      out.write("            }\r\n");
      out.write("            .table-title .btn {\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                float: right;\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                min-width: 50px;\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                outline: none !important;\r\n");
      out.write("                margin-left: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .table-title .btn i {\r\n");
      out.write("                float: left;\r\n");
      out.write("                font-size: 21px;\r\n");
      out.write("                margin-right: 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .table-title .btn span {\r\n");
      out.write("                float: left;\r\n");
      out.write("                margin-top: 2px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table tr th, table.table tr td {\r\n");
      out.write("                border-color: #e9e9e9;\r\n");
      out.write("                padding: 12px 15px;\r\n");
      out.write("                vertical-align: middle;\r\n");
      out.write("            }\r\n");
      out.write("            table.table tr th:first-child {\r\n");
      out.write("                width: 60px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table tr th:last-child {\r\n");
      out.write("                width: 100px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\r\n");
      out.write("                background-color: #fcfcfc;\r\n");
      out.write("            }\r\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\r\n");
      out.write("                background: #f5f5f5;\r\n");
      out.write("            }\r\n");
      out.write("            table.table th i {\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("                margin: 0 5px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td:last-child i {\r\n");
      out.write("                opacity: 0.9;\r\n");
      out.write("                font-size: 22px;\r\n");
      out.write("                margin: 0 5px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a {\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: #566787;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                outline: none !important;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a:hover {\r\n");
      out.write("                color: #2196F3;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a.edit {\r\n");
      out.write("                color: #FFC107;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a.delete {\r\n");
      out.write("                color: #F44336;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td i {\r\n");
      out.write("                font-size: 19px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table .avatar {\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                vertical-align: middle;\r\n");
      out.write("                margin-right: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination {\r\n");
      out.write("                float: right;\r\n");
      out.write("                margin: 0 0 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li a {\r\n");
      out.write("                border: none;\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("                min-width: 30px;\r\n");
      out.write("                min-height: 30px;\r\n");
      out.write("                color: #999;\r\n");
      out.write("                margin: 0 2px;\r\n");
      out.write("                line-height: 30px;\r\n");
      out.write("                border-radius: 2px !important;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                padding: 0 6px;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li a:hover {\r\n");
      out.write("                color: #666;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li.active a, .pagination li.active a.page-link {\r\n");
      out.write("                background: #03A9F4;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li.active a:hover {\r\n");
      out.write("                background: #0397d6;\r\n");
      out.write("            }\r\n");
      out.write("            .active{\r\n");
      out.write("                background: #03A9F4;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li.disabled i {\r\n");
      out.write("                color: #ccc;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li i {\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                padding-top: 6px\r\n");
      out.write("            }\r\n");
      out.write("            .hint-text {\r\n");
      out.write("                float: left;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("            }\r\n");
      out.write("            /* Custom checkbox */\r\n");
      out.write("            .custom-checkbox {\r\n");
      out.write("                position: relative;\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"] {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                margin: 5px 0 0 3px;\r\n");
      out.write("                z-index: 9;\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox label:before{\r\n");
      out.write("                width: 18px;\r\n");
      out.write("                height: 18px;\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox label:before {\r\n");
      out.write("                content: '';\r\n");
      out.write("                margin-right: 10px;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                vertical-align: text-top;\r\n");
      out.write("                background: white;\r\n");
      out.write("                border: 1px solid #bbb;\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                z-index: 2;\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\r\n");
      out.write("                content: '';\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 6px;\r\n");
      out.write("                top: 3px;\r\n");
      out.write("                width: 6px;\r\n");
      out.write("                height: 11px;\r\n");
      out.write("                border: solid #000;\r\n");
      out.write("                border-width: 0 3px 3px 0;\r\n");
      out.write("                transform: inherit;\r\n");
      out.write("                z-index: 3;\r\n");
      out.write("                transform: rotateZ(45deg);\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:before {\r\n");
      out.write("                border-color: #03A9F4;\r\n");
      out.write("                background: #03A9F4;\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\r\n");
      out.write("                border-color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:disabled + label:before {\r\n");
      out.write("                color: #b8b8b8;\r\n");
      out.write("                cursor: auto;\r\n");
      out.write("                box-shadow: none;\r\n");
      out.write("                background: #ddd;\r\n");
      out.write("            }\r\n");
      out.write("            /* Modal styles */\r\n");
      out.write("            .modal .modal-dialog {\r\n");
      out.write("                max-width: 400px;\r\n");
      out.write("            }\r\n");
      out.write("            .modal .modal-header, .modal .modal-body, .modal .modal-footer {\r\n");
      out.write("                padding: 20px 30px;\r\n");
      out.write("            }\r\n");
      out.write("            .modal .modal-content {\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("            }\r\n");
      out.write("            .modal .modal-footer {\r\n");
      out.write("                background: #ecf0f1;\r\n");
      out.write("                border-radius: 0 0 3px 3px;\r\n");
      out.write("            }\r\n");
      out.write("            .modal .modal-title {\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("            }\r\n");
      out.write("            .modal .form-control {\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                box-shadow: none;\r\n");
      out.write("                border-color: #dddddd;\r\n");
      out.write("            }\r\n");
      out.write("            .modal textarea.form-control {\r\n");
      out.write("                resize: vertical;\r\n");
      out.write("            }\r\n");
      out.write("            .modal .btn {\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                min-width: 100px;\r\n");
      out.write("            }\r\n");
      out.write("            .modal form label {\r\n");
      out.write("                font-weight: normal;\r\n");
      out.write("            }\r\n");
      out.write("            .container-margin{\r\n");
      out.write("                margin-top:100px;\r\n");
      out.write("                margin-left: 20px;\r\n");
      out.write("                margin-right: 20px;\r\n");
      out.write("            }\r\n");
      out.write("        </style> \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"main_menu home_menu\" style=\"position: fixed;\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row align-items-center\">\r\n");
      out.write("            <div class=\"col-lg-10\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home\"> <img src=\"img/logo.png\" alt=\"logo\"> </a>\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"menu_icon\"><i class=\"fas fa-bars\"></i></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav\">\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"home\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"product\">\r\n");
      out.write("                                    Shop\r\n");
      out.write("                                </a>                                \r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown_3\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    pages\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_2\">\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"login.html\"> login</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"tracking.html\">tracking</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"checkout.html\">product checkout</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"cart.html\">shopping cart</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"confirmation.html\">confirmation</a>\r\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"elements.html\">elements</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item dropdown\">\r\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown_2\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    blog\r\n");
      out.write("                                </a>                                \r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">Contact</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"hearer_icon d-flex\">\r\n");
      out.write("                        <a id=\"search_1\" href=\"javascript:void(0)\"><i class=\"fas fa-search\"></i></a>\r\n");
      out.write("                        <a href=\"\"><i class=\"fas fa-heart\"></i></a>\r\n");
      out.write("                        <div class=\"dropdown cart\">\r\n");
      out.write("                            <a href=\"cart\">\r\n");
      out.write("                                <i class=\"fas fa-shopping-cart\"></i> \r\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\" z-index: 2; top:40px\">\r\n");
      out.write("                                <div class=\"dropdown-cart\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    <div class=\"view-cart-btn\">\r\n");
      out.write("                                        <a href=\"#\" class=\"genric-btn success large\">View Cart</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"search_input\" id=\"search_input_box\">\r\n");
      out.write("        <div class=\"container \">\r\n");
      out.write("            <form class=\"d-flex justify-content-between search-inner\" action=\"search\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"search_input\" placeholder=\"Search Here\" name=\"name\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn\"></button>\r\n");
      out.write("                <span class=\"ti-close\" id=\"close_search\" title=\"Close Search\"></span>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<!--::header part start::-->\r\n");
      out.write("<div class=\"main_menu home_menu\" style=\"position: fixed; margin-top: 80px; z-index: 1\" >\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row align-items-center\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("                    <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">     \r\n");
      out.write("                        <div class=\"\" style=\"margin: 10px;\">\r\n");
      out.write("                            <a href=\"profile\" class=\"genric-btn info\">Profile</a>\r\n");
      out.write("                            <a href=\"user-order\" class=\"genric-btn info\">Order</a>\r\n");
      out.write("                            <a href=\"profile-order-history\" class=\"genric-btn info\">OrderHistory</a>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Header part end-->");
      out.write("\r\n");
      out.write("        <div class=\"container-x2 container-margin\" style=\"margin-top:150px\">\r\n");
      out.write("                <button class =\"btn btn-light\"><a href=\"admin-product?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Back</a></button>\r\n");
      out.write("            <div class=\"table-responsive\" style=\"display:flex;\">               \r\n");
      out.write("                <div id=\"\" class=\"\" style=\"flex: 0 1 40%;\">\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                             <form action=\"admin-edit-product\" method=\"post\">\r\n");
      out.write("                                <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                                    <h4 class=\"modal-title\">Edit Employee</h4>\r\n");
      out.write("                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"modal-body\">\r\n");
      out.write("                                    <input  type=\"number\" class=\"form-control\" name=\"page\" required hidden value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    <input id=\"idprod\" type=\"number\" class=\"form-control\" name=\"idprod\" required hidden value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Image</label>\r\n");
      out.write("                                        <input id=\"imgDataEdit\" type=\"text\" class=\"form-control\" name=\"imgsrc\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Name</label>\r\n");
      out.write("                                        <input id=\"nameDataEdit\" type=\"text\" class=\"form-control\" name=\"nameprod\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Price</label>\r\n");
      out.write("                                        <input id=\"priceDataEdit\" type=\"number\" class=\"form-control\" name=\"priceprod\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Description</label>\r\n");
      out.write("                                        <textarea id=\"descDataEdit\" class=\"form-control\" required name=\"descprod\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>Quantity</label>\r\n");
      out.write("                                        <input id=\"quantityDataEdit\" type=\"number\" class=\"form-control\" name=\"quantityprod\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\t\t\t\t\t\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label>CategoryId</label>\r\n");
      out.write("                                        <input id=\"cateIdDataEdit\" type=\"number\" class=\"form-control\" name=\"cateidprod\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prodEdit.getCategoryId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                    </div>\t\t\t\t\t\r\n");
      out.write("                                </div>                                    \r\n");
      out.write("                                <div class=\"modal-footer\">\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>        \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Edit Modal HTML -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("        <!-- popper js -->\r\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("        <!-- bootstrap js -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- easing js -->\r\n");
      out.write("        <script src=\"js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("        <!-- swiper js -->\r\n");
      out.write("        <script src=\"js/swiper.min.js\"></script>\r\n");
      out.write("        <!-- swiper js -->\r\n");
      out.write("        <script src=\"js/masonry.pkgd.js\"></script>\r\n");
      out.write("        <!-- particles js -->\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("        <!-- slick js -->\r\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.counterup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"js/contact.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.form.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script src=\"js/mail-script.js\"></script>\r\n");
      out.write("        <script src=\"js/stellar.js\"></script>\r\n");
      out.write("        <script src=\"js/price_rangs.js\"></script>\r\n");
      out.write("        <!-- custom js -->\r\n");
      out.write("        <script src=\"js/custom.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span class=\"badge badge-danger\" style=\"font-size: 10px;\">0</span>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <span class=\"badge badge-danger\" style=\"font-size: 10px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()==0||sessionScope.carts==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <h1>List Cart is Empty</h1>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <div class=\"dropdown-cart-prod\">\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ct");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <div class=\"single_product\">\r\n");
          out.write("                                                        <div class=\"cart-css-div\" style=\"\r\n");
          out.write("                                                             border: 1px solid #c5c4c4;\r\n");
          out.write("                                                             display: flex;\r\n");
          out.write("                                                             align-items: center;\r\n");
          out.write("                                                             margin-bottom: 10px;\r\n");
          out.write("                                                             \">\r\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width:100px;height:100px;\" alt=\"\" class=\"cart-css\" style=\"\r\n");
          out.write("                                                                 max-width: 40%;\r\n");
          out.write("                                                                 margin-right: 10px;\r\n");
          out.write("                                                                 \">\r\n");
          out.write("                                                            <span>Name:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\r\n");
          out.write("                                                                Price:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\r\n");
          out.write("                                                                Quantity:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\r\n");
          out.write("                                                                <a href=\"delete-cart?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"genric-btn primary small\">Delete </a></span>                                                           \r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"log-sgin\">\r\n");
        out.write("                            <a href=\"profile\" class=\"genric-btn info \">USER</a>\r\n");
        out.write("                            <a href=\"logout\" class=\"genric-btn success\">Log-out</a>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"log-sgin\">\r\n");
        out.write("                            <a href=\"login.jsp\" class=\"genric-btn info\">Login</a>\r\n");
        out.write("                            <a href=\"register.jsp\" class=\"genric-btn success\">Sign-Up</a>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getRole()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <a href=\"user\" class=\"genric-btn info\">User</a>\r\n");
        out.write("                            <a href=\"admin-product\" class=\"genric-btn info\">Product</a>\r\n");
        out.write("                            <a href=\"admin-category\" class=\"genric-btn info\">Category</a>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
