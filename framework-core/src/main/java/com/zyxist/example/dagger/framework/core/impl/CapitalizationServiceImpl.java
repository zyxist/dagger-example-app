package com.zyxist.example.dagger.framework.core.impl;

import com.zyxist.example.dagger.framework.core.api.CapitalizationService;
import javax.inject.Inject;

public class CapitalizationServiceImpl implements CapitalizationService {
	@Inject
	public CapitalizationServiceImpl() {
	}
	
	@Override
	public String capitalize(String text) {
		return text.toUpperCase();
	}
}
