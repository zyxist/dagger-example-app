package com.zyxist.example.dagger.framework.core.di;

import com.zyxist.example.dagger.framework.core.api.Bootstrap;

/**
 * The framework usually cannot contain actual Dagger components, because a component must contain
 * all the necessary implementations for every injected interface. In our example, we use the interface
 * {@link com.zyxist.example.dagger.framework.core.api.ApplicationHook}, but its implementation
 * must be provided by application.
 * 
 * <p>The Dagger component must be created by the application - what we can do is to provide
 * a base interface that defines all the necessary object graph roots.
 */
public interface FrameworkComponentBase {
	Bootstrap bootstrap();
}
