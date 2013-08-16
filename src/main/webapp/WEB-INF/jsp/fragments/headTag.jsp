<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Medis</title>

    <spring:url value="/webjars/jquery/2.0.2/jquery.js" var="jQuery"/>
    <script src="${jQuery}"></script>
    
  	<spring:url value="/webjars/jquery-ui/1.9.2/js/jquery-ui-1.9.2.custom.js" var="jQueryUi"/>
  	<script src="${jQueryUi}"></script> 
    
    <spring:url value="/webjars/jquery-ui/1.9.2/css/smoothness/jquery-ui-1.9.2.custom.css" var="jQueryUiCss"/>
    <link href="${jQueryUiCss}" rel="stylesheet"></link>
    
    <spring:url value="/webjars/bootstrap/2.3.2/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    
    <spring:url value="/js/medicalCard.js" var="medicalCard"/>
    <script src="${medicalCard}"></script>
    
    <spring:url value="/js/patient.js" var="patient"/>
    <script src="${patient}"></script>

</head>