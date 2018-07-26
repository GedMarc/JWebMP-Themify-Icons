module com.jwebmp.plugins.themify.icons {

	exports com.jwebmp.plugins.themify.icons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	opens com.jwebmp.plugins.themify to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.themify.icons to com.fasterxml.jackson.databind,com.jwebmp.core;
}
