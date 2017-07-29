package com.zyxist.example.dagger.framework.core.di;

import com.zyxist.example.dagger.framework.core.api.Bootstrap;
import com.zyxist.example.dagger.framework.core.api.CapitalizationService;
import com.zyxist.example.dagger.framework.core.api.CoreService;
import com.zyxist.example.dagger.framework.core.impl.BootstrapImpl;
import com.zyxist.example.dagger.framework.core.impl.CapitalizationServiceImpl;
import com.zyxist.example.dagger.framework.core.impl.CoreServiceImpl;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

/**
 * In Dagger, modules define what implementations are bound to particular interfaces. By using
 * <tt>Binds</tt> annotation, we tell Dagger to detect, how to construct a particular instance
 * automatically.
 */
@Module
public abstract class FrameworkCoreModule {
	@Binds
	@Singleton
	public abstract Bootstrap bindsBootstrap(BootstrapImpl impl);
	
	@Binds
	@Singleton
	public abstract CoreService bindsCoreService(CoreServiceImpl impl);
	
	@Binds
	@Singleton
	public abstract CapitalizationService bindsCapitalizationService(CapitalizationServiceImpl impl);
}
