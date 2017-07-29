package com.zyxist.example.dagger.framework.core.impl;

import com.zyxist.example.dagger.framework.core.api.ApplicationHook;
import com.zyxist.example.dagger.framework.core.api.Bootstrap;
import com.zyxist.example.dagger.framework.core.api.FirstExtensionPoint;
import java.util.Objects;
import javax.inject.Inject;

/**
 * If the framework provides an entry point for bootstraping the application, this is the
 * good place to start.
 */
public class BootstrapImpl implements Bootstrap {
	private final FirstExtensionPoint extPoint;
	private final ApplicationHook hook;
	
	@Inject
	public BootstrapImpl(ApplicationHook hook, FirstExtensionPoint extPoint) {
		this.hook = Objects.requireNonNull(hook);
		this.extPoint = Objects.requireNonNull(extPoint);
	}
	
	@Override
	public void execute() {
		System.out.println("Executing first extension point: " + extPoint.doSomething());
		System.out.println("Executing application: " + hook.launchApp());
	}
}
