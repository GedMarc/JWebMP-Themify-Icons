module com.jwebmp.plugins.themify.icons {

	exports com.jwebmp.plugins.themify.icons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.themify.icons.ThemifyIconsPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsExclusionsModule;

	//opens com.jwebmp.plugins.themify to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.themify.icons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
