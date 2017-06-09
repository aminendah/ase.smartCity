/**
 */
package com.polimi.ase.concretesyntax.xtext.smartCity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getName <em>Name</em>}</li>
 *   <li>{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends EObject
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
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getDataSource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.polimi.ase.concretesyntax.xtext.smartCity.DataSource#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link com.polimi.ase.concretesyntax.xtext.smartCity.Data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see com.polimi.ase.concretesyntax.xtext.smartCity.SmartCityPackage#getDataSource_Data()
   * @model containment="true"
   * @generated
   */
  EList<Data> getData();

} // DataSource
