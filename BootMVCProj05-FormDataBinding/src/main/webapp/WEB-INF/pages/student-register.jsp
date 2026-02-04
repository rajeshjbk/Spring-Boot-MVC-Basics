<%@ page isELIgnored="false"%>

<h1 style="color: red; text-align: center">Student Registration
	Page</h1>
<form action="register" method="POST">

	<table border="0" align="center" bgcolor="cyan">
		<tr>
			<td>sno::</td>
			<td><input type='text' name="sno" placeholder="Enter Your Name:"></td>
		</tr>

		<tr>
			<td>sname::</td>
			<td><input type='text' name="sname"></td>
		</tr>

		<tr>
			<td>sadd::</td>
			<td><input type='text' name="sadd"></td>
		</tr>

		<tr>
			<td>avg::</td>
			<td><input type='text' name="avg"></td>
		</tr>

		<tr>
			<td><input type="submit" value="register"></td>
			<td><input type='reset' name="cancel"></td>
		</tr>
	</table>
</form>