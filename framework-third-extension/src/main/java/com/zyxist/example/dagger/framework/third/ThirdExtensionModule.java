package com.zyxist.example.dagger.framework.third;

import com.zyxist.example.dagger.framework.core.api.SecondExtensionPoint;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ThirdExtensionModule {
	@Binds
	public abstract SecondExtensionPoint bindsFirstExtension(AnotherSecondExtensionImpl impl);
}
