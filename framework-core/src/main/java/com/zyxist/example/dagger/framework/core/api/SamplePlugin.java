package com.zyxist.example.dagger.framework.core.api;

/**
 * A plugin is an interface which may have zero, one or multiple implementations,
 * provided by different modules. In Dagger, we'll use multibindings to register
 * new plugin implementations.
 */
public interface SamplePlugin {
	public String sayHello();
}
