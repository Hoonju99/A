<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${empty id }">
		<p>Welcome Guest</p>
	</c:when>
	<c:otherwise>
		<h1>Welcome ${memberName}</h1>
	</c:otherwise>
</c:choose>
