package com.jwebmp.plugins.themify.icons;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Configures the page for themify icons
 */
@PluginInformation(pluginName = "Themify Icons",
		pluginUniqueName = "themify",
		pluginDescription = "Themify Icons is a complete set of icons for use in web design and apps, consisting of 320+ pixel-perfect, " +
				"hand-crafted icons that draw inspiration from Apple iOS 7 - available to the public," +
				" 100% FREE! You may use or distribute it for any purpose, whether personal or commercial. " +
				"This icon set is a must have tool for web designers and developers.",
		pluginVersion = "3.4",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "icons,ui",
		pluginSubtitle = "Themify Icons is a complete set of icons for use in web design and apps",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Themify-Icons",
		pluginSourceUrl = "https://themify.me/themify-icons",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Themify-Icons/wiki",
		pluginOriginalHomepage = "https://themify.me/themify-icons",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-jquery-ui",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/14",
		pluginGroupId = "com.jwebmp.plugins.iconsets",
		pluginArtifactId = "jwebmp-themify-icons",
		pluginModuleName = "com.jwebmp.plugins.themify.icons",
		pluginStatus = PluginStatus.Released
)
public class ThemifyIconsPageConfigurator
		implements IPageConfigurator<ThemifyIconsPageConfigurator>
{
	/**
	 * Field reference
	 */
	private static final CSSReference reference = new CSSReference("ThemifyIcons", 3.4, "themify-icons/themify-icons.min.css");
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
	 * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		ThemifyIconsPageConfigurator.enabled = mustEnable;
	}
	
	/**
	 * Configures the given page for the parameters
	 *
	 * @param page The page incoming
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
