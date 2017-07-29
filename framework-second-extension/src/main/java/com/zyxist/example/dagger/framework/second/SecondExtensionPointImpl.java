package com.zyxist.example.dagger.framework.second;

import com.zyxist.example.dagger.framework.core.api.SecondExtensionPoint;
import javax.inject.Inject;

public class SecondExtensionPointImpl implements SecondExtensionPoint {
	@Inject
	public SecondExtensionPointImpl() {
	}
	
	@Override
	public String doSomething() {
		return "work done by framework-second-extension";
	}
}
