/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.ncl.nCL.HetecomCP;
import org.xtext.example.ncl.nCL.HomocomCP;
import org.xtext.example.ncl.nCL.TopLevelCP;
import org.xtext.example.ncl.services.NCLGrammarAccess;

@SuppressWarnings("all")
public class NCLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NCLGrammarAccess _nCLGrammarAccess;
  
  protected void _format(final TopLevelCP topLevelCP, @Extension final IFormattableDocument document) {
    EList<ImportCS> _ownedImports = topLevelCP.getOwnedImports();
    for (final ImportCS importCS : _ownedImports) {
      document.<ImportCS>format(importCS);
    }
    EList<HomocomCP> _ownedHomocoms = topLevelCP.getOwnedHomocoms();
    for (final HomocomCP homocomCP : _ownedHomocoms) {
      document.<HomocomCP>format(homocomCP);
    }
    EList<HetecomCP> _ownedHetecoms = topLevelCP.getOwnedHetecoms();
    for (final HetecomCP hetecomCP : _ownedHetecoms) {
      document.<HetecomCP>format(hetecomCP);
    }
  }
  
  protected void _format(final ImportCS importCS, @Extension final IFormattableDocument document) {
    document.<PathNameCS>format(importCS.getOwnedPathName());
  }
  
  public void format(final Object importCS, final IFormattableDocument document) {
    if (importCS instanceof ImportCS) {
      _format((ImportCS)importCS, document);
      return;
    } else if (importCS instanceof XtextResource) {
      _format((XtextResource)importCS, document);
      return;
    } else if (importCS instanceof TopLevelCP) {
      _format((TopLevelCP)importCS, document);
      return;
    } else if (importCS instanceof EObject) {
      _format((EObject)importCS, document);
      return;
    } else if (importCS == null) {
      _format((Void)null, document);
      return;
    } else if (importCS != null) {
      _format(importCS, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(importCS, document).toString());
    }
  }
}
