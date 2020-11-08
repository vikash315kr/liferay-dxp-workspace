package com.cmpy.read.properties.web.action.portlet.util;

import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

public class PortletPropertyReaderUtil {
	
	//getConfiguration Object
    public static Configuration getConfiguration() 
    { 
    	Configuration configuration = ConfigurationFactoryUtil
    			.getConfiguration(PortalClassLoaderUtil.getClassLoader(), "portlet");
        return configuration; 
    } 
    
}
