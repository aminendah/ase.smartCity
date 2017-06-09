/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity#getProviders <em>Providers</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.SmartCity#getDataSources <em>Data Sources</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getSmartCity()
 * @model
 * @generated
 */
public interface SmartCity extends EObject
{
  /**
   * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Providers</em>' containment reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getSmartCity_Providers()
   * @model containment="true"
   * @generated
   */
  EList<Provider> getProviders();

  /**
   * Returns the value of the '<em><b>Data Sources</b></em>' containment reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Sources</em>' containment reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getSmartCity_DataSources()
   * @model containment="true"
   * @generated
   */
  EList<DataSource> getDataSources();

} // SmartCity
