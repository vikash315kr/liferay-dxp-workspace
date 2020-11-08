<%@page import="com.cmpy.read.properties.web.action.portlet.util.PortletPropertyReaderUtil"%>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="readportletpropertieswebaction.caption"/></b>
</p>

<%
String dynamicElements = PortletPropertyReaderUtil.getConfiguration().get("dynamic-elements");
String externalDBName = PortletPropertyReaderUtil.getConfiguration().get("external-database-name");
String externalDBURL = PortletPropertyReaderUtil.getConfiguration().get("external-database-url");
%>

Dynamic Elements :: <%=dynamicElements %>
<br/>
External Database Name :: <%=externalDBName %>
<br/>
External Database URL :: <%=externalDBURL %>