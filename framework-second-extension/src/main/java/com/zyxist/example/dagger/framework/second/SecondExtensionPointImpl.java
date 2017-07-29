package com.zyxist.example.dagger.framework.second;

import com.zyxist.example.dagger.framework.core.api.SecondExtensionPoint;

public class SecondExtensionPointImpl implements SecondExtensionPoint {
	@Override
	public String doSomething() {
		return "work done by framework-second-extension";
	}
}
