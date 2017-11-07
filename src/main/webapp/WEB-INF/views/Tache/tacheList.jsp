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
                        List  Tache
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
                                <th>Designation</th>
                                <th>Etat</th>
                                <th>Timing</th>
                                <th></th>
                            </tr>
                            </thead>
                                <c:forEach items="${taches}" var="tache">
                                    <tr>
                                    <td>${tache.nom_tac}</td>
                                    <td>${tache.etat_tac}</td>
                                    <td>${tache.timing}</td>

                                    <td><a href="<spring:url value="/viewTache/${tache.tac_id}"/>">
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

