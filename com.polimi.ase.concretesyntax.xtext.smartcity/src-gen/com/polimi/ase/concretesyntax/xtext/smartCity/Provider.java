/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getName <em>Name</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getProvider_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.Provider#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sources</b></em>' reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sources</em>' reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getProvider_Sources()
   * @model
   * @generated
   */
  EList<DataSource> getSources();

} // Provider
