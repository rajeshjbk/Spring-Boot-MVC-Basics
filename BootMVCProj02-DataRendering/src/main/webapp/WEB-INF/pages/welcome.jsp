<%-- <%@page isELIgnored="false" import="java.util.*" %> --%>

<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">Welcome to Spring Boot
	MVC(Data Rendering)</h1>
<br>
<br>
<%-- <b>Model Attribute values are :: ${sysDate}, ${age} </b> --%>

<%-- <b>Model Attribute values are:: ${name}, ${age}, ${addrs}</b>
<br>
<b>Model Attribute values (arrays and collections)</b><br>
<b>fav colors ::<%=Arrays.toString((String[])request.getAttribute("favColors")) %> </b><br>
<b>friends :: ${friends}</b><br>
<b>phones :: ${phones}</b><br>
<b>idDetails :: ${idDetails}</b><br>
 --%>

<b>Model attributes are(Simple):: ${name}, ${age}, ${addrs}</b>
<br>

<b>Model Attribute values (Arrays and Collections)</b>
<br>

<c:if test="${!empty favColors}">
	<c:forEach var="fc" items="${favColors}">
    ${fc}<br>
	</c:forEach>
</c:if>
<br>
<br>

<c:if test="${!empty friends}">
	<c:forEach var="fr" items="${friends}">
    ${fr}<br>
	</c:forEach>
</c:if>
<br>
<br>

<c:if test="${!empty phones}">
	<c:forEach var="ph" items="${phones}">
    ${ph}<br>
	</c:forEach>
	<br>
	<br>
</c:if>

<c:if test="${!empty idDetails}">
	<c:forEach var="id" items="${idDetails}">
    ${id.key} &nbsp; &nbsp;${id.value}<br>
	</c:forEach>
</c:if>
<br>
<br>

<b>Model attributes (Model class obj)</b>
<c:if test="${!empty stud}">
${stud} <br>
${stud.sno}<br>
${stud.sname}<br>
</c:if>
<br>
<br>

<b>Model attributes (List of Model class objs)</b>

<c:choose>
	<c:when test="${!empty studList}">
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>sno</th>
				<th>sname</th>
				<th>sadd</th>
			</tr>
			<c:forEach var="st" items="${studList}">
				<tr>
					<td>${st.sno}</td>
					<td>${st.sname}</td>
					<td>${st.sadd}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
	  <h1 style="color:red">Records not found</h1>
	</c:otherwise>
</c:choose>
