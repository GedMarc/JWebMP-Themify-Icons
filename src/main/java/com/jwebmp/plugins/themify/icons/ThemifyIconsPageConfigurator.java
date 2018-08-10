package com.jwebmp.plugins.themify.icons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * Configures the page for themify icons
 */
public class ThemifyIconsPageConfigurator
		implements IPageConfigurator
{
	/**
	 * Field reference
	 */
	private static final CSSReference reference = new CSSReference("ThemifyIcons", 5.23, "themify-icons/themify-icons.min.css");

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
		if (!page.isConfigured())
		{
			page.addCssReference(reference);
		}
		return page;
	}
}
