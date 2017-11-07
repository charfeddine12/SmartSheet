<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                    <h1>
                       Add Tache
                    </h1>
                    <p>Fill the below information to add Tache</p>

                </div>

              <form:form action="${pageContext.request.contextPath}/admin/addTache" method="post" commandName="tache" enctype="multipart/form-data">

                  <div class="form-group">
                      <label for="designation">Designation</label> <br><br><form:errors path="nom_tac" cssStyle="color: red"/>
                      <form:input path="nom_tac" id="designation" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="designation">Timing</label> <br><br><form:errors path="timing" cssStyle="color: red"/>
                      <form:input path="timing" id="timing" class="form-Control"/>
                  </div>
                  <div class="form-group">
                      <label for="etat">Etat</label>
                      <label class="checkbox-inline"><form:radiobutton path="etat_tac" id="etat" value="To DO" /> To DO </label>
                      <label class="checkbox-inline"><form:radiobutton path="etat_tac" id="etat" value="In progress" />In progress</label>
                      <label class="checkbox-inline"><form:radiobutton path="etat_tac" id="etat" value="Finish" /> Finish</label>
                  </div>
                  <br><br>
                  <input type="submit" value="submit" class="btn btn-default">
                  <a href="<c:url value="/admin/tacheInventory"/>" class="btn btn-default">Cancel</a>

              </form:form>


</div></div>
    <%@include file="/WEB-INF/views/template/footer.jsp"%>

