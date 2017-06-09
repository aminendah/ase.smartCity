/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity.impl;

import com.polimi.ase.concretesyntax.xtext.smartCity.DataSource;
import com.polimi.ase.concretesyntax.xtext.smartCity.Provider;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity;
import com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.impl.SmartCityImpl#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartCityImpl extends MinimalEObjectImpl.Container implements SmartCity
{
  /**
   * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviders()
   * @generated
   * @ordered
   */
  protected EList<Provider> providers;

  /**
   * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSources()
   * @generated
   * @ordered
   */
  protected EList<DataSource> dataSources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmartCityImpl()
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
    return SmartCityPackage.Literals.SMART_CITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Provider> getProviders()
  {
    if (providers == null)
    {
      providers = new EObjectContainmentEList<Provider>(Provider.class, this, SmartCityPackage.SMART_CITY__PROVIDERS);
    }
    return providers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataSource> getDataSources()
  {
    if (dataSources == null)
    {
      dataSources = new EObjectContainmentEList<DataSource>(DataSource.class, this, SmartCityPackage.SMART_CITY__DATA_SOURCES);
    }
    return dataSources;
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
      case SmartCityPackage.SMART_CITY__PROVIDERS:
        return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
      case SmartCityPackage.SMART_CITY__DATA_SOURCES:
        return ((InternalEList<?>)getDataSources()).basicRemove(otherEnd, msgs);
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
      case SmartCityPackage.SMART_CITY__PROVIDERS:
        return getProviders();
      case SmartCityPackage.SMART_CITY__DATA_SOURCES:
        return getDataSources();
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
      case SmartCityPackage.SMART_CITY__PROVIDERS:
        getProviders().clear();
        getProviders().addAll((Collection<? extends Provider>)newValue);
        return;
      case SmartCityPackage.SMART_CITY__DATA_SOURCES:
        getDataSources().clear();
        getDataSources().addAll((Collection<? extends DataSource>)newValue);
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
      case SmartCityPackage.SMART_CITY__PROVIDERS:
        getProviders().clear();
        return;
      case SmartCityPackage.SMART_CITY__DATA_SOURCES:
        getDataSources().clear();
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
      case SmartCityPackage.SMART_CITY__PROVIDERS:
        return providers != null && !providers.isEmpty();
      case SmartCityPackage.SMART_CITY__DATA_SOURCES:
        return dataSources != null && !dataSources.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SmartCityImpl
