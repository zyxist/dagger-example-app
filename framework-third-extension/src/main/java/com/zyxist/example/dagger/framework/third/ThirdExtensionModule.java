package com.zyxist.example.dagger.framework.third;

import com.zyxist.example.dagger.framework.core.api.SamplePlugin;
import com.zyxist.example.dagger.framework.core.api.SecondExtensionPoint;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

/**
 * Another Dagger module - it shows, how to mix <tt>Binds</tt> and <tt>Provides</tt> annotations
 * within the same module. In the latter case, the method must be declared as static. Providing
 * gives us more control over object construction, but any changes in the number of dependencies
 * must be handled by us manually.
 */
@Module
public abstract class ThirdExtensionModule {
	@Binds
	public abstract SecondExtensionPoint bindsFirstExtension(AnotherSecondExtensionImpl impl);
	
	@Provides @IntoSet
	public static SamplePlugin providesPlugin() {
		return new SamplePluginImpl();
	}
}
