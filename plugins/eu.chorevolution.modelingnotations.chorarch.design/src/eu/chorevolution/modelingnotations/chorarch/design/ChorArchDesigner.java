package eu.chorevolution.modelingnotations.chorarch.design;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ChorArchDesigner extends AbstractUIPlugin {
    // The plug-in ID
    public static final String PLUGIN_ID = "eu.chorevolution.modelingnotations.chorarch.design";

    // The shared instance
    private static ChorArchDesigner plugin;

    private static Set<Viewpoint> viewpoints; 

    /**
     * The constructor
     */
    public ChorArchDesigner() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
      super.start(context);
	  plugin = this;
	  viewpoints = new HashSet<Viewpoint>();
	  viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/chorarch.odesign")); 
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
	plugin = null;
	if (viewpoints != null) {
	    for (final Viewpoint viewpoint: viewpoints) {
		ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
	    }
	    viewpoints.clear();
	    viewpoints = null; 
	}
	super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static ChorArchDesigner getDefault() {
	return plugin;
    }
}
