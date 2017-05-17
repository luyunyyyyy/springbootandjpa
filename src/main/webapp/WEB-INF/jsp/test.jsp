<%@ page import="com.luyunyyyyy.domain.Activity" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"

         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>

<head>

    <meta http-equiv="Content-Type"content="text/html; charset=UTF-8">

    <title>Insert title here</title>

</head>

<body>

<c:forEach var="obj" items="${test}">
    ${obj.activityDetail} <br>
</c:forEach>

页面显示内容

</body>

</html>