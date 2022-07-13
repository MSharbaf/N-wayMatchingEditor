/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.nCL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.ncl.nCL.HeteConditionCS;
import org.xtext.example.ncl.nCL.HeteStatementCS;
import org.xtext.example.ncl.nCL.NCLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hete Statement CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ncl.nCL.impl.HeteStatementCSImpl#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeteStatementCSImpl extends MinimalEObjectImpl.Container implements HeteStatementCS
{
  /**
   * The cached value of the '{@link #getOwnedConditions() <em>Owned Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedConditions()
   * @generated
   * @ordered
   */
  protected EList<HeteConditionCS> ownedConditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HeteStatementCSImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NCLPackage.Literals.HETE_STATEMENT_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HeteConditionCS> getOwnedConditions()
  {
    if (ownedConditions == null)
    {
      ownedConditions = new EObjectContainmentEList<HeteConditionCS>(HeteConditionCS.class, this, NCLPackage.HETE_STATEMENT_CS__OWNED_CONDITIONS);
    }
    return ownedConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NCLPackage.HETE_STATEMENT_CS__OWNED_CONDITIONS:
        return ((InternalEList<?>)getOwnedConditions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NCLPackage.HETE_STATEMENT_CS__OWNED_CONDITIONS:
        return getOwnedConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NCLPackage.HETE_STATEMENT_CS__OWNED_CONDITIONS:
        getOwnedConditions().clear();
        getOwnedConditions().addAll((Collection<? extends HeteConditionCS>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NCLPackage.HETE_STATEMENT_CS__OWNED_CONDITIONS:
        getOwnedConditions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NCLPackage.HETE_STATEMENT_CS__OWNED_CONDITIONS:
        return ownedConditions != null && !ownedConditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HeteStatementCSImpl
