package hudson.plugins.crap4j;

import hudson.model.Run;
import hudson.model.AbstractBuild;
import hudson.plugins.crap4j.display.AbstractCrapMethodPresentation;
import hudson.plugins.crap4j.model.IMethodCrap;

public class FixedCrapMethodsResult extends AbstractCrapMethodPresentation {

	private final IMethodCrap[] methods;

	public FixedCrapMethodsResult(Run<?, ?> owner,
			IMethodCrap... methods) {
		super(owner, "Fixed Crap Methods for " + owner.getDisplayName());
		this.methods = methods;
	}
	
	@Override
	protected IMethodCrap[] loadMethods() {
		return this.methods;
	}
}
