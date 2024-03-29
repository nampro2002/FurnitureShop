<%-- 
    Document   : search
    Created on : Jul 11, 2022, 9:31:15 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>aranoz</title>
        <link rel="icon" href="img/favicon.png">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- animate CSS -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- owl carousel CSS -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <!-- font awesome CSS -->
        <link rel="stylesheet" href="css/all.css">
        <!-- flaticon CSS -->
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- font awesome CSS -->
        <link rel="stylesheet" href="css/magnific-popup.css">
        <!-- swiper CSS -->
        <link rel="stylesheet" href="css/slick.css">
        <!-- style CSS -->
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/themify-icons-font/">
    </head>
    <body>
        <%@include file="components/navbarComponent.jsp" %>
        <br>        <br>
        <br>
        <br>


        <div class="container">
            <div style="margin: 30px 0;">
                <%
                            if (request.getAttribute("notice") == null) {
                %>
                <h2>All Products</h2>
                <%
                } else {
                %>
                <h2>${notice}</h2>
                <%
                    }
                %>
            </div>
            <div class="col-lg-12">
                <div class="row align-items-center justify-content-between">
                    <c:forEach items="${cart}" var="o">
                        <div class="col-lg-3 col-sm-12" style="margin:5px">
                            <div class="single_product_item">
                                <img src="${o.image}" style="width:300px;height:250px;" alt="">
                                <div class="single_product_text">
                                    <h4>${o.name}</h4>
                                    <h3>$${o.price}</h3>
                                    <a href="add-to-cart?productId=${o.id}" class="add_cart">+ add to cart<i class="ti-heart"></i></a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <footer class="footer_part">
            <div class="container">
                <div class="row justify-content-around">
                    <div class="col-sm-6 col-lg-2">
                        <div class="single_footer_part">
                            <h4>Top Products</h4>
                            <ul class="list-unstyled">
                                <li><a href="">Managed Website</a></li>
                                <li><a href="">Manage Reputation</a></li>
                                <li><a href="">Power Tools</a></li>
                                <li><a href="">Marketing Service</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-2">
                        <div class="single_footer_part">
                            <h4>Quick Links</h4>
                            <ul class="list-unstyled">
                                <li><a href="">Jobs</a></li>
                                <li><a href="">Brand Assets</a></li>
                                <li><a href="">Investor Relations</a></li>
                                <li><a href="">Terms of Service</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-2">
                        <div class="single_footer_part">
                            <h4>Features</h4>
                            <ul class="list-unstyled">
                                <li><a href="">Jobs</a></li>
                                <li><a href="">Brand Assets</a></li>
                                <li><a href="">Investor Relations</a></li>
                                <li><a href="">Terms of Service</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-2">
                        <div class="single_footer_part">
                            <h4>Resources</h4>
                            <ul class="list-unstyled">
                                <li><a href="">Guides</a></li>
                                <li><a href="">Research</a></li>
                                <li><a href="">Experts</a></li>
                                <li><a href="">Agencies</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-4">
                        <div class="single_footer_part">
                            <h4>Newsletter</h4>
                            <p>Heaven fruitful doesn't over lesser in days. Appear creeping
                            </p>
                            <div id="mc_embed_signup">
                                <form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="subscribe_form relative mail_part">
                                    <input type="email" name="email" id="newsletter-form-email" placeholder="Email Address" class="placeholder hide-on-focus" onfocus="this.placeholder = ''" onblur="this.placeholder = ' Email Address '">
                                    <button type="submit" name="submit" id="newsletter-submit" class="email_icon newsletter-submit button-contactForm">subscribe</button>
                                    <div class="mt-10 info"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div class="copyright_part">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-8">
                            <div class="copyright_text">
                                <P>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    Copyright &copy;
                                    <script>
                                        document.write(new Date().getFullYear());
                                    </script> All rights reserved | This template is made with <i class="ti-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                </P>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="footer_icon social_icon">
                                <ul class="list-unstyled">
                                    <li><a href="#" class="single_social_icon"><i class="fab fa-facebook-f"></i></a></li>
                                    <li><a href="#" class="single_social_icon"><i class="fab fa-twitter"></i></a></li>
                                    <li><a href="#" class="single_social_icon"><i class="fas fa-globe"></i></a></li>
                                    <li><a href="#" class="single_social_icon"><i class="fab fa-behance"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!--::footer_part end::-->

        <!-- jquery plugins here-->
        <script src="js/jquery-1.12.1.min.js"></script>
        <!-- popper js -->
        <script src="js/popper.min.js"></script>
        <!-- bootstrap js -->
        <script src="js/bootstrap.min.js"></script>
        <!-- easing js -->
        <script src="js/jquery.magnific-popup.js"></script>
        <!-- swiper js -->
        <script src="js/swiper.min.js"></script>
        <!-- swiper js -->
        <script src="js/masonry.pkgd.js"></script>
        <!-- particles js -->
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <!-- slick js -->
        <script src="js/slick.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/waypoints.min.js"></script>
        <script src="js/contact.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/jquery.form.js"></script>
        <script src="js/jquery.validate.min.js"></script>
        <script src="js/mail-script.js"></script>
        <!-- custom js -->
        <script src="js/custom.js"></script>
    </body>
</html>
