module com.jwebmp.plugins.themify.icons {

	exports com.jwebmp.plugins.themify.icons;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.themify.icons.ThemifyIconsPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsExclusionsModule;

	//opens com.jwebmp.plugins.themify to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.themify.icons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
