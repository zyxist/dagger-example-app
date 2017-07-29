package com.zyxist.example.dagger.app;

import com.zyxist.example.dagger.framework.core.api.Bootstrap;
import com.zyxist.example.dagger.framework.core.di.FrameworkCoreModule;
import com.zyxist.example.dagger.framework.first.FirstExtensionModule;
import com.zyxist.example.dagger.framework.third.ThirdExtensionModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(
    modules = { ApplicationModule.class, FrameworkCoreModule.class, FirstExtensionModule.class, ThirdExtensionModule.class }
)
public interface ApplicationComponent {
	Bootstrap bootstrap();
}
