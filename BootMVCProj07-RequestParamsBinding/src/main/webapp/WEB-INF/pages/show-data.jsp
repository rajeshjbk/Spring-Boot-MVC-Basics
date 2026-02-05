<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color:red; text-align:center">Result Page</h1>
<br><br>
<b>Request Param attributes:: ${param.sno}, ${param.sname} </b>
<br><br>
<b>Student Address:: </b><br>
<c:if test="${not empty paramValues.sadd}">
	<c:forEach var="add" items="${paramValues.sadd}">
		${add}<br>
	</c:forEach>
</c:if>

<br><br>

<b>Names::</b><br>
<c:if test="${not empty paramValues.namesSet}">
	<c:forEach var="name" items="${paramValues.namesSet}">
		${name}<br>
	</c:forEach>
</c:if>
