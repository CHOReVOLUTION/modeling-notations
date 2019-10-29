package eu.chorevolution.modelingnotations.security.ui;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import eu.chorevolution.modelingnotations.security.SecurityPolicySet;




public class ruleAction implements IExternalJavaAction{

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		if (parameters.get("container") instanceof SecurityPolicySet)
		{
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		SecurityPolicySet diagram = (SecurityPolicySet) parameters.get("container");
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

}
