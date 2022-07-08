package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/components/navBarProfile.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Bootstrap CRUD Data Table for Database with Modal Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"icon\" href=\"img/favicon.png\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- animate CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- owl carousel CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <!-- font awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.css\">\n");
      out.write("        <!-- flaticon CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("        <!-- font awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <!-- swiper CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slick.css\">\n");
      out.write("        <!-- style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/profile_css.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                color: #566787;\n");
      out.write("                background: #f5f5f5;\n");
      out.write("                font-family: 'Varela Round', sans-serif;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .table-responsive {\n");
      out.write("                margin: 30px 0;\n");
      out.write("            }\n");
      out.write("            .table-wrapper {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px 25px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                min-width: 1000px;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .table-title {\n");
      out.write("                padding-bottom: 15px;\n");
      out.write("                background: #435d7d;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 16px 30px;\n");
      out.write("                min-width: 100%;\n");
      out.write("                margin: -20px -25px 10px;\n");
      out.write("                border-radius: 3px 3px 0 0;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 5px 0 0;\n");
      out.write("                font-size: 24px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn-group {\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .table-title .btn {\n");
      out.write("                color: #fff;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border: none;\n");
      out.write("                min-width: 50px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                border: none;\n");
      out.write("                outline: none !important;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn i {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 21px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("            .table-title .btn span {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 2px;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #e9e9e9;\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("            }\n");
      out.write("            table.table tr th:first-child {\n");
      out.write("                width: 60px;\n");
      out.write("            }\n");
      out.write("            table.table tr th:last-child {\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("                background-color: #fcfcfc;\n");
      out.write("            }\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\n");
      out.write("                background: #f5f5f5;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            table.table td:last-child i {\n");
      out.write("                opacity: 0.9;\n");
      out.write("                font-size: 22px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("            }\n");
      out.write("            table.table td a {\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #566787;\n");
      out.write("                display: inline-block;\n");
      out.write("                text-decoration: none;\n");
      out.write("                outline: none !important;\n");
      out.write("            }\n");
      out.write("            table.table td a:hover {\n");
      out.write("                color: #2196F3;\n");
      out.write("            }\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #F44336;\n");
      out.write("            }\n");
      out.write("            table.table td i {\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            table.table .avatar {\n");
      out.write("                border-radius: 50%;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .pagination {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 0 5px;\n");
      out.write("            }\n");
      out.write("            .pagination li a {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 13px;\n");
      out.write("                min-width: 30px;\n");
      out.write("                min-height: 30px;\n");
      out.write("                color: #999;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                border-radius: 2px !important;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 0 6px;\n");
      out.write("            }\n");
      out.write("            .pagination li a:hover {\n");
      out.write("                color: #666;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a, .pagination li.active a.page-link {\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a:hover {\n");
      out.write("                background: #0397d6;\n");
      out.write("            }\n");
      out.write("            .pagination li.disabled i {\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("            .pagination li i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding-top: 6px\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            /* Custom checkbox */\n");
      out.write("            .custom-checkbox {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"] {\n");
      out.write("                opacity: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                margin: 5px 0 0 3px;\n");
      out.write("                z-index: 9;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox label:before{\n");
      out.write("                width: 18px;\n");
      out.write("                height: 18px;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox label:before {\n");
      out.write("                content: '';\n");
      out.write("                margin-right: 10px;\n");
      out.write("                display: inline-block;\n");
      out.write("                vertical-align: text-top;\n");
      out.write("                background: white;\n");
      out.write("                border: 1px solid #bbb;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("                content: '';\n");
      out.write("                position: absolute;\n");
      out.write("                left: 6px;\n");
      out.write("                top: 3px;\n");
      out.write("                width: 6px;\n");
      out.write("                height: 11px;\n");
      out.write("                border: solid #000;\n");
      out.write("                border-width: 0 3px 3px 0;\n");
      out.write("                transform: inherit;\n");
      out.write("                z-index: 3;\n");
      out.write("                transform: rotateZ(45deg);\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:before {\n");
      out.write("                border-color: #03A9F4;\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:checked + label:after {\n");
      out.write("                border-color: #fff;\n");
      out.write("            }\n");
      out.write("            .custom-checkbox input[type=\"checkbox\"]:disabled + label:before {\n");
      out.write("                color: #b8b8b8;\n");
      out.write("                cursor: auto;\n");
      out.write("                box-shadow: none;\n");
      out.write("                background: #ddd;\n");
      out.write("            }\n");
      out.write("            /* Modal styles */\n");
      out.write("            .modal .modal-dialog {\n");
      out.write("                max-width: 400px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-header, .modal .modal-body, .modal .modal-footer {\n");
      out.write("                padding: 20px 30px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-content {\n");
      out.write("                border-radius: 3px;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-footer {\n");
      out.write("                background: #ecf0f1;\n");
      out.write("                border-radius: 0 0 3px 3px;\n");
      out.write("            }\n");
      out.write("            .modal .modal-title {\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .modal .form-control {\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: none;\n");
      out.write("                border-color: #dddddd;\n");
      out.write("            }\n");
      out.write("            .modal textarea.form-control {\n");
      out.write("                resize: vertical;\n");
      out.write("            }\n");
      out.write("            .modal .btn {\n");
      out.write("                border-radius: 2px;\n");
      out.write("                min-width: 100px;\n");
      out.write("            }\n");
      out.write("            .modal form label {\n");
      out.write("                font-weight: normal;\n");
      out.write("            }\n");
      out.write("            .container-margin{\n");
      out.write("                margin-top:100px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("                margin-right: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // Activate tooltip\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\n");
      out.write("                // Select/Deselect checkboxes\n");
      out.write("                var checkbox = $('table tbody input[type=\"checkbox\"]');\n");
      out.write("                $(\"#selectAll\").click(function () {\n");
      out.write("                    if (this.checked) {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = true;\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = false;\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                checkbox.click(function () {\n");
      out.write("                    if (!this.checked) {\n");
      out.write("                        $(\"#selectAll\").prop(\"checked\", false);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                                <a class=\"nav-link\" href=\"home\">Home</a>\n");
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
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <div class=\"dropdown-cart\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <div class=\"view-cart-btn\">\n");
      out.write("                                        <a href=\"#\" class=\"genric-btn success large\">View Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"search_input\" id=\"search_input_box\" style =\"margin-top: 58px\">\n");
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
      out.write("<!--::header part start::-->\n");
      out.write("<div class=\"main_menu home_menu\" style=\"position: fixed; margin-top: 80px\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">     \n");
      out.write("                        <div class=\"\" style=\"margin: 10px;\">\n");
      out.write("                            <a href=\"profile.jsp\" class=\"genric-btn info\">Profile</a>\n");
      out.write("                            <a href=\"profileOrder.jsp\" class=\"genric-btn info\">Order</a>\n");
      out.write("                            <a href=\"profileOrderHistory.jsp\" class=\"genric-btn info\">OrderHistory</a>\n");
      out.write("                            <a href=\"adminUser.jsp\" class=\"genric-btn info\">User</a>\n");
      out.write("                            <a href=\"adminProduct.jsp\" class=\"genric-btn info\">Product</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- Header part end-->");
      out.write("\n");
      out.write("        <div class=\"container-xl px-4 mt-4\">\n");
      out.write("            <!-- Account page navigation-->\n");
      out.write("            <nav class=\"nav nav-borders\">\n");
      out.write("                <a class=\"nav-link active ms-0\" href=\"https://www.bootdey.com/snippets/view/bs5-edit-profile-account-details\" target=\"__blank\">Profile</a>\n");
      out.write("                <a class=\"nav-link\" href=\"https://www.bootdey.com/snippets/view/bs5-profile-billing-page\" target=\"__blank\">Billing</a>\n");
      out.write("                <a class=\"nav-link\" href=\"https://www.bootdey.com/snippets/view/bs5-profile-security-page\" target=\"__blank\">Security</a>\n");
      out.write("                <a class=\"nav-link\" href=\"https://www.bootdey.com/snippets/view/bs5-edit-notifications-page\"  target=\"__blank\">Notifications</a>\n");
      out.write("            </nav>\n");
      out.write("            <hr class=\"mt-0 mb-4\">\n");
      out.write("            <div class=\"row\" style=\"margin-top:90px\">\n");
      out.write("                <div class=\"col-xl-4\">\n");
      out.write("                    <!-- Profile picture card-->\n");
      out.write("                    <div class=\"card mb-4 mb-xl-0\">\n");
      out.write("                        <div class=\"card-header\">Profile Picture</div>\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <!-- Profile picture image-->\n");
      out.write("                            <img class=\"img-account-profile rounded-circle mb-2\" src=\"http://bootdey.com/img/Content/avatar/avatar1.png\" alt=\"\">\n");
      out.write("                            <!-- Profile picture help block-->\n");
      out.write("                            <div class=\"small font-italic text-muted mb-4\">JPG or PNG no larger than 5 MB</div>\n");
      out.write("                            <!-- Profile picture upload button-->\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"button\">Upload new image</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card mb-4 mb-xl-0\">\n");
      out.write("                        <div class=\"card-header\">Profile Picture</div>\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <!-- Profile picture image-->\n");
      out.write("                            <div class=\"row gx-3 mb-3\">\n");
      out.write("                                <!-- Form Group (first name)-->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputFirstName\">Old Password</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"inputFirstName\" type=\"text\" placeholder=\"Old Password\">\n");
      out.write("                                </div>    \n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Row        -->\n");
      out.write("                            <div class=\"row gx-3 mb-3\">\n");
      out.write("                                <!-- Form Group (organization name)-->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputOrgName\">New Password</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"inputOrgName\" type=\"text\" placeholder=\"New Password\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Row        -->\n");
      out.write("                            <div class=\"row gx-3 mb-3\">\n");
      out.write("                                <!-- Form Group (organization name)-->\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputOrgName\">Confirm New Password</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"inputOrgName\" type=\"text\" placeholder=\"Confirm New Password\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Profile picture upload button-->\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"button\">Save changes</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-8\">\n");
      out.write("                    <!-- Account details card-->\n");
      out.write("                    <div class=\"card mb-4\">\n");
      out.write("                        <div class=\"card-header\">Account Details</div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form>\n");
      out.write("                                <!-- Form Group (username)-->\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputUsername\">Username</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"inputUsername\" type=\"text\" placeholder=\"Enter your username\" >\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Row-->\n");
      out.write("                                <div class=\"row gx-3 mb-3\">\n");
      out.write("                                    <!-- Form Group (first name)-->\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label class=\"small mb-1\" for=\"inputFirstName\">First name</label>\n");
      out.write("                                        <input class=\"form-control\" id=\"inputFirstName\" type=\"text\" placeholder=\"Enter your first name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getFristName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Form Group (last name)-->\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label class=\"small mb-1\" for=\"inputLastName\">Last name</label>\n");
      out.write("                                        <input class=\"form-control\" id=\"inputLastName\" type=\"text\" placeholder=\"Enter your last name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Row        -->\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputEmailAddress\">Address</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"inputEmailAddress\" type=\"text\" placeholder=\"Address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getBirthday()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Group (email address)-->\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputEmailAddress\">Email address</label>\n");
      out.write("                                    <input class=\"form-control\" id=\"inputEmailAddress\" type=\"email\" placeholder=\"Enter your email address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Row-->\n");
      out.write("                                <div class=\"row gx-3 mb-3\">\n");
      out.write("                                    <!-- Form Group (phone number)-->\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label class=\"small mb-1\" for=\"inputPhone\">Phone number</label>\n");
      out.write("                                        <input class=\"form-control\" id=\"inputPhone\" type=\"tel\" placeholder=\"Enter your phone number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Form Group (birthday)-->\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label class=\"small mb-1\" for=\"inputBirthday\">Birthday</label>\n");
      out.write("                                        <input class=\"form-control\" id=\"inputBirthday\" type=\"date\" name=\"birthday\" placeholder=\"Enter your birthday\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>                                \n");
      out.write("                                <!-- Save changes button-->\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">Save changes</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
      out.write("        <script src=\"js/jquery-1.12.1.min.js\"></script>\n");
      out.write("        <!-- popper js -->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <!-- bootstrap js -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- easing js -->\n");
      out.write("        <script src=\"js/jquery.magnific-popup.js\"></script>\n");
      out.write("        <!-- swiper js -->\n");
      out.write("        <script src=\"js/swiper.min.js\"></script>\n");
      out.write("        <!-- swiper js -->\n");
      out.write("        <script src=\"js/masonry.pkgd.js\"></script>\n");
      out.write("        <!-- particles js -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <!-- slick js -->\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"js/contact.js\"></script>\n");
      out.write("        <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.form.js\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"js/mail-script.js\"></script>\n");
      out.write("        <script src=\"js/stellar.js\"></script>\n");
      out.write("        <script src=\"js/price_rangs.js\"></script>\n");
      out.write("        <!-- custom js -->\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("    </body>\n");
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
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
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
        out.write("\n");
        out.write("                                        <span class=\"badge badge-danger\" style=\"font-size: 10px;\">0</span>\n");
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
        out.write("\n");
        out.write("                                        <span class=\"badge badge-danger\" style=\"font-size: 10px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
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
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
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
        out.write("\n");
        out.write("                                            <h1>List Cart is Empty</h1>\n");
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
        out.write("\n");
        out.write("                                            <div class=\"dropdown-cart-prod\">\n");
        out.write("                                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            </div>\n");
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
          out.write("\n");
          out.write("                                                    <div class=\"single_product\">\n");
          out.write("                                                        <div class=\"cart-css-div\" style=\"\n");
          out.write("                                                             border: 1px solid #c5c4c4;\n");
          out.write("                                                             display: flex;\n");
          out.write("                                                             align-items: center;\n");
          out.write("                                                             margin-bottom: 10px;\n");
          out.write("                                                             \">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"cart-css\" style=\"\n");
          out.write("                                                                 max-width: 60%;\n");
          out.write("                                                                 margin-right: 10px;\n");
          out.write("                                                                 \">\n");
          out.write("                                                            <span>Name:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                                                                Price:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                                                                Quantity:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                                                                <a href=\"delete-cart?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"genric-btn primary small\">Delete </a></span>                                                           \n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
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
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
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
        out.write("\n");
        out.write("                         <a href=\"#\" class=\"genric-btn info user-log\">USER</a>\n");
        out.write("                          <a href=\"logout\" class=\"genric-btn success\">Log-out</a>\n");
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
        out.write("\n");
        out.write("                        <div class=\"log-sgin\">\n");
        out.write("                            <a href=\"login.jsp\" class=\"genric-btn info\">Login</a>\n");
        out.write("                            <a href=\"register.jsp\" class=\"genric-btn success\">Sign-Up</a>\n");
        out.write("                        </div>\n");
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
}
