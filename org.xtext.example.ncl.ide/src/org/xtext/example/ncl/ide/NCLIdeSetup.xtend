/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.ncl.NCLRuntimeModule
import org.xtext.example.ncl.NCLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class NCLIdeSetup extends NCLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new NCLRuntimeModule, new NCLIdeModule))
	}
	
}
