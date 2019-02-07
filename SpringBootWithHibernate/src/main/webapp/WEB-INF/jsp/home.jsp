<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
</head>
<body>

<c:if test="${not empty users}">

<ul>
<c:forEach var="user" items="${users}">
	<li>${user.name}</li>
</c:forEach>

</ul>
${users}
</c:if>
</body>
</html>