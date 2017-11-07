<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                <h1>
                    Edit  Tache
                </h1>
                <p>Fill the below information to edit a Tache</p>

            </div>

            <form:form action="${pageContext.request.contextPath}/admin/editTache" method="post"
                       commandName="tache" enctype="multipart/form-data">
                <form:hidden path="tac_id" value="${tache.tac_id}"/>
                <div class="form-group">
                    <label for="desgnation">Designation</label> <br><br><form:errors path="nom_tac" cssStyle="color: red"/>
                    <form:input path="nom_tac" id="desgnation" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="desgnation">Timing</label> <br><br><form:errors path="timing" cssStyle="color: red"/>
                    <form:input path="timing" id="timing" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="etat">Etat</label>
                    <label class="checkbox-inline"><form:radiobutton path="etat_tac" id="etat" value="To DO " /> To DO </label>
                    <label class="checkbox-inline"><form:radiobutton path="etat_tac" id="etat" value="In progress" />In progress</label>
                    <label class="checkbox-inline"><form:radiobutton path="etat_tac" id="etat" value="Finish" /> Finish</label>
                </div>

                <br><br>
                <input type="submit" value="submit" class="btn btn-default">
                <a href="<c:url value="/admin/tacheInventory"/>" class="btn btn-default">Cancel</a>
            </form:form>


        </div></div>
    <%@include file="/WEB-INF/views/template/footer.jsp"%>

