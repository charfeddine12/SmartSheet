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
                        Client Detail
                    </h1>
                    <p>Here is the detail information of the Client</p>

                    <div class="container">
                        <div class="row">
                            <div class="col-md-5">
                                <img src="/resources/images/client/${client.cli_id}.png" alt="image" style="width: 100%;height:300px"/>
                            </div>
                            <div class="col-md-5">

                                <p>
                                    <strong>Nom</strong> : ${client.nom_cli}
                                </p>
                                <p>
                                    <strong>Prenom</strong> : ${client.prenom_cli}
                                </p>
                                <p>
                                    <strong>Email</strong> : ${client.cli_email}
                                </p>
                                <p>
                                    <strong>Hours</strong> : ${client.hours}
                                </p>
                                <p>
                                    <strong>Login</strong> : ${client.login}
                                </p>
                                <p>
                                    <strong>Password</strong> : ${client.password}
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

