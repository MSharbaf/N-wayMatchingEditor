/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.nCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Homo Condition CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ncl.nCL.HomoConditionCS#getOwnedElementA <em>Owned Element A</em>}</li>
 *   <li>{@link org.xtext.example.ncl.nCL.HomoConditionCS#getOwnedElementB <em>Owned Element B</em>}</li>
 *   <li>{@link org.xtext.example.ncl.nCL.HomoConditionCS#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ncl.nCL.NCLPackage#getHomoConditionCS()
 * @model
 * @generated
 */
public interface HomoConditionCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Element A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Element A</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Element A</em>' attribute.
   * @see #setOwnedElementA(String)
   * @see org.xtext.example.ncl.nCL.NCLPackage#getHomoConditionCS_OwnedElementA()
   * @model
   * @generated
   */
  String getOwnedElementA();

  /**
   * Sets the value of the '{@link org.xtext.example.ncl.nCL.HomoConditionCS#getOwnedElementA <em>Owned Element A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Element A</em>' attribute.
   * @see #getOwnedElementA()
   * @generated
   */
  void setOwnedElementA(String value);

  /**
   * Returns the value of the '<em><b>Owned Element B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Element B</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Element B</em>' attribute.
   * @see #setOwnedElementB(String)
   * @see org.xtext.example.ncl.nCL.NCLPackage#getHomoConditionCS_OwnedElementB()
   * @model
   * @generated
   */
  String getOwnedElementB();

  /**
   * Sets the value of the '{@link org.xtext.example.ncl.nCL.HomoConditionCS#getOwnedElementB <em>Owned Element B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Element B</em>' attribute.
   * @see #getOwnedElementB()
   * @generated
   */
  void setOwnedElementB(String value);

  /**
   * Returns the value of the '<em><b>Owned Element</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Element</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Element</em>' attribute list.
   * @see org.xtext.example.ncl.nCL.NCLPackage#getHomoConditionCS_OwnedElement()
   * @model unique="false"
   * @generated
   */
  EList<String> getOwnedElement();

} // HomoConditionCS
