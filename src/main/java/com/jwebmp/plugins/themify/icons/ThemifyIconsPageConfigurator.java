package com.jwebmp.plugins.themify.icons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Configures the page for themify icons
 */
public class ThemifyIconsPageConfigurator
		implements IPageConfigurator<ThemifyIconsPageConfigurator>
{
	/**
	 * Field reference
	 */
	private static final CSSReference reference = new CSSReference("ThemifyIcons", 5.23, "themify-icons/themify-icons.min.css");
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return ThemifyIconsPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		ThemifyIconsPageConfigurator.enabled = mustEnable;
	}

	/**
	 * Configures the given page for the parameters
	 *
	 * @param page
	 * 		The page incoming
	 *
	 * @return The original page incoming or a new page, never null
	 */
	@NotNull
	@Override
	public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.addCssReference(ThemifyIconsPageConfigurator.reference);
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return ThemifyIconsPageConfigurator.enabled;
	}
}
