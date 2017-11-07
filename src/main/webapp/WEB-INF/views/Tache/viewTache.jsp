<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div id="wrapper">

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Task Detail
                    </h1>
                    <p>Here is the detail information of the Task</p>

                    <div class="container">
                        <div class="row">

                            <div class="col-md-5">

                                <p>
                                    <strong>Designation</strong> : ${tache.nom_tac}
                                </p>
                                <p>
                                    <strong>Etat</strong> : ${tache.etat_tac}
                                </p>
                                <p>
                                    <strong>Timing</strong> : ${tache.timing}
                                </p>

                            </div>
                        </div>

                    </div>
                </div>



            </div>

        </div>
    </div>
    <!-- /#page-wrapper -->




<%@include file="/WEB-INF/views/template/footer.jsp"%>

