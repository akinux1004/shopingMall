<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
     
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="/resources/vendor/bootstrap/css/bootstrap.min.css?ver=1" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="/resources/css/shop-homepage.css?ver=1" rel="stylesheet">
  
  

</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Start Bootstrap</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container text-warning">

    <div class="row">

      <div class="col-lg-3">

        <h1 class="my-4">Shop Name</h1>
        <div class="list-group">
          <a href="#" class="list-group-item">Category 1</a>
          <a href="#" class="list-group-item">Category 2</a>
          <a href="#" class="list-group-item">Category 3</a>
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">

        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid" src="/resources/img/test1.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>

	        
<!-- page -->
    <div class="row"> 
    

<c:forEach items="${list }" var="list" varStatus="status">
	<div class="col-lg-4 col-md-6 mb-4">
     <div class="card h-100">
       <a href="#"><img class="card-img-top" src="/resources/img/test1.jpg" alt=""></a>
       <div class="card-body">
         <h4 class="card-title">
         <a href="#"><c:out value="${list.title }"/></a>  
         </h4>
 		<h5>
           <fmt:formatNumber value="${list.price }" type="number" pattern="$#,###.##"/>		
         </h5>
         <p class="card-text">${list.content }</p>
         <p>${list.brand }</p>
       </div>
       <div class="card-footer">
         <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
       </div>
     </div>
    </div>
		
</c:forEach>
        
        
<%-- <c:forEach items="${list }" var="list" varStatus="status">
 <c:forEach items="${list.productList }" var="pList" varStatus="status">
  <c:if test="${status.index == 0}">
	<div class="col-lg-4 col-md-6 mb-4">
     <div class="card h-100">
       <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
       <div class="card-body">
         <h4 class="card-title">
         <a href="#"><c:out value="${list.title }"/></a>  
         </h4>
 		<h5>
           <fmt:formatNumber value="${pList.p_price }" type="number" pattern="$#,###.##"/>		
         </h5>
         <p class="card-text">${pList.p_name }</p>
         <p>${pList.p_size }</p>
       </div>
       <div class="card-footer">
         <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
       </div>
     </div>
   </div>
  </c:if>
 </c:forEach>
</c:forEach> 
 --%>

	   

<!-- end page -->



        </div><!-- /.row --> <!-- end list -->
        
	  </div><!-- /.col-lg-9 -->
      
    </div><!-- /.row -->
    
  </div><!-- /.container -->
  

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="/resources/vendor/jquery/jquery.min.js"></script>
  <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>




        
       	
        
