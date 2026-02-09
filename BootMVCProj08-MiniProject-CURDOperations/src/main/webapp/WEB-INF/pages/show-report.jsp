<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="color: red; text-align: center">Report Page</h1>
<br>
<c:choose>
	<c:when test="${!empty listVO}">
		<table border="1" align="center" bgcolor="cyan">
			<tr bgcolor="yellow">
				<th>Id</th>
				<th>Name</th>
				<th>Address</th>
				<th>Specialization</th>
				<th>Fee</th>
				<th>Net Fee</th>
				<th>Operations</th>
			</tr>
			<c:forEach var="vo" items="${listVO}">
				<tr>
					<td>${vo.id}</td>
					<td>${vo.name}</td>
					<td>${vo.addrs}</td>
					<td>${vo.specialization}</td>
					<td>${vo.fee}</td>
					<td>${vo.netFee}</td>
					<td><a href="edit?no=${vo.id }"><img src="images/edit.jpg" width="30" height="30"></a>
					    &nbsp; &nbsp;
					    <a href="delete?no=${vo.id }" onclick="return confirm('Are You sure to Delete?')"><img src="images/delete.jpg" width="30" height="30"></a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">No Records Found</h1>
	</c:otherwise>
</c:choose>
<br>

<h2 style="text-align: center; color: red">${resultMsg}</h2>
<br>
<br>
<h1 style="text-align: center">
	<a href="add">Add Doctor <img src="images/add.png" width="100"
		height="150"></a>
</h1>

<h1 style="text-align: center">
	<a href="./">Home <img src="images/home.jpg" width="100"
		height="150"></a>
</h1>