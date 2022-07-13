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

import org.xtext.example.ncl.nCL.HomoStatementCS;
import org.xtext.example.ncl.nCL.HomocomCP;
import org.xtext.example.ncl.nCL.NCLPackage;
import org.xtext.example.ncl.nCL.metaModelTypeCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Homocom CP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ncl.nCL.impl.HomocomCPImpl#getOwnedMetaModels <em>Owned Meta Models</em>}</li>
 *   <li>{@link org.xtext.example.ncl.nCL.impl.HomocomCPImpl#getOwnedStatements <em>Owned Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomocomCPImpl extends MinimalEObjectImpl.Container implements HomocomCP
{
  /**
   * The cached value of the '{@link #getOwnedMetaModels() <em>Owned Meta Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedMetaModels()
   * @generated
   * @ordered
   */
  protected EList<metaModelTypeCS> ownedMetaModels;

  /**
   * The cached value of the '{@link #getOwnedStatements() <em>Owned Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedStatements()
   * @generated
   * @ordered
   */
  protected EList<HomoStatementCS> ownedStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HomocomCPImpl()
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
    return NCLPackage.Literals.HOMOCOM_CP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<metaModelTypeCS> getOwnedMetaModels()
  {
    if (ownedMetaModels == null)
    {
      ownedMetaModels = new EObjectContainmentEList<metaModelTypeCS>(metaModelTypeCS.class, this, NCLPackage.HOMOCOM_CP__OWNED_META_MODELS);
    }
    return ownedMetaModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HomoStatementCS> getOwnedStatements()
  {
    if (ownedStatements == null)
    {
      ownedStatements = new EObjectContainmentEList<HomoStatementCS>(HomoStatementCS.class, this, NCLPackage.HOMOCOM_CP__OWNED_STATEMENTS);
    }
    return ownedStatements;
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
      case NCLPackage.HOMOCOM_CP__OWNED_META_MODELS:
        return ((InternalEList<?>)getOwnedMetaModels()).basicRemove(otherEnd, msgs);
      case NCLPackage.HOMOCOM_CP__OWNED_STATEMENTS:
        return ((InternalEList<?>)getOwnedStatements()).basicRemove(otherEnd, msgs);
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
      case NCLPackage.HOMOCOM_CP__OWNED_META_MODELS:
        return getOwnedMetaModels();
      case NCLPackage.HOMOCOM_CP__OWNED_STATEMENTS:
        return getOwnedStatements();
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
      case NCLPackage.HOMOCOM_CP__OWNED_META_MODELS:
        getOwnedMetaModels().clear();
        getOwnedMetaModels().addAll((Collection<? extends metaModelTypeCS>)newValue);
        return;
      case NCLPackage.HOMOCOM_CP__OWNED_STATEMENTS:
        getOwnedStatements().clear();
        getOwnedStatements().addAll((Collection<? extends HomoStatementCS>)newValue);
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
      case NCLPackage.HOMOCOM_CP__OWNED_META_MODELS:
        getOwnedMetaModels().clear();
        return;
      case NCLPackage.HOMOCOM_CP__OWNED_STATEMENTS:
        getOwnedStatements().clear();
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
      case NCLPackage.HOMOCOM_CP__OWNED_META_MODELS:
        return ownedMetaModels != null && !ownedMetaModels.isEmpty();
      case NCLPackage.HOMOCOM_CP__OWNED_STATEMENTS:
        return ownedStatements != null && !ownedStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HomocomCPImpl