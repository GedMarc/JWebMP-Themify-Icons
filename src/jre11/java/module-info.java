import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.themify.icons.ThemifyIconsPageConfigurator;
import com.jwebmp.plugins.themify.icons.implementations.ThemifyIconsExclusionsModule;

module com.jwebmp.plugins.themify.icons {

	exports com.jwebmp.plugins.themify.icons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with ThemifyIconsPageConfigurator;
	provides IGuiceScanModuleExclusions with ThemifyIconsExclusionsModule;
	provides IGuiceScanJarExclusions with ThemifyIconsExclusionsModule;

	//opens com.jwebmp.plugins.themify to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.themify.icons to com.fasterxml.jackson.databind, com.jwebmp.core;
}
