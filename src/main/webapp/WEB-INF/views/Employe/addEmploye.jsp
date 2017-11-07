<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                    <h1>
                       Add Employe
                    </h1>
                    <p>Fill the below information to add a employe</p>

                </div>

              <form:form action="${pageContext.request.contextPath}/admin/addEmploye" method="post" commandName="employe" enctype="multipart/form-data">
                  <div class="form-group">
                      <label for="name">Name</label> <br><br><form:errors path="nom_emp" cssStyle="color: red"/>
                      <form:input path="nom_emp" id="name" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="Prenom">Prenom</label><br><br> <form:errors path="prenom_emp" cssStyle="color: red"/>
                      <form:input path="prenom_emp" id="prenom" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="Email">Email</label><br><br> <form:errors path="email_emp" cssStyle="color: red"/>
                      <form:input path="email_emp" id="email" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="Telephone">Telephone</label><br><br><form:errors path="tel_emp" cssStyle="color: red"/>
                      <form:input path="tel_emp" id="telephone" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="Login">Login</label><br><br><form:errors path="login_emp" cssStyle="color: red"/>
                      <form:input path="login_emp" id="login" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="Password">Password</label><br><br><form:errors path="pwd_emp" cssStyle="color: red"/>
                      <form:input path="pwd_emp" id="password" class="form-Control"/>
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

