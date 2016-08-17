package com.jesper.rest.osgi.finance;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * Created by joaofilipesabinoesperancinha on 17-08-16.
 */
public class FinanceActivator implements BundleActivator {

    private ServiceRegistration registration;

    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(FinanceResource.class.getName(), new FinanceResource(), null);

    }

    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();
    }
}
