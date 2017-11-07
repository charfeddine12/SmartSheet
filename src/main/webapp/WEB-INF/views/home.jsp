<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
        <li data-target="#myCarousel" data-slide-to="5"></li>
        <li data-target="#myCarousel" data-slide-to="6"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide" src="<c:url value="../resources/images/backgound/1.png" />" alt="First slide">
        </div>
        <div class="item">
            <img class="second-slide" src="<c:url value="../resources/images/backgound/2.png" />" alt="Second slide">
        </div>
        <div class="item">
            <img class="third-slide" src="<c:url value="../resources/images/backgound/3.png" />" alt="Third slide">
        </div>
        <div class="item">
            <img class="third-slide" src="<c:url value="../resources/images/backgound/4.png" />" alt="Third slide">
        </div>
        <div class="item">
            <img class="third-slide" src="<c:url value="../resources/images/backgound/5.png" />" alt="Third slide">
        </div>
        <div class="item">
            <img class="third-slide" src="<c:url value="../resources/images/backgound/6.png" />" alt="Third slide">
        </div>
    </div>


    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div><!-- /.carousel -->


<%@include file="/WEB-INF/views/template/footer.jsp"%>
