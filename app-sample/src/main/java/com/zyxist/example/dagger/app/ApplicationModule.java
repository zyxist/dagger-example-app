package com.zyxist.example.dagger.app;

import com.zyxist.example.dagger.framework.core.api.ApplicationHook;
import dagger.Binds;
import dagger.Module;

/**
 * The application has its own module, too, because we must provide some implementations
 * of framework interfaces.
 */
@Module
public abstract class ApplicationModule {
	@Binds
	public abstract ApplicationHook bindsApplicationHook(ApplicationImpl impl);
}
