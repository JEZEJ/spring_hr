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
	<!-- menu.jsp include jsp (include는 forward랑 동일한 기술) -->
	<div>
		<c:import url="/WEB-INF/view/inc/menu.jsp"></c:import>
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/addRegion">add region</a><!-- 추가폼으로 이동 -->
	</div>
	<table border="1">
		<tr>
			<th>regionId</th>
			<th>regionName</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="r" items="${list}"><!-- list에 저장되있는 값 빼주기 -->
			<tr>
				<td>${r.regionId}</td>
				<td>${r.regionName}</td>
				<td><a href="${pageContext.request.contextPath}/modifyRegion?regionId=${r.regionId}&regionName=${r.regionName}">수정</a></td>
				<td><a href="${pageContext.request.contextPath}/removeRegion?regionId=${r.regionId}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<!-- footer include -->
	<div>
	<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>