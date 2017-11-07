<%--
  Created by IntelliJ IDEA.
  User: chrif
  Date: 24/08/2017
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: chrif
  Date: 14/08/2017
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>



<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                    <h1> Admin page</h1>
                  <p class="lead">This is the administration page</p>

            </div>

            <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>Welcome:${pageContext.request.userPrincipal.name}|
                <a href="<c:url value="/j_spring_security_logout"/> ">Logout</a>
            </h2>
            </c:if>

            <h3>
                <a href="<c:url value="/admin/employeInventory"/> ">Employe Inventory</a>
            </h3>

            <p>here you can view ,check and modify the employe inventory</p>

            <h3>
                <a href="<c:url value="/admin/clientInventory"/> ">Client Inventory</a>
            </h3>
            <p>here you can view ,check and modify the client inventory</p>

            <h3>
                <a href="<c:url value="/admin/missionInventory"/> ">Mission Inventory</a>
            </h3>
            <p>here you can view ,check and modify the Mission inventory</p>

            <h3>
                <a href="<c:url value="/admin/tacheInventory"/> ">Task Inventory</a>
            </h3>
            <p>here you can view ,check and modify the Task inventory</p>


    <%@include file="/WEB-INF/views/template/footer.jsp"%>

