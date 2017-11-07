<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                <h1>
                    Edit Client
                </h1>
                <p>Fill the below information to edit a Client</p>

            </div>

            <form:form action="${pageContext.request.contextPath}/admin/editClient" method="post"
                       commandName="client" enctype="multipart/form-data">
                <form:hidden path="cli_id" value="${client.cli_id}"/>
                <div class="form-group">
                    <label for="name">Name</label> <br><br><form:errors path="nom_cli" cssStyle="color: red"/>
                    <form:input path="nom_cli" id="name" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="Prenom">Prenom</label><br><br> <form:errors path="prenom_cli" cssStyle="color: red"/>
                    <form:input path="prenom_cli" id="prenom" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="Email">Email</label><br><br> <form:errors path="cli_email" cssStyle="color: red"/>
                    <form:input path="cli_email" id="email" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="Login">Hours</label><br><br><form:errors path="hours" cssStyle="color: red"/>
                    <form:input path="hours" id="hours" class="form-Control"/>
                </div>

                <div class="form-group">
                    <label for="Login">Login</label><br><br><form:errors path="login" cssStyle="color: red"/>
                    <form:input path="login" id="login" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="Password">Password</label><br><br><form:errors path="password" cssStyle="color: red"/>
                    <form:input path="password" id="password" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label class="control-label" for="clientImage">Upload Picture</label>
                    <form:input id="clientImage" path="cli_img" type="file" class="form:input-large"/>
                </div>
                <br><br>
                <input type="submit" value="submit" class="btn btn-default">
                <a href="<c:url value="/admin/clientInventory"/>" class="btn btn-default">Cancel</a>
            </form:form>


        </div></div>
    <%@include file="/WEB-INF/views/template/footer.jsp"%>

