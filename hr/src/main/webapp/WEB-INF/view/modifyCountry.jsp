<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- menu.jsp include -->
	<div>
		<c:import url="/WEB-INF/view/inc/menu.jsp"></c:import>
	</div>
	<hr>
	<form method="post" action="${pageContext.request.contextPath}/modifyCountry">
		<div>
			countryId:
			<input type="text" name="countryId" value="${country.countryId}" readonly >
		</div>
		<div>
			countryName:
			<input type="text" name="countryName">
		</div>
		<div>
			regionId:
			<input type="text" name="regionId">
		</div>
		<div>
			<button type="submit">modify Country</button>
		</div>
	</form>
	<!-- footer include -->
	<hr>
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>