<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="sp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color:red; text-align:center; "><sp:message code="cust.registration.title"/></h1>

<frm:form action="register" modelAttribute="cust">

<table align="center" bgcolor="cyan">
  <tr>
     <td><sp:message code="cust.registration.id"/></td>
     <td><frm:input path="cno"/></td>
  </tr>
  
  <tr>
     <td><sp:message code="cust.registration.name"/></td>
     <td><frm:input path="cname"/></td>
  </tr>
  
  <tr>
     <td><sp:message code="cust.registration.addrs"/></td>
     <td><frm:input path="cadd"/></td>
  </tr>
  
  <tr>
     <td><input type="submit" value="<sp:message code='cust.registration.submit'/>"/></td>
     <td><input type="reset" value="Cancel"/></td>
  </tr>
</table>  
</frm:form>

<br>

<center>

<a href="?lang=en_US">English</a> &nbsp; <a href="?lang=fr_FR">Français</a>
<a href="?lang=te_IN">తెలుగు</a> &nbsp; <a href="?lang=hi_IN">हिंदी</a>

</center>
