package com.jwebmp.plugins.themify.icons;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;

/**
 * Creates a span that will contain this icon as a class name
 */
public class ThemifyIcon
		extends Span<GlobalChildren, NoAttributes, ThemifyIcon>
{
	/**
	 * Creates the span for the given icon
	 *
	 * @param icon
	 * 		The icon to use
	 */
	public ThemifyIcon(ThemifyIcons icon)
	{
		this();
		addClass(icon);
	}

	/**
	 * Creates an empty span with no icon, use the other constructor
	 */
	public ThemifyIcon()
	{
	}
}
