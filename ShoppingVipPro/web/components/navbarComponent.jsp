<%-- 
    Document   : navbarComponent
    Created on : Jul 6, 2022, 12:52:21 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--::header part start::-->
<header class="main_menu home_menu" style="position: fixed;">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-10">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <a class="navbar-brand" href="home"> <img src="img/logo.png" alt="logo"> </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="menu_icon"><i class="fas fa-bars"></i></span>
                    </button>

                    <div class="collapse navbar-collapse main-menu-item" id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="home">Home</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link" href="product">
                                    Shop
                                </a>                                
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown_3" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    pages
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdown_2">
                                    <a class="dropdown-item" href="login.html"> login</a>
                                    <a class="dropdown-item" href="tracking.html">tracking</a>
                                    <a class="dropdown-item" href="checkout.html">product checkout</a>
                                    <a class="dropdown-item" href="cart.html">shopping cart</a>
                                    <a class="dropdown-item" href="confirmation.html">confirmation</a>
                                    <a class="dropdown-item" href="elements.html">elements</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown_2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    blog
                                </a>                                
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" href="#">Contact</a>
                            </li>
                        </ul>
                    </div>
                    <div class="hearer_icon d-flex">
                        <a id="search_1" href="javascript:void(0)"><i class="fas fa-search"></i></a>
                        <a href=""><i class="fas fa-heart"></i></a>
                        <div class="dropdown cart">
                            <a href="cart">
                                <i class="fas fa-shopping-cart"></i> 
                                <c:choose>
                                    <c:when test="${sessionScope.carts.size()==0}">
                                        <span class="badge badge-danger" style="font-size: 10px;">0</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="badge badge-danger" style="font-size: 10px;">${sessionScope.carts.size()}</span>
                                    </c:otherwise>
                                </c:choose>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <div class="dropdown-cart">
                                    <c:choose>
                                        <c:when test="${sessionScope.carts.size()==0||sessionScope.carts==null}">
                                            <h1>List Cart is Empty</h1>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="dropdown-cart-prod">
                                                <c:forEach items ="${carts}" var="ct">
                                                    <div class="single_product">
                                                        <div class="cart-css-div" style="
                                                             border: 1px solid #c5c4c4;
                                                             display: flex;
                                                             align-items: center;
                                                             margin-bottom: 10px;
                                                             ">
                                                            <img src="${ct.value.product.image}" alt="" class="cart-css" style="
                                                                 max-width: 40%;
                                                                 margin-right: 10px;
                                                                 ">
                                                            <span>Name:${ct.value.product.name}<br>
                                                                Price:${ct.value.product.price}<br>
                                                                Quantity:${ct.value.quantity}<br>
                                                                <a href="delete-cart?productId=${ct.value.product.id}" class="genric-btn primary small">Delete </a></span>                                                           
                                                        </div>
                                                    </div>
                                                </c:forEach>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <div class="view-cart-btn">
                                        <a href="#" class="genric-btn success large">View Cart</a>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </nav>
                <c:choose>
                    <c:when test="${sessionScope.account != null}">
                        <div class="log-sgin">
                            <a href="profile?accountId=${sessionScope.account.getId()}" class="genric-btn info ">USER</a>
                            <a href="logout" class="genric-btn success">Log-out</a>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div class="log-sgin">
                            <a href="login.jsp" class="genric-btn info">Login</a>
                            <a href="register.jsp" class="genric-btn success">Sign-Up</a>
                        </div>
                    </c:otherwise>
                </c:choose>

            </div>
        </div>
    </div>
    <div class="search_input" id="search_input_box">
        <div class="container ">
            <form class="d-flex justify-content-between search-inner">
                <input type="text" class="form-control" id="search_input" placeholder="Search Here">
                <button type="submit" class="btn"></button>
                <span class="ti-close" id="close_search" title="Close Search"></span>
            </form>
        </div>
    </div>

</header>
<!-- Header part end-->