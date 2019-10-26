package com.jwebmp.plugins.themify.icons.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ThemifyIconsExclusionsModule
		implements IGuiceScanModuleExclusions<ThemifyIconsExclusionsModule>,
				           IGuiceScanJarExclusions<ThemifyIconsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-themify-icons-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.themify.icons");
		return strings;
	}
}
