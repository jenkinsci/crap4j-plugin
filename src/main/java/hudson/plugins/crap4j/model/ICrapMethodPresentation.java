package hudson.plugins.crap4j.model;

import hudson.model.Run;

import java.util.Collection;

public interface ICrapMethodPresentation {
	
	public Run<?, ?> getOwner();

	public String getTitle();
	
	public Collection<IMethodCrap> getMethods();
}
