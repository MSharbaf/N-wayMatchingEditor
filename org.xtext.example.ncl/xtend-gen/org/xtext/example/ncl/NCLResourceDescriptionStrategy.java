package org.xtext.example.ncl;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.ncl.nCL.TopLevelCP;

@SuppressWarnings("all")
public class NCLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  public final static String INCLUDES = "ownedImports";
  
  @Inject
  private ImportUriResolver uriResolver;
  
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((eObject instanceof TopLevelCP)) {
      this.createEObjectDescriptionForModel(((TopLevelCP)eObject), acceptor);
      return true;
    } else {
      _xifexpression = super.createEObjectDescriptions(eObject, acceptor);
    }
    return _xifexpression;
  }
  
  public void createEObjectDescriptionForModel(final TopLevelCP model, final IAcceptor<IEObjectDescription> acceptor) {
    final ArrayList<Object> uris = CollectionLiterals.<Object>newArrayList();
    final Consumer<ImportCS> _function = (ImportCS it) -> {
      uris.add(this.uriResolver.apply(it));
    };
    model.getOwnedImports().forEach(_function);
    final HashMap<String, String> userData = new HashMap<String, String>();
    userData.put(NCLResourceDescriptionStrategy.INCLUDES, IterableExtensions.join(uris, ","));
    acceptor.accept(EObjectDescription.create(QualifiedName.create(model.eResource().getURI().toString()), model, userData));
  }
}
