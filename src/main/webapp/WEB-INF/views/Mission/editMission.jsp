<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="page-header">

                <h1>
                    Edit Mission
                </h1>
                <p>Fill the below information to edit a Mission</p>

            </div>

            <form:form action="${pageContext.request.contextPath}/admin/editMission" method="post"
                       commandName="mission" enctype="multipart/form-data">
                <form:hidden path="msn_id" value="${mission. msn_id}"/>
                <div class="form-group">
                    <label for="desgnation">Designation</label> <br><br><form:errors path="msn_designation" cssStyle="color: red"/>
                    <form:input path="msn_designation" id="desgnation" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="etat">Etat</label>
                    <label class="checkbox-inline"><form:radiobutton path="msn_etat" id="etat" value="To DO " /> To DO </label>
                    <label class="checkbox-inline"><form:radiobutton path="msn_etat" id="etat" value="In progress" />In progress</label>
                    <label class="checkbox-inline"><form:radiobutton path="msn_etat" id="etat" value="accessory" /> Finish</label>
                </div>

                <br><br>
                <input type="submit" value="submit" class="btn btn-default">
                <a href="<c:url value="/admin/missionInventory"/>" class="btn btn-default">Cancel</a>
            </form:form>


        </div></div>
    <%@include file="/WEB-INF/views/template/footer.jsp"%>

