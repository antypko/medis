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
    
    <spring:url value="/webjars/bootstrap/2.3.2/css/bootstrap.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"></link> 
    
    <spring:url value="/webjars/bootstrap/2.3.2/js/bootstrap.js" var="bootstrapJs"/>
    <script src="${bootstrapJs}"> </script>
    
    <spring:url value="/js/medicalCard.js" var="medicalCardJs"/>
    <script src="${medicalCardJs}"></script>
    
    <spring:url value="/js/patient.js" var="patientJs"/>
    <script src="${patientJs}"></script>
    
    <spring:url value="/css/main.css" var="mainCss"/>
    <link href="${mainCss}" rel="stylesheet"></link>

</head>