package com.zyxist.example.dagger.framework.first;

import com.zyxist.example.dagger.framework.core.api.SamplePlugin;

public class SamplePluginImpl implements SamplePlugin {
	@Override
	public String sayHello() {
		return "plugin from framework-first-extension";
	}
}

