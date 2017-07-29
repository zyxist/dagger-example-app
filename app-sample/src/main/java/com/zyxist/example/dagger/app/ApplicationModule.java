package com.zyxist.example.dagger.app;

import com.zyxist.example.dagger.framework.core.api.ApplicationHook;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ApplicationModule {
	@Binds
	public abstract ApplicationHook bindsApplicationHook(ApplicationImpl impl);
}
