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
	<form action="${pageContext.request.contextPath}/modifyCountry">

		<div>
			countryId : <input type="text" name="countryId"
				value="${list.countryId}" readonly="readonly">
		</div>
		<div>
			countryName : <input type="text" name="countryName"
				value="${list.countryName}">
		</div>
		<div>
			<button type="submit">modifyCountry</button>
		</div>
	</form>
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>