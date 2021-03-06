<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>
	<a href="<spring:url value="/home" htmlEscape="true" />"> MedIS</a>
</h1>

<div class="navbar menu">
	<div class="navbar-inner"> 
		<div class="container">
			<ul class="nav nav-pills">
				<li><a href="<spring:url value="/home" htmlEscape="true" />">На головну сторінку</a></li>
				<li><a href="<spring:url value="/patientsList" htmlEscape="true" />">Паціенти</a></li>
				<li><a href="<spring:url value="/medicalCard" htmlEscape="true" />">Картки</a></li>
				<li><a href="<spring:url value="/doctorsList" htmlEscape="true" />">Дохтори</a></li>
				<li><a href="<spring:url value="/j_spring_security_logout" htmlEscape="true"/>" >Вилогуватись</a></li>
			</ul>
		</div>
	</div>
</div> 


