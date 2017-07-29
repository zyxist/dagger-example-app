package com.zyxist.example.dagger.framework.third;

import com.zyxist.example.dagger.framework.core.api.SamplePlugin;

public class SamplePluginImpl implements SamplePlugin {
	@Override
	public String sayHello() {
		return "plugin from framework-third-extension";
	}
}
