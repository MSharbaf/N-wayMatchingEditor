/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.xtext.essentialocl.validation.EssentialOCLJavaValidator;

public abstract class AbstractNCLValidator extends EssentialOCLJavaValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(org.xtext.example.ncl.nCL.NCLPackage.eINSTANCE);
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/ocl/2015/BaseCS"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/ocl/2015/EssentialOCLCS"));
		return result;
	}
}
