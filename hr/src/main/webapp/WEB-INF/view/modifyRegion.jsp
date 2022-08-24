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
	<form method="post"
		action="${pageContext.request.contextPath}/modifyRegion">
		<div>
			regionId : <input type="text" name="regionId" value="${list.regionId}" readonly="readonly">
		</div>
		<div>
			regionName : <input type="text" name="regionName" value="${list.regionName}">
		</div>
		<div>
			<button type="submit">modifyRegion</button>
		</div>
	</form>
	<div>
		<c:import url="/WEB-INF/view/inc/footer.jsp"></c:import>
	</div>
</body>
</html>