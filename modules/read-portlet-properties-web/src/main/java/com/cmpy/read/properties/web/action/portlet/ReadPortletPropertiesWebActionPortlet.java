package com.cmpy.read.properties.web.action.portlet;

import com.cmpy.read.properties.web.action.portlet.util.PortletPropertyReaderUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.cmpy.read.properties.web.action.constants.ReadPortletPropertiesWebActionPortletKeys;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ReadPortletPropertiesWebAction",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ReadPortletPropertiesWebActionPortletKeys.READPORTLETPROPERTIESWEBACTION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ReadPortletPropertiesWebActionPortlet extends MVCPortlet {
	private static Log log = LogFactoryUtil.getLog(ReadPortletPropertiesWebActionPortlet.class);
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		String dynamicElements = PortletPropertyReaderUtil.getConfiguration().get("dynamic-elements");
		String externalDBName = PortletPropertyReaderUtil.getConfiguration().get("external-database-name");
		String externalDBURL = PortletPropertyReaderUtil.getConfiguration().get("external-database-url");
		
		log.info("ReadPortletPropertiesWebActionPortlet.doView() dynamicElements = " + dynamicElements);
		log.info("ReadPortletPropertiesWebActionPortlet.doView() externalDBName = " + externalDBName);
		log.info("ReadPortletPropertiesWebActionPortlet.doView() externalDBURL = " + externalDBURL);
		
		super.doView(renderRequest, renderResponse);
	}
}
