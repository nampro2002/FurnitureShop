<%-- 
    Document   : checkout
    Created on : Jul 7, 2022, 10:32:38 PM
    Author     : Admin
--%>

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
                                <h2>Producta Checkout</h2>
                                <p>Home <span>-</span> Shop Single</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- breadcrumb start-->

        <!--================Checkout Area =================-->
        <section class="checkout_area padding_top">
            <div class="container">

                <form class="row contact_form" action="checkout" method="post" novalidate="novalidate">
                    <div class="billing_details">
                        <div class="row">
                            <div class="col-lg-8">                                    
                                <h3>Billing Details</h3>
                                <input type="hidden"  name="accountId" value="${sessionScope.account.getId()}"/>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="first" name="firstname" value="${user.getFristName()}" placeholder="First name"required/>
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="last" name="lastname" value="${user.getLastName()}" placeholder="Last name"required/>
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="number" name="phone" value="${user.getPhone()}" placeholder="Phone number"required/>
                                </div>
                                <div class="col-md-6 form-group p_star">
                                    <input type="text" class="form-control" id="email" name="email" value="${user.getEmail()}" placeholder="Email Address" required/>
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="add1" name="address" value="${user.getAddress()}" placeholder="Address" required/>
                                </div>   
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="add1" name="detailaddress" placeholder="detail Address" required/>
                                </div>  
                                <div class="col-md-12 form-group">
                                    <div class="creat_account">
                                        <h3>Notes</h3>                                                
                                    </div>
                                    <textarea class="form-control" name="note" id="message" rows="1"
                                              placeholder="Order Notes"></textarea>
                                </div>                               

                            </div>
                            <div class="col-lg-4">
                                <div class="order_box">
                                    <h2>Your Order</h2>
                                    <ul class="list">
                                        <li>
                                            <a>Product
                                                <span>Total</span>
                                            </a>
                                        </li>
                                        <c:forEach items ="${carts}" var="ct">
                                            <li>
                                                <a ">${ct.value.product.name}
                                                    <span class="middle">x ${ct.value.quantity}</span>
                                                    <span class="last">$${ct.value.product.price*ct.value.quantity}</span>
                                                </a>
                                            </li>
                                        </c:forEach>  
                                    </ul>
                                    <ul class="list list_2">
                                        <li>
                                            <a ">Subtotal
                                                <span>$${totalMoney}</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a ">Shipping
                                                <span>Flat rate: $50.00</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a ">Total
                                                <span>$${totalMoney+50}</span>
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="payment_item" style="margin:20px 0">
                                        <input type="text" placeholder="Enter coupon code" style="padding: 5px;"/>
                                    </div>
                                    <h4>Phuong thuc thanh toan</h4>
                                    <div class="payment_item">
                                        <div class="radion_btn">
                                            <input type="radio" id="f-option5" name="selector" value ="cod"/>
                                            <label for="f-option5">COD</label>
                                            <div class="check"></div>
                                        </div>
                                        <p>
                                            Please send a check to Store Name, Store Street, Store Town,
                                            Store State / County, Store Postcode.
                                        </p>
                                    </div>
                                    <div class="payment_item active">
                                        <div class="radion_btn">
                                            <input type="radio" id="f-option6" name="selector" value ="pp" />
                                            <label for="f-option6">Chuyen khoan</label>
                                            <img src="img/product/single-product/card.jpg" alt="" />
                                            <div class="check"></div>
                                        </div>
                                        <p>
                                            Please send a check to Store Name, Store Street, Store Town,
                                            Store State / County, Store Postcode.
                                        </p>
                                    </div>
                                    <div class="creat_account" style="font-size: 12px;">
                                        <input type="checkbox" id="f-option4" name="terms" />
                                        <label for="f-option4">I’ve read and accept the </label>
                                        <a ">terms & conditions*</a>
                                    </div>
                                    <input class="btn_3" type ="submit" value="OK">
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </section>



        <!--================End Checkout Area =================-->

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
                                    <li><a " class="single_social_icon"><i class="fab fa-facebook-f"></i></a></li>
                                    <li><a " class="single_social_icon"><i class="fab fa-twitter"></i></a></li>
                                    <li><a " class="single_social_icon"><i class="fas fa-globe"></i></a></li>
                                    <li><a " class="single_social_icon"><i class="fab fa-behance"></i></a></li>
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