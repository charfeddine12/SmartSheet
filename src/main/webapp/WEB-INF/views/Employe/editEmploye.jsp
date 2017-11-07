<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                <h1>
                   Edit Employe
                </h1>
                <p>Fill the below information to edit a employe</p>

            </div>

            <form:form action="${pageContext.request.contextPath}/admin/editEmploye" method="post"
                       commandName="employe" enctype="multipart/form-data">
               <form:hidden path="emp_Id" value="${employe.emp_Id}"/>
                <div class="form-group">
                    <label for="name">Name</label>
                    <form:input path="nom_emp" id="name" class="form-Control" value="${employe.nom_emp}"/>
                </div>
                <div class="form-group">
                    <label for="Prenom">Prenom</label>
                    <form:input path="prenom_emp" id="prenom" class="form-Control" value="${employe.prenom_emp}"/>
                </div>
                <div class="form-group">
                    <label for="Email">Email</label>
                    <form:input path="email_emp" id="email" class="form-Control" value="${employe.email_emp}"/>
                </div>
                <div class="form-group">
                    <label for="Telephone">Telephone</label>
                    <form:input path="tel_emp" id="telephone" class="form-Control" value="${employe.tel_emp}"/>
                </div>
                <div class="form-group">
                    <label for="Login">Login</label>
                    <form:input path="login_emp" id="login" class="form-Control" value="${employe.login_emp}"/>
                </div>
                <div class="form-group">
                    <label for="Password">Password</label>
                    <form:input path="pwd_emp" id="password" class="form-Control" value="${employe.pwd_emp}"/>
                </div>
                <div class="form-group">
                    <label class="control-label" for="employeImage">Upload Picture</label>
                    <form:input id="employeImage" path="emp_img" type="file" class="form:input-large"/>
                </div>
                <br><br>
                <input type="submit" value="submit" class="btn btn-default">
                <a href="<c:url value="/admin/employeInventory"/>" class="btn btn-default">Cancel</a>

            </form:form>


        </div></div>
    <%@include file="/WEB-INF/views/template/footer.jsp"%>

