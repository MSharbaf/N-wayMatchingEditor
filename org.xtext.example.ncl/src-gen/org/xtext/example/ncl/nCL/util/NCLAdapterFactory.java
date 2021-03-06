/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.ncl.nCL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.ncl.nCL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.ncl.nCL.NCLPackage
 * @generated
 */
public class NCLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NCLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NCLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NCLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NCLSwitch<Adapter> modelSwitch =
    new NCLSwitch<Adapter>()
    {
      @Override
      public Adapter caseTopLevelCP(TopLevelCP object)
      {
        return createTopLevelCPAdapter();
      }
      @Override
      public Adapter caseHomocomCP(HomocomCP object)
      {
        return createHomocomCPAdapter();
      }
      @Override
      public Adapter casemetaModelTypeCS(metaModelTypeCS object)
      {
        return createmetaModelTypeCSAdapter();
      }
      @Override
      public Adapter caseHomoStatementCS(HomoStatementCS object)
      {
        return createHomoStatementCSAdapter();
      }
      @Override
      public Adapter caseHomoConditionCS(HomoConditionCS object)
      {
        return createHomoConditionCSAdapter();
      }
      @Override
      public Adapter caseHetecomCP(HetecomCP object)
      {
        return createHetecomCPAdapter();
      }
      @Override
      public Adapter caseHeteStatementCS(HeteStatementCS object)
      {
        return createHeteStatementCSAdapter();
      }
      @Override
      public Adapter caseHeteConditionCS(HeteConditionCS object)
      {
        return createHeteConditionCSAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.TopLevelCP <em>Top Level CP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.TopLevelCP
   * @generated
   */
  public Adapter createTopLevelCPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.HomocomCP <em>Homocom CP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.HomocomCP
   * @generated
   */
  public Adapter createHomocomCPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.metaModelTypeCS <em>meta Model Type CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.metaModelTypeCS
   * @generated
   */
  public Adapter createmetaModelTypeCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.HomoStatementCS <em>Homo Statement CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.HomoStatementCS
   * @generated
   */
  public Adapter createHomoStatementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.HomoConditionCS <em>Homo Condition CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.HomoConditionCS
   * @generated
   */
  public Adapter createHomoConditionCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.HetecomCP <em>Hetecom CP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.HetecomCP
   * @generated
   */
  public Adapter createHetecomCPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.HeteStatementCS <em>Hete Statement CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.HeteStatementCS
   * @generated
   */
  public Adapter createHeteStatementCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.ncl.nCL.HeteConditionCS <em>Hete Condition CS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.ncl.nCL.HeteConditionCS
   * @generated
   */
  public Adapter createHeteConditionCSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NCLAdapterFactory
