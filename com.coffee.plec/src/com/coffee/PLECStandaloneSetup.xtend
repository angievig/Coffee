/*
 * generated by Xtext 2.12.0
 */
package com.coffee


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PLECStandaloneSetup extends PLECStandaloneSetupGenerated {

	def static void doSetup() {
		new PLECStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
