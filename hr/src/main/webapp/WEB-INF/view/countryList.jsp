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
		<a href="${pagaContext.request.contextPath}/addCountry">add Country</a>
	</div>

	<table border="1">
		<tr>
			<th>regionId</th>
			<th>regionName</th>
			<th>countryId</th>
			<th>countryName</th>
			<th>수정</th>
			<th>삭제</th>	
		</tr>

		<c:forEach var="C" items="${countryList}"> <!-- model에 넣어져있는 countryList값 -->
			<tr>
				<td>${C.REGIONID}</td>
				<td>${C.REGIONNAME}</td>
				<td>${C.COUNTRYID}</td>
				<td>${C.COUNTRYNAME}</td>
				<td><a href="${pageContext.request.contextPath}/modifyCountry?countryId=${C.COUNTRYID}&countryName=${C.COUNTRYNAME}">수정</a></td>
				<td><a href="${pageContext.request.contextPath}/removeCountry?countryId=${C.COUNTRYID}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>

	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html> 