package org.xtext.example.ncl

import com.google.inject.Inject
import java.util.HashMap
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.impl.ImportUriResolver
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.emf.ecore.EObject
//import org.eclipse.ocl.xtext.completeoclcs.CompleteOCLDocumentCS
import org.xtext.example.ncl.nCL.TopLevelCP

class NCLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	public static final String INCLUDES = "ownedImports"
	@Inject
	ImportUriResolver uriResolver

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		
		if(eObject instanceof TopLevelCP){
			this.createEObjectDescriptionForModel(eObject, acceptor)
			return true
		}
		else {
			super.createEObjectDescriptions(eObject, acceptor)
		}
	}

	def void createEObjectDescriptionForModel(TopLevelCP model, IAcceptor<IEObjectDescription> acceptor) {
		val uris = newArrayList()
		model.ownedImports.forEach[uris.add(uriResolver.apply(it))]
		val userData = new HashMap<String,String>
		userData.put(INCLUDES, uris.join(","))
		acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource.URI.toString), model, userData))
	}
}


