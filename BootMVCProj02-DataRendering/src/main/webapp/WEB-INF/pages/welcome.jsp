<%@page isELIgnored="false" import="java.util.*" %>

<h1 style="color:red; text-align:center"> Welcome to Spring Boot MVC(Data Rendering) </h1>
<br><br>
<%-- <b>Model Attribute values are :: ${sysDate}, ${age} </b> --%>
<b>Model Attribute values are:: ${name}, ${age}, ${addrs}</b>
<br>
<b>Model Attribute values (arrays and collections)</b><br>
<b>fav colors ::<%=Arrays.toString((String[])request.getAttribute("favColors")) %> </b><br>
<b>friends :: ${friends}</b><br>
<b>phones :: ${phones}</b><br>
<b>idDetails :: ${idDetails}</b><br>

