import com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsInclusionModule;

module com.jwebmp.plugins.themify.icons {

	exports com.jwebmp.plugins.themify.icons;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.themify.icons.ThemifyIconsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with ThemifyIconsInclusionModule;
	
	//opens com.jwebmp.plugins.themify to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.themify.icons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
