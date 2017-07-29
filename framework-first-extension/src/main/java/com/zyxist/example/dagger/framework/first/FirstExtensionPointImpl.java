package com.zyxist.example.dagger.framework.first;

import com.zyxist.example.dagger.framework.core.api.FirstExtensionPoint;
import javax.inject.Inject;

public class FirstExtensionPointImpl implements FirstExtensionPoint {
	@Inject
	public FirstExtensionPointImpl() {
	}
	
	@Override
	public String doSomething() {
		return "work done by framework-first-extension";
	}
}
