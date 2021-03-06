/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.nCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hete Statement CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ncl.nCL.HeteStatementCS#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ncl.nCL.NCLPackage#getHeteStatementCS()
 * @model
 * @generated
 */
public interface HeteStatementCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.ncl.nCL.HeteConditionCS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Conditions</em>' containment reference list.
   * @see org.xtext.example.ncl.nCL.NCLPackage#getHeteStatementCS_OwnedConditions()
   * @model containment="true"
   * @generated
   */
  EList<HeteConditionCS> getOwnedConditions();

} // HeteStatementCS
