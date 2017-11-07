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
                        Mission Detail
                    </h1>
                    <p>Here is the detail information of the Mission</p>

                    <div class="container">
                        <div class="row">

                            <div class="col-md-5">

                                <p>
                                    <strong>Designation</strong> : ${mission.msn_designation}
                                </p>
                                <p>
                                    <strong>Etat</strong> : ${mission.msn_etat}
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

