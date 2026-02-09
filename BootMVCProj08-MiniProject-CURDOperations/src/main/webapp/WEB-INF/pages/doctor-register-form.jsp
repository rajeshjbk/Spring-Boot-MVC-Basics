<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color:red; text-align:center"> New Doctor Registration Page</h1> <br>

<frm:form modelAttribute="docVO">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
			<td>Doctor Name::</td>
			<td><frm:input type="text" path="name" /></td>
		</tr>

		<tr>
			<td>Doctor Address::</td>
			<td><frm:input type="text" path="addrs" /></td>
		</tr>

		<tr>
			<td>Doctor Specialization::</td>
			<td><frm:input type="text" path="specialization" /></td>
		</tr>

		<tr>
			<td>Doctor Fee::</td>
			<td><frm:input type="text" path="fee" /></td>
		</tr>
		<tr>
		   <td><input type="submit" value="Register"></td>
		   <td><input type="reset" value="Cancel"></td>
		</tr>
		
	</table>
</frm:form>