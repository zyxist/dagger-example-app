package com.zyxist.example.dagger.framework.second;

import com.zyxist.example.dagger.framework.core.api.SecondExtensionPoint;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class SecondExtensionModule {
	@Binds
	public abstract SecondExtensionPoint bindsFirstExtension(SecondExtensionPointImpl impl);
}
