package com.zyxist.example.dagger.framework.first;

import com.zyxist.example.dagger.framework.core.api.FirstExtensionPoint;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class FirstExtensionModule {
	@Binds
	public abstract FirstExtensionPoint bindsFirstExtension(FirstExtensionPointImpl impl);
}
