/*
 * generated by Xtext
 */
package com.polimi.ase.concretesyntax.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.polimi.ase.concretesyntax.xtext.ui.internal.SmartCityActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmartCityExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SmartCityActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SmartCityActivator.getInstance().getInjector(SmartCityActivator.COM_POLIMI_ASE_CONCRETESYNTAX_XTEXT_SMARTCITY);
	}
	
}
