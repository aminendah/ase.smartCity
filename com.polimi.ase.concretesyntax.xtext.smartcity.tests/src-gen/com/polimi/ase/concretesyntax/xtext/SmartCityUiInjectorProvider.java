/*
* generated by Xtext
*/
package com.polimi.ase.concretesyntax.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SmartCityUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.polimi.ase.concretesyntax.xtext.ui.internal.SmartCityActivator.getInstance().getInjector("com.polimi.ase.concretesyntax.xtext.SmartCity");
	}
	
}