package com.zyxist.example.dagger.framework.third;

import com.zyxist.example.dagger.framework.core.api.CapitalizationService;
import com.zyxist.example.dagger.framework.core.api.SecondExtensionPoint;
import java.util.Objects;
import javax.inject.Inject;

public class AnotherSecondExtensionImpl  implements SecondExtensionPoint {
	private final CapitalizationService svc;
	
	@Inject
	public AnotherSecondExtensionImpl(CapitalizationService service) {
		this.svc = Objects.requireNonNull(service);
	}
	
	
	@Override
	public String doSomething() {
		return "work done by " + svc.capitalize("framework-third-extension");
	}
}
