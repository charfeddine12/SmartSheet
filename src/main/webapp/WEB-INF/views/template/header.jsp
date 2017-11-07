<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: chrif
  Date: 16/08/2017
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Smart-Sheet</title>

    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="../resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="../resources/css/main.css" />" rel="stylesheet">
<!--    <link href="<c:url value="../resources/css/carousel.css" />" rel="stylesheet"> -->


    <!-- Custom CSS -->
    <link href="<c:url value="../resources/css/sb-admin.css"/>" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<c:url value="../resources/css/plugins/morris.css"/>" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="../resources/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="/"/>">SMART SHEET</a>
        </div>
        <!-- Top Menu Items -->

        <div style="margin-right: 0px;position: absolute;right: 10px;top: 10px;">
            <a  href="<c:url value="/j_spring_security_logout"/>" ><em class="fa fa-user"></em> Logout </a></div>


        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="<c:url value="/admin"/>"><i class="fa fa-fw fa-dashboard"></i> Dashboard Admin</a>
                </li>
                <li>
                    <a href="<c:url value="/clientList"/>"><i class="fa fa-users"></i> Client</a>
                </li>
                <li>
                    <a href="<c:url value="/employeList"/>"><i class="fa fa-users"></i> Employee</a>
                </li>
                <li>
                    <a href="<c:url value="/missionList"/>"><i class="fa fa-fw fa-edit"></i> Mission</a>
                </li>
                <li>
                    <a href="<c:url value="/tacheList"/>"><i class="fa fa-fw fa-table"></i> Task</a>
                </li>



            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

</div>