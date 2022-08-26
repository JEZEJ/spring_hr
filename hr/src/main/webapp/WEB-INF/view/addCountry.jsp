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
	<form method="post" action="${pageContext.request.contextPath}/addCountry">

		regionId : <select name="regionId">
			<c:forEach items="${regionList}" var="r">
				<option value="${r.regionId}">${r.regionId}</option>
			</c:forEach>
		</select>



		<div>
			countryId : <input type="text" name="countryId">
		</div>
		<div>
			countryName : <input type="text" name="countryName">
		</div>
		<div>
			<button type="submit">addCountry</button>
		</div>
	</form>
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html> 