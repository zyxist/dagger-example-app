package com.zyxist.example.dagger.app;

import com.zyxist.example.dagger.framework.core.di.FrameworkComponentBase;
import com.zyxist.example.dagger.framework.core.di.FrameworkCoreModule;
import com.zyxist.example.dagger.framework.first.FirstExtensionModule;
import com.zyxist.example.dagger.framework.third.ThirdExtensionModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * In Dagger, component is a complete, scoped object graph, where all the dependencies
 * are satisfied. Because of that, it is the application which defines the components, and
 * here we can control, which modules we want to use.
 * 
 * <p>Try to replace <tt>ThirdExtensionModule</tt> with <tt>SecondExtensionModule</tt>, and
 * then run the application. You will see that the output is different. This is the true
 * power of modular design, extension points and plugins!
 */
@Singleton
@Component(
    modules = { ApplicationModule.class, FrameworkCoreModule.class, FirstExtensionModule.class, ThirdExtensionModule.class }
)
public interface ApplicationComponent extends FrameworkComponentBase {
}
