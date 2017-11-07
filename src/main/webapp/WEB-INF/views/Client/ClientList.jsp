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
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        List  Client
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i> Dashboard
                        </li>
                    </ol>
                    <div class="table-responsive">
                        <table class="table table-striped table-hover" >
                            <thead>
                            <tr class="bg-success">
                                <th>Photo</th>
                                <th>Nom</th>
                                <th>Prenom</th>
                                <th>Email</th>
                                <th>Login</th>
                                <th></th>
                            </tr>
                            </thead>
                                <c:forEach items="${clients}" var="client">
                                    <tr>
                                    <td><img src="<c:url value="/resources/images/client/${client.cli_id}.png"/>" alt="image" style="width:100px;height:70px"></td>
                                    <td>${client.nom_cli}</td>
                                    <td>${client.prenom_cli}</td>
                                    <td>${client.cli_email}</td>
                                    <td>${client.login}</td>

                                    <td><a href="<spring:url value="/viewClient/${client.cli_id}"/>">
                                    <span class="glyphicon glyphicon-info-sign"></span>
                                        </a>
                                        </td>

                                     </tr>
                                </c:forEach>

                        </table>

                    </div>

                </div>
            </div>
            

         
           

        </div>

    </div>
<%@include file="/WEB-INF/views/template/footer.jsp"%>

