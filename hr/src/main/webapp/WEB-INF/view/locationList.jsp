<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<c:import url="/WEB-INF/view/inc/menu.jsp"></c:import>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/addLocation">addLocation</a>
	</div>

	<table border="1">
		<tr>
			<th>regionId</th>
			<th>countryId</th>
			<th>locationId</th>
			<th>streetAddress</th>
			<th>postalCode</th>
			<th>stateProvince</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="C" items="${list}">
		<tr>
			<td>${C.REGIONID}</td>
			<td>${C.COUNTRYID}</td>
			<td>${C.LOCATIONID }</td>
			<td>${C.STREETADDRESS }</td>
			<td>${C.POSTALCODE }</td>
			<td>${C.STATEPROVINCE }</td>
			<td><a href="${pageContext.request.contextPath}/modifyLocation">수정</a></td>
			<td><a href="${pageContext.request.contextPath}/removeCountry">삭제</a></td>
		</tr>
		
		</c:forEach>
	</table>
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>