/**
 * 
 */
package com.cmpy.project.module.action.portlet.action;
import com.cmpy.project.module.action.constants.ModuleWebActionPortletKeys;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import org.osgi.service.component.annotations.Component;

/**
 * @author VIKAS
 *
 */
@Component(
		immediate = true,
		property = {"javax.portlet.name=" +  ModuleWebActionPortletKeys.MODULEWEBACTION},
		service = ConfigurationAction.class
	)
public class ModuleWebConfigurationAction extends DefaultConfigurationAction {
}
