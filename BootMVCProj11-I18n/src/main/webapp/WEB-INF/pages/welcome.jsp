<%@page isELIgnored="false" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<b>Current active Locale: ${pageContext.response.locale }</b>
<h1 style="color:green; text-align:center"><sp:message code="home.title" /></h1>

<h2 style="color:green; text-align:center"><a href="register"><sp:message code="home.link1" /></a></h2>

<fmt:setLocale value="${pageContext.response.locale}"/>

<fmt:formatDate var="fdate" value="${sysDate}" type="date" dateStyle="MEDIUM"/>
<b>Formatted Date: ${fdate}</b>
<br>
<fmt:formatDate var="ftime" value="${sysDate}" type="time" dateStyle="FULL"/>
<b>Formatted Time: ${ftime}</b>

<br>

<fmt:formatNumber var="fprice" value="${price}" type="currency"/>
<b>Formatted Money Value: ${fprice}</b>
<br>

<fmt:formatNumber var="fdistance" value="${distance}" type="number"/>
<b>Formatted Distance Value: ${fdistance}</b>
<br>

<fmt:formatNumber var="favg" value="${avg}" type="percent"/>
<b>Formatted Average Value: ${favg}</b>
<br>

<center>

<a href="?lang=en_US">English</a> &nbsp; <a href="?lang=fr_FR">Français</a>
<a href="?lang=te_IN">తెలుగు</a> &nbsp; <a href="?lang=hi_IN">हिंदी</a>

</center>




