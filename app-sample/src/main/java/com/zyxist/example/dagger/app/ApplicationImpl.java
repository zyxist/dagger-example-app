package com.zyxist.example.dagger.app;

import com.zyxist.example.dagger.framework.core.api.ApplicationHook;
import com.zyxist.example.dagger.framework.core.api.CoreService;
import java.util.Objects;
import javax.inject.Inject;

public class ApplicationImpl implements ApplicationHook {
	private final CoreService coreService;
	
	@Inject
	public ApplicationImpl(CoreService coreService) {
		this.coreService = Objects.requireNonNull(coreService);
	}

	@Override
	public String launchApp() {
		return "My application - Dagger Hi universe! " + coreService.doSomethingInteresting()+"; random number: " + coreService.getRandomNumber();
	}
}
