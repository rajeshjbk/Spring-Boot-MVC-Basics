<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color: red; text-align: center">Student Registration
	Page</h1>
<%-- <frm:form action="register" method="POST" modelAttribute="st"> --%>
<frm:form modelAttribute="st">
	<table border="0" align="center" bgcolor="cyan">
		<tr>
			<td>sno::</td>
			<td><frm:input type='text' path="sno"/></td>
		</tr>

		<tr>
			<td>sname::</td>
			<td><frm:input type='text' path="sname" title="Enter Your Name"/></td>
		</tr>

		<tr>
			<td>sadd::</td>
			<td><frm:input type='text' path="sadd"/></td>
		</tr>

		<tr>
			<td>avg::</td>
			<td><frm:input type='text' path="avg"/></td>
		</tr>

		<tr>
			<td><input type="submit" value="register"></td>
			<td><input type='reset' name="cancel"></td>
		</tr>
	</table>
</frm:form>