<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h1><a href="<spring:url value="/home" htmlEscape="true" />">Головне лого</a></h1>
<div><a href="<spring:url value="/patientsList" htmlEscape="true" />">Паціенти</a></div>
<div><a href="<spring:url value="/medicalCard" htmlEscape="true" />">Картки</a></div>
