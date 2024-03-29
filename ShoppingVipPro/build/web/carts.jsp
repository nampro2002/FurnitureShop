<%-- 
    Document   : carts
    Created on : Jul 5, 2022, 10:42:44 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zxx">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>aranaz</title>
        <link rel="icon" href="img/favicon.png">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- animate CSS -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- owl carousel CSS -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <!-- nice select CSS -->
        <link rel="stylesheet" href="css/nice-select.css">
        <!-- font awesome CSS -->
        <link rel="stylesheet" href="css/all.css">
        <!-- flaticon CSS -->
        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- font awesome CSS -->
        <link rel="stylesheet" href="css/magnific-popup.css">
        <!-- swiper CSS -->
        <link rel="stylesheet" href="css/slick.css">
        <link rel="stylesheet" href="css/price_rangs.css">
        <!-- style CSS -->
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <%@include file="components/navbarComponent.jsp" %>


        <!--================Home Banner Area =================-->
        <!-- breadcrumb start-->
        <section class="breadcrumb breadcrumb_bg">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-8">
                        <div class="breadcrumb_iner">
                            <div class="breadcrumb_iner_item">
                                <h2>Cart Products</h2>
                                <p>Home <span>-</span>Cart Products</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- breadcrumb start-->

        <!--================Cart Area =================-->
        <section class="cart_area padding_top">
            <div class="container">
                <div class="cart_inner">
                    <div class="table-responsive">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">Product</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Total</th>
                                    <th scope="col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items ="${carts}" var="ct">
                                <form action ="update-cart-quantity" method="post" class="submit">
                                    <tr>
                                    <input type="hidden" name="productId" value="${ct.value.product.id}">
                                    <input type="hidden" name="accountId" value="${sessionScope.account.getId()}">
                                    <td>
                                        <div class="media">
                                            <div class="d-flex">
                                                <img src="${ct.value.product.image}" alt="" style="max-width: 160px;max-height: 160px;" />
                                            </div>
                                            <div class="media-body">
                                                <p>${ct.value.product.name}</p>
                                            </div>
                                        </div>
                                    </td>
                                    <td>
                                        <h5>$${ct.value.product.price}</h5>
                                    </td>
                                    <td>    
                                        <input onchange="this.form.submit()" type="number" class="num" value="${ct.value.quantity}" name="quantity" style="max-width: 70px;">
                                    </td>
                                    <td>
                                        <h5>$${ct.value.product.price*ct.value.quantity}</h5>
                                    </td>
                                    <td>
                                        <a href="delete-cart?productId=${ct.value.product.id}&accountId=${sessionScope.account.getId()}" class="genric-btn danger radius">Delete</a>
                                    </td>
                                    </tr>
                                </form>
                            </c:forEach>
                            <!--              <tr>
                                            <td>
                                              <div class="media">
                                                <div class="d-flex">
                                                  <img src="img/product/single-product/cart-1.jpg" alt="" />
                                                </div>
                                                <div class="media-body">
                                                  <p>Minimalistic shop for multipurpose use</p>
                                                </div>
                                              </div>
                                            </td>
                                            <td>
                                              <h5>$360.00</h5>
                                            </td>
                                            <td>
                                              <div class="product_count">
                                                 <input type="text" value="1" min="0" max="10" title="Quantity:"
                                                  class="input-text qty input-number" />
                                                <button
                                                  class="increase input-number-increment items-count" type="button">
                                                  <i class="ti-angle-up"></i>
                                                </button>
                                                <button
                                                  class="reduced input-number-decrement items-count" type="button">
                                                  <i class="ti-angle-down"></i>
                                                </button> 
                                                <span class="input-number-decrement"> <i class="ti-angle-down"></i></span>
                                                <input class="input-number" type="text" value="1" min="0" max="10">
                                                <span class="input-number-increment"> <i class="ti-angle-up"></i></span>
                                              </div>
                                            </td>
                                            <td>
                                              <h5>$720.00</h5>
                                            </td>
                                          </tr>-->              
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <h5>TotalMoney</h5>
                                </td>
                                <td>
                                    <h5>$${totalMoney}</h5>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="checkout_btn_inner float-right">
                            <a class="btn_1" href="#">Continue Shopping</a>
                            <a class="btn_1 checkout_btn_1" href="cart-to-checkout?accountId=${sessionScope.account.getId()}">Proceed to checkout</a>
                        </div>
                    </div>
                </div>
        </section>
        <!--================End Cart Area =================-->

        <!--::footer_part start::-->
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
                                <form target="_blank"
                                      action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
                                      method="get" class="subscribe_form relative mail_part">
                                    <input type="email" name="email" id="newsletter-form-email" placeholder="Email Address"
                                           class="placeholder hide-on-focus" onfocus="this.placeholder = ''"
                                           onblur="this.placeholder = ' Email Address '">
                                    <button type="submit" name="submit" id="newsletter-submit"
                                            class="email_icon newsletter-submit button-contactForm">subscribe</button>
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
                                <P><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="ti-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></P>
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
        <!-- jquery -->
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
        <script src="js/stellar.js"></script>
        <script src="js/price_rangs.js"></script>
        <!-- custom js -->
        <script src="js/custom.js"></script>
    </body>

</html>