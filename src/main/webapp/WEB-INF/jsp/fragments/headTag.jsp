<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Medis</title>

    <spring:url value="/webjars/jquery/2.0.2/jquery.js" var="jQuery"/>
    <script src="${jQuery}"></script>
    
    <spring:url value="/js/medicalCard.js" var="medicalCard"/>
    <script src="${medicalCard}"></script>
    
    <spring:url value="/js/patient.js" var="patient"/>
    <script src="${patient}"></script>

    <%-- <spring:url value="/webjars/jquery/1.9.0/jquery.js" var="jQuery"/>
    <script src="${jQuery}"></script> --%>
</head>