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
                        Employe Detail
                    </h1>
                    <p>Here is the detail information of the Employe</p>

                    <div class="container">
                        <div class="row">
                            <div class="col-md-5">
                                <img src="/resources/images/employe/${employe.emp_Id}.png" alt="image" style="width: 100%;height:300px"/>
                            </div>
                            <div class="col-md-5">

                                <p>
                                    <strong>Nom</strong> : ${employe.nom_emp}
                                </p>
                                <p>
                                    <strong>Prenom</strong> : ${employe.prenom_emp}
                                </p>
                                <p>
                                    <strong>Email</strong> : ${employe.email_emp}
                                </p>
                                <p>
                                    <strong>Telephone</strong> : ${employe.tel_emp}
                                </p>
                                <p>
                                    <strong>Login</strong> : ${employe.login_emp}
                                </p>
                                <p>
                                    <strong>Password</strong> : ${employe.pwd_emp}
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

