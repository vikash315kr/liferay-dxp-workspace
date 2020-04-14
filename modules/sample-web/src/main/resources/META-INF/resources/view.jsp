<%@ include file="./init.jsp" %>
<c:choose>
	<c:when test="<%= isConfigured %>">
		<p>
			<b><liferay-ui:message key="modulewebaction.caption"/></b>
		</p>
	</c:when>
	<c:otherwise>
		<div class="alert alert-info portlet-configuration">
			<aui:a href="<%= portletDisplay.getURLConfiguration() %>" label="please-configure-this-portlet-to-make-it-visible-to-all-users" onClick="<%= portletDisplay.getURLConfigurationJS() %>" />
		</div>
	</c:otherwise>
</c:choose>	